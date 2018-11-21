package com.makofon.chatstructure.client;

public class UserCl {
    private String nickname;
    private int age;

    public UserCl(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

}
