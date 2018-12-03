package com.makofon.chatstructure.client;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

//Class for room management-functions. All of these functions should be boolean, and success of their
//executing should depend on server's response
public class RoomMngr {
    private RoomCl tempRoom = new RoomCl();
    private TreeMap<String, List<UserCl>> tempRoomList;
    private List<RoomCl> tempRoomsList = new ArrayList<RoomCl>();

    //creating a room.
    //to implement if only one user chosen - createRoom(User user.getNickname, User user)
    public RoomCl createRoom(String groupName, UserCl... user) {
        return new RoomCl(groupName, user);
    }
    //Feeling guilty for such function implementation...
    //Should be 2 separate function - printUserRooms and printRoomParticipant.
    public void printUserRooms(UserCl user) {
        //getting quantity of rooms and iterating by each
        for (int i = 0; i < user.getUserRooms().size(); i++) {
            tempRoom = user.getUserRooms().get(i);
            //iterating by each key
            for (String key : tempRoom.getUserRoom().keySet()) {
                System.out.println(key+":");
                //iterating by users
                for (int x = 0; x < tempRoom.getUserRoom().get(key).size(); x++)
                    System.out.println(("\t"+tempRoom.getUserRoom().get(key).get(x).getNickname()));
            }
        }
    }
    //to implement...
    public boolean deleteRoom(UserCl user, String key){

         return true;
    }

    //to implement sendMessage function
}

