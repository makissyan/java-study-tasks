package com.makofon.chatstructure.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class RoomCl {

    private Map<String, List<UserCl>> userRoom = new TreeMap<String, List<UserCl>>();

    public RoomCl(String name, UserCl... user) {
        List<UserCl> users = new ArrayList<UserCl>();
        for (UserCl newUser : user) {
            users.add(newUser);
        }
        userRoom.put(name, users);
    }

    public RoomCl() {

    }

    public Map<String, List<UserCl>> getRooms() {
        return userRoom;
    }

}
