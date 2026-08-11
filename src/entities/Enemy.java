package entities;
import utils.Data_types.Point;


public class Enemy extends Entity {
   public Enemy(String name, int health, int attack, int mana, Point position) {
        super(name, health, attack, mana, position);
    }
}