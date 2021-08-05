package music;

import com.sedmelluq.discord.lavaplayer.player.AudioPlayer;
import com.sedmelluq.discord.lavaplayer.player.event.AudioEventAdapter;
import com.sedmelluq.discord.lavaplayer.track.AudioTrack;
import com.sedmelluq.discord.lavaplayer.track.AudioTrackEndReason;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.GuildVoiceState;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.VoiceChannel;
import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.stream.Collectors;

public class TrackManager extends AudioEventAdapter {

    private final AudioPlayer audioPlayer;
    private final Queue<AudioInfo> audioInfoQueue;

    public TrackManager(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
        this.audioInfoQueue = new LinkedBlockingQueue<>();
    }

    public void queue(AudioTrack track, Member author, Guild guild) {
        AudioInfo info = new AudioInfo(track, author, guild);
        audioInfoQueue.add(info);
        if (audioPlayer.getPlayingTrack() == null) {
            audioPlayer.playTrack(track);
        }
    }

    @Override
    public void onTrackStart(AudioPlayer player, AudioTrack track) {
        AudioInfo info = audioInfoQueue.element();
        List<GuildVoiceState> voiceStates = info.getGuild().getVoiceStates().stream().filter(guildVoiceState -> guildVoiceState.getMember().equals(info.getAUTHOR())).collect(Collectors.toList());
        if(voiceStates.isEmpty())
            return;
        VoiceChannel vChan = voiceStates.stream().findFirst().get().getChannel();
        if (vChan == null) {
            player.stopTrack();
        } else {
            info.getGuild().getAudioManager().openAudioConnection(vChan);
        }
    }

    @Override
    public void onTrackEnd(AudioPlayer player, AudioTrack track, AudioTrackEndReason endReason) {
        try {
            Guild g = audioInfoQueue.poll().getGuild();
            if (audioInfoQueue.isEmpty()) {
                new Timer().schedule(new TimerTask() {
                    @Override
                    public void run() {
                        g.getAudioManager().closeAudioConnection();
                    }
                }, 500);
            } else {
                player.playTrack(audioInfoQueue.element().getTRACK());
            }
        } catch (Exception ignored) {
        }
    }

    public void shuffleQueue() {
        List<AudioInfo> tQueue = new ArrayList<>(getQueuedTracks());
        AudioInfo current = tQueue.get(0);
        tQueue.remove(0);
        Collections.shuffle(tQueue);
        tQueue.add(0, current);
        purgeQueue();
        audioInfoQueue.addAll(tQueue);
    }

    public Set<AudioInfo> getQueuedTracks() {
        return new LinkedHashSet<>(audioInfoQueue);
    }

    public void purgeQueue() {
        audioInfoQueue.clear();
    }

    public AudioInfo getTrackInfo(AudioTrack track) {
        return audioInfoQueue.stream().filter(audioInfo -> audioInfo.getTRACK().equals(track)).findFirst().orElse(null);
    }

}