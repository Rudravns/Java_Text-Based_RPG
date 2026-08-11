import entities.Player;
import java.util.*;
import utils.Data_types.Point;
import world.Dungeon;

public class Game {

    Dungeon dungeon;
    Player player;
    Scanner scanner = new Scanner(System.in);

    public void start() {
        player = new Player(100, 10, 10, new Point(5, 5));
        dungeon = new Dungeon();
        dungeon.change_map(1);
            
        System.out.println("Game started");
    }

    public void run() {
        while (true) {
            clearConsole();
            
            dungeon.reset_map();
            dungeon.update_player_position(player.getPosition());

            dungeon.printMap();

            System.out.print("Enter command: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("quit") || input.equalsIgnoreCase("exit") || input.equalsIgnoreCase("q")) {
                System.out.println("Thanks for playing!");
                break;
            }

            switch (input.toLowerCase()) {
                case "a":
                    // TODO: Handle w, a, s, d
                    player.move(-1, 0);
                    break;

                case "d":
                    player.move(1, 0);
                    break;
                
                case "w":
                    player.move(0, -1);
                    break;
                
                case "s":
                    player.move(0, 1);
                    break;

                default:
                    break;
            }
        }

        scanner.close();
    }

        public static void clearConsole() {
            System.out.print("\033[H\033[2J\033[3J");
            System.out.flush();
        }
    public static void main(String[] args) {
        Game game = new Game();
        game.start();
        game.run();
    }
}