package entities;
import utils.Data_types.Point;

public class Player extends Entity {

    public Player(int health, int attack, int mana, Point position) {
        super("player", health, attack, mana, position);
    }

    public void attack(Enemy enemy) {
        enemy.takeDamage(10);
    }
    
    public Point getPosition() {
        return super.getPosition();
    }

    public void move(int dx, int dy) {
        super.move(dx, dy);
        
    }
}
