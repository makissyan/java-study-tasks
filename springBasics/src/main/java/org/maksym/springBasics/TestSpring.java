package org.maksym.springBasics;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = xmlApplicationContext.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getVolume());

        xmlApplicationContext.close();
    }
}
