import entities.Player;
import utils.Data_types.Point;
import world.Dungeon;
public class game
{
  public void start(){
    Player player = new Player(100, 10, 10, new Point(0, 0));

    Dungeon dungeon = new Dungeon();
    
    
    System.out.println("Game started");
    
  }
}