package task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(2, 3);
        Room room2 = new Room(4, 6);
        Room room3 = new Room(4, 5);

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);


        Building normalBuilding = new Building(rooms, 3);

        System.out.println("Building has " + normalBuilding.getNumberOfFloors() + " floors.");
        System.out.println("Is this building normal? = " + isNormal(normalBuilding));



        for (Room room : normalBuilding.getRooms()) {
            System.out.println("Room with " + room.getNumberOfLamps() + " lamps and " + room.getNumberOfWindows() + " windows.");
        }

        int totalLamps = countLampsInBuilding(normalBuilding);
        int totalWindows = countWindowsInBuilding(normalBuilding);
        int totalRooms = countRoomsInBuilding(normalBuilding);

        System.out.println("Total number of lamps: " + totalLamps);


    }

    public static int countLampsInBuilding(Building building) {
        int totalLamps = 0;

        for (Room room : building.getRooms()) {
            totalLamps += room.getNumberOfLamps();
        }
        return totalLamps;
    }

    public static int countWindowsInBuilding(Building building) {
        int totalWindows = 0;
        for (Room room : building.getRooms()) {
            totalWindows += room.getNumberOfWindows();
        }
        return totalWindows;
    }

    public static int countRoomsInBuilding(Building building) {
        int totalRooms = 0;
        return building.getRooms().size();
    }

    public static boolean isNormal(Building building) {
        int numberOfFloors = building.getNumberOfFloors();
        int numberOfRooms = countRoomsInBuilding(building);

        if (numberOfFloors >= numberOfRooms) {

            return true;



        } else {

            return false;
        }
    }
}



