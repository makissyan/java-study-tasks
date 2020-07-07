package org.maksym.springBasics;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<IMusic> musicList = new ArrayList<>();

    private String name;
    private int volume;

    public List<IMusic> getMusic() {
        return musicList;
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

    public MusicPlayer() {
    }

    public void setMusic(List<IMusic> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        for (IMusic music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }
}
