package entities;
import java.util.*;

public class Player extends Entity {

    public Player(int health, int attack, int mana, Point position) {
        super("player", health, attack, mana, position);
    }

    public void attack(Enemy enemy) {
        enemy.takeDamage(10);
    }
}
}