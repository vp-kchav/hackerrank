package job.karat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/*
You are with your friends in a castle, where there are multiple rooms named after flowers. Some of the rooms contain treasures - we call them the treasure rooms.

Each room contains a single instruction that tells you which room to go to next.

Z---
    |
    X (valid answer) =====> T (treasure)
    |
    |
    |
Y----

 *** instructions_1 ***

 lily ---------     daisy  sunflower
               |       |     |
               v       v     v
 jasmin ->  tulip      violet    -> rose --->
            ^    |      ^             ^     |
            |    |      |             |     |
            ------    iris            -------

This is given as a list of pairs of (source_room, destination_room)

instructions_1 = [
    ["jasmin", "tulip"],
    ["lily", "tulip"],
    ["tulip", "tulip"],
    ["rose", "rose"],
    ["violet", "rose"],
    ["sunflower", "violet"],
    ["daisy", "violet"],
    ["iris", "violet"]
]
treasure_rooms_1 = ["lily", "tulip", "violet", "rose"]


Write a function that takes two parameters as input:
* a list containing the treasure rooms, and
* a list of instructions represented as pairs of (source_room, destination_room)

and returns a collection of all the rooms that satisfy the following two conditions:

* at least two *other* rooms have instructions pointing to this room
* this room's instruction immediately points to a treasure room


Z---
    |
    X =====> T (treasure)
    |
    |
    |
Y----
treasure_rooms_1 = ["lily", "tulip", "violet", "rose"]

filter_rooms(treasure_rooms_1, instructions_1) => ["tulip", "violet"]
* tulip can be accessed from rooms lily and jasmin. Tulip's instruction points to a treasure room (tulip itself)
* violet can be accessed from daisy, sunflower and iris. Violet's instruction points to a treasure room (rose)

Additional inputs

treasure_rooms_2 = ["lily", "jasmin", "violet"]

filter_rooms(treasure_rooms_2, instructions_1) => []
* none of the rooms reachable from tulip or violet are treasure rooms

 *** instructions_2 ***

 lily --------             ------
               |          |      |
               v          v      |
 jasmin ->  tulip -- > violet ---^

instructions_2 = [
    ["jasmin", "tulip"],
    ["lily", "tulip"],
    ["tulip", "violet"],
    ["violet", "violet"]
]

treasure_rooms_3 = ["violet"]

filter_rooms(treasure_rooms_3, instructions_2) => [tulip]
* tulip can be accessed from rooms lily and jasmin. Tulip's instruction points to a treasure room (violet)

All the test cases:
filter_rooms(treasure_rooms_1, instructions_1)    => ["tulip", "violet"]
filter_rooms(treasure_rooms_2, instructions_1)    => []
filter_rooms(treasure_rooms_3, instructions_2)    => [tulip]

Complexity Analysis variables:
T: number of treasure rooms
I: number of instructions given
*/
public class TreasureRoom {
    public static void main(String[] argv) {
        String[][] instructions_1 = {
                {"jasmin", "tulip"},
                {"lily", "tulip"},
                {"tulip", "tulip"},
                {"rose", "rose"},
                {"violet", "rose"},
                {"sunflower", "violet"},
                {"daisy", "violet"},
                {"iris", "violet"}
        };

        String[][] instructions_2 = {
                {"jasmin", "tulip"},
                {"lily", "tulip"},
                {"tulip", "violet"},
                {"violet", "violet"}
        };

        String[] treasure_rooms_1 = {"lily", "tulip", "violet", "rose"};
        String[] treasure_rooms_2 = {"lily", "jasmin", "violet"};
        String[] treasure_rooms_3 = {"violet"};

        System.out.println(findRoom(instructions_1,treasure_rooms_1));
        System.out.println(findRoom(instructions_2,treasure_rooms_2));

    }

    public static List<String> findRoom( String[][] instructions, String[] treasure_rooms) {
        List<String> result = new ArrayList<>();
        Set<String> allRooms = new HashSet<>();
        //get all room available
        for(int i=0; i<instructions.length ; i++){
            for (int j = 0; j<instructions[i].length; j++){
                allRooms.add(instructions[i][j]);
            }
        }
        //loop all room
        for(String room : allRooms) {
            boolean firstCondition = false;
            int count= 0;
            //condition if it point to treasureroom
            for(int i=0; i<instructions.length; i++) {
                if(instructions[i][1] == room && instructions[i][0] != room) count++;
                if(instructions[i][0] == room && Arrays.asList(treasure_rooms).contains(instructions[i][1])) {
                    firstCondition = true;
                }
            }
            if(count >= 2 && firstCondition == true) result.add(room);
        }
        return result;
    }
}
