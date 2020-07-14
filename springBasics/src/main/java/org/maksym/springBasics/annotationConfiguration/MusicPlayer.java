package org.maksym.springBasics.annotationConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    //    @Qualifier("popMusic")
//    @Autowired
    //can be done with field (even private)
    private IMusic music;
    private String name;
    private int volume;

    //can be done with constructor
    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") IMusic music,
                       @Value("${name}") String name,
                       @Value("${volume}") int volume) {
        this.music = music;
        this.name = name;
        this.volume = volume;
    }


    public String playMusic() {
        return (String.format("\t%s\n\tPlaying: %s\n\tVolume: %s",
                name,
                music.getSong(),
                volume
        ));
    }

    public IMusic getMusic() {
        return music;
    }

    //can be done with setter
//    @Autowired
    public void setMusic(IMusic music) {
        this.music = music;
    }
}
