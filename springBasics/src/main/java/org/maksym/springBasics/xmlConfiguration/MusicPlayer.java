package org.maksym.springBasics.xmlConfiguration;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private List<IMusic> musicList = new ArrayList<>();

    private String name;
    private int volume;

    private MusicPlayer(){};

    public List<IMusic> getMusic() {
        return musicList;
    }

    public static MusicPlayer getMusicPlayer(){
        System.out.println("\tthis is factory method\n");
        return new MusicPlayer();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer(List<IMusic> musicList) {
        this.musicList = musicList;
    }

    public void setMusic(List<IMusic> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        for (IMusic music : musicList) {
            System.out.println("\tPlaying: " + music.getSong());
        }
    }

    //can be any access modifier
    //can be any name
    //usually void as can't returned value can't be get
    // can't take input arguments
    public void myInitMethod(){
        System.out.println("Doing my init method\n\n\n");
    }

    //same as in init method
    //if beans are prototype - destroy won't be run
    public void myDestroyMethod(){
        System.out.println("\n\n\nDoing my destroy method");
    }

}
