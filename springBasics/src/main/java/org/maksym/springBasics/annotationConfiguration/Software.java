package org.maksym.springBasics.annotationConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Software {
    private int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Software(MusicPlayer musicPlayer) {
        id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return String.format("Software id: %s\n%s\n\n%s\n\n", id, musicPlayer.playMusic(), this.hashCode());

    }

    @PostConstruct
    private void initMethod(){
        System.out.println("Doing init method\n\n");
    }

    @PreDestroy
    private void destroyMethod(){
        System.out.println("Doing destroy method\n");
    }

}
