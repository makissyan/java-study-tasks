import com.makofon.chatstructure.client.RoomMngr;
import com.makofon.chatstructure.client.UserCl;
//Just for tests
public class Main {
    public static void main(String[] args) {
        RoomMngr roomManager = new RoomMngr();

        UserCl user1 = new UserCl("Bob", 22);
        UserCl user2 = new UserCl("Ron", 30);
        UserCl user3 = new UserCl("Ben", 32);

        user1.addUserRoom(roomManager.createRoom(user2, user3));
        roomManager.printUserRooms(user1);
    }
}