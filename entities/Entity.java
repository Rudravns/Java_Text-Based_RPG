package entities;
import utils.Data_types.Point;

public class Entity {
    private String name;
    private int health;
    private int attack;
    private int mana;

   
    private Point position;
    
    public Entity(String name, int health, int attack, int mana, Point position) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.mana = mana;
        this.position = position
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public void heal(int amount)
    {
       health += amount;     
    }
    
    public boolean isAlive() {
        return health > 0;
    }
}