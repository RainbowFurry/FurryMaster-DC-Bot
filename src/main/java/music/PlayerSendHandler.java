package music;

import com.sedmelluq.discord.lavaplayer.player.AudioPlayer;
import com.sedmelluq.discord.lavaplayer.track.playback.AudioFrame;
import net.dv8tion.jda.api.audio.AudioSendHandler;

import java.nio.ByteBuffer;

public class PlayerSendHandler implements AudioSendHandler {

    private final AudioPlayer audioPlayer;
    private AudioFrame audioFrame;

    public PlayerSendHandler(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public boolean canProvide() {
        if (audioFrame == null) {
            audioFrame = audioPlayer.provide();
        }
        return audioFrame != null;
    }

    @Override
    public ByteBuffer provide20MsAudio() {
        if (audioFrame == null) {
            audioFrame = audioPlayer.provide();
        }
        byte[] data = audioFrame != null ? audioFrame.getData() : null;
        audioFrame = null;
        return ByteBuffer.wrap(data != null ? data : new byte[0]);
    }

    @Override
    public boolean isOpus() {
        return true;
    }
}