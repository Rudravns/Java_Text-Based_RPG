import entities.Player;
import utils.Data_types.Point;
import world.Dungeon;
import java.util.Scanner;

public class Game {

    Dungeon dungeon;
    Player player;
    Scanner scanner = new Scanner(System.in);

    public void start() {
        player = new Player(100, 10, 10, new Point(0, 0));
        dungeon = new Dungeon();
        dungeon.change_map(1);

        System.out.println("Game started");
    }

    public void run() {
        while (true) {
            clearConsole();
            dungeon.printMap();

            System.out.print("Enter command: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("quit")) {
                System.out.println("Thanks for playing!");
                break;
            }

            // TODO: Handle w, a, s, d
        }

        scanner.close();
    }

    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}