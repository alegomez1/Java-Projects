package Room;

import java.util.Scanner;

public class RoomMain {
     static RoomConstructor room = new RoomConstructor();


    public static void main(String[] args) {

        room.askForWalls();
        System.out.println(room.getTotalSurfaceArea());
        room.gallonsNeeded();



    }


}
