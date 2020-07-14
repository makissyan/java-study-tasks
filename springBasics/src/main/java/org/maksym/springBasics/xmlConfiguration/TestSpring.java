package org.maksym.springBasics.xmlConfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("xmlApplicationContext.xml");

        MusicPlayer musicPlayer = xmlApplicationContext.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println("Volume: " + musicPlayer.getVolume());
        musicPlayer.playMusic();

        xmlApplicationContext.close();
    }
}
