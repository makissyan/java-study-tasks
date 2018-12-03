package com.makofon.chatstructure.client;

import java.util.ArrayList;
import java.util.List;

public class UserCl {
    private String nickname;
    private int age;
    private List<RoomCl> userRooms = new ArrayList<RoomCl>();

    public UserCl(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserCl getUser(){
        return this;
    }

    public void addUserRoom(RoomCl room){
        userRooms.add(room);
    }

    public List<RoomCl> getUserRooms(){
        return userRooms;
    }

    public void printUserRooms(){
        for (RoomCl room : userRooms)
            System.out.println(room.toString());

    }
    public void updateUserRooms(List<RoomCl> updatedRooms){
        userRooms = updatedRooms;
    }
}
