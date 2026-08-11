package world;
import utils.Data_types.Point;
    
public class Dungeon{
    private int current_room;
    /* 
    3 --- 2 --- 6
            |     | --- 7
    4 --- 1 --- 5
    */
    private Room room = new Room();
    private int[][] map;

    public void change_map(int newRoomId)
    {
        map = room.getMap(newRoomId);
        current_room = newRoomId;
    }


    public void update_player_position(Point position) {
        map[position.getY()][position.getX()] = 2;
    }

    public void reset_map() {
        map = room.getMap(current_room);
    }

    public void printMap(){
            for (int h = 0; h < map.length; h++) {
                for (int w = 0; w < map[0].length; w++) {
                    switch (map[h][w]) {
                        case 0: System.out.print("__ "); break;
                        case 1: System.out.print("## "); break;
                        case 2: System.out.print("00 "); break;
                        case 3: System.out.print("XX "); break;
                        default: break;
                    }
                }
        
                System.out.println();
            }
    }
}