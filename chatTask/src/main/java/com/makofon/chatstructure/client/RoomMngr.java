package com.makofon.chatstructure.client;

import org.apache.log4j.Logger;

import java.util.List;
import java.util.TreeMap;

//Class for room management-functions. All of these functions should be boolean, and success of their
//executing should depend on server's response
public class RoomMngr {
    private RoomCl tempRoom = new RoomCl();
    private TreeMap<String, List<UserCl>> tempRoomList;
    private Logger log = Logger.getLogger(getClass());


    //creating a room with multiple users
    public RoomCl createRoom(String groupName, UserCl... user) {
        log.debug("Room with multiple users created");
        return new RoomCl(groupName, user);
    }

    //creating a room with one user
    public RoomCl createRoom(UserCl user) {
        log.debug("Room with one user created");
        return new RoomCl(user.getNickname(), user);
    }

    //Feeling guilty for such function implementation...
    public void printUserRooms(UserCl user) {
        System.out.println();
        //getting quantity of rooms and iterating by each
        for (int i = 0; i < user.getUserRooms().size(); i++) {
            tempRoom = user.getUserRooms().get(i);
            //iterating by each key
            for (String key : tempRoom.getRooms().keySet()) {
                System.out.println(key + ":");
                //iterating by users
                for (int x = 0; x < tempRoom.getRooms().get(key).size(); x++)
                    System.out.println(("\t" + tempRoom.getRooms().get(key).get(x).getNickname()));
            }
        }
    }

    public boolean deleteRoom(UserCl user, String key) {
        for (int i = 0; i < user.getUserRooms().size(); i++) {
            if (user.getUserRooms().get(i).getRooms().containsKey(key)) {
                user.getUserRooms().get(i).getRooms().remove(key);
                log.debug("Room deleted");
                return true;
            }

        }
        log.debug("Room couldn't be found");
        return false;
    }

}

//to ask:
//Interface... need to return string with json...but impossible to create method with parameters
// how to assign room for each user
// how to depending on server's response return true or false
