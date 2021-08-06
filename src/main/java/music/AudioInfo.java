package music;

import com.sedmelluq.discord.lavaplayer.track.AudioTrack;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Member;

public class AudioInfo {

    private final AudioTrack TRACK;
    private  final Member AUTHOR;
    private final Guild guild;

    AudioInfo(AudioTrack track, Member author, Guild guild){
        this.TRACK = track;
        this.AUTHOR = author;
        this.guild = guild;
    }

    public AudioTrack getTRACK(){
        return TRACK;
    }

    public Member getAUTHOR(){
        return AUTHOR;
    }

    public Guild getGuild() {
        return guild;
    }
}