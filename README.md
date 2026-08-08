# Java Dungeon ⚔️

A text-based dungeon RPG built in Java while learning **AP Computer Science A**.

The goal of this project is to learn Java by building something rather than just following tutorials.

---

## 📁 Project Structure

```text
JavaDungeon/
└── src/
    ├── Main.java
    ├── Game.java
    │
    ├── entities/
    │   ├── Entity.java
    │   ├── Player.java
    │   └── Enemy.java
    │
    ├── items/
    │   ├── Item.java
    │   ├── Weapon.java
    │   └── Potion.java
    │
    ├── world/
    │   ├── Room.java
    │   └── Dungeon.java
    │
    └── utils/
        └── datatypes/
            └── Point.java
```

---

# 🎯 Project Goals

This project is primarily a learning project.

I want to use it to become comfortable with:

* Java syntax
* Classes and objects
* Constructors
* Inheritance
* Encapsulation
* `static` vs non-static
* Arrays
* `ArrayList`
* 2D arrays
* 2D `ArrayList`s
* Packages
* Imports
* References
* Polymorphism
* Recursion
* AP CSA-style code tracing

---

# ☕ Java Basics

## Program Entry Point

Java programs normally start from:

```java
public class Main {
    public static void main(String[] args) {
        // Program starts here
    }
}
```

`main()` is `static` because Java needs to call it before creating an object of `Main`.

---

# 🧱 Classes

A class defines what an object contains and can do.

```java
public class Player {
    private String name;
    private int health;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
    }
}
```

Create an object:

```java
Player player = new Player("Rudransh", 100);
```

---

# 🔒 Access Modifiers

Java provides different levels of access.

```text
private
protected
public
```

Basic idea:

```text
private
→ accessible inside the class

protected
→ accessible inside the class and subclasses

public
→ accessible from anywhere it is visible
```

Prefer `private` for fields when possible.

Example:

```java
public class Entity {
    private int health;

    public int getHealth() {
        return health;
    }
}
```

This is called **encapsulation**.

---

# 🏗️ Constructors

A constructor initializes an object.

```java
public Entity(String name, int health, int attack, int mana) {
    this.name = name;
    this.health = health;
    this.attack = attack;
    this.mana = mana;
}
```

Create the object:

```java
Entity entity = new Entity("Goblin", 50, 10, 0);
```

`this` refers to the current object.

---

# 🧬 Inheritance

A class can inherit from another class using `extends`.

```java
public class Player extends Entity {

}
```

Structure:

```text
Entity
├── Player
└── Enemy
```

A subclass can call the parent constructor with:

```java
super(...);
```

Example:

```java
public Player(String name, int health, int attack, int mana) {
    super(name, health, attack, mana);
}
```

---

# 📦 Packages

Packages organize classes.

Example:

```text
src/
├── entities/
│   ├── Entity.java
│   ├── Player.java
│   └── Enemy.java
│
└── utils/
    └── datatypes/
        └── Point.java
```

At the top of `Entity.java`:

```java
package entities;
```

At the top of `Point.java`:

```java
package utils.datatypes;
```

---

# 📥 Imports

If a class is in another package, import it.

```java
import utils.datatypes.Point;
```

Then you can use:

```java
Point position = new Point(10, 20);
```

Without the import, you'd need to use the full package name.

---

# 📍 Records

Java records can be useful for simple data containers.

Example:

```java
public record Point(int x, int y) {}
```

Create one:

```java
Point position = new Point(10, 20);
```

Access its values:

```java
position.x();
position.y();
```

---

# ⚡ `static` vs Non-Static

### Non-static

Belongs to an individual object.

```java
Player player1 = new Player(...);
Player player2 = new Player(...);
```

Each player has their own:

```text
health
name
attack
position
```

### Static

Belongs to the class itself.

```java
Player.totalPlayers
```

There is only one shared value.

Think:

```text
non-static → object
static     → class
```

---

# 📊 Arrays

Arrays have a **fixed size**.

## 1D Array

```java
int[] numbers = {10, 20, 30, 40};
```

Access:

```java
numbers[0];
numbers[2];
```

Change:

```java
numbers[1] = 99;
```

Length:

```java
numbers.length;
```

Create an empty array:

```java
int[] numbers = new int[5];
```

---

# 📋 ArrayList

`ArrayList` can grow and shrink.

Import:

```java
import java.util.ArrayList;
```

Create:

```java
ArrayList<Integer> numbers = new ArrayList<>();
```

Add:

```java
numbers.add(10);
numbers.add(20);
numbers.add(30);
```

Access:

```java
numbers.get(1);
```

Change:

```java
numbers.set(1, 99);
```

Remove:

```java
numbers.remove(0);
```

Size:

```java
numbers.size();
```

---

# 🔢 Array vs ArrayList

| Operation | Array        | ArrayList           |
| --------- | ------------ | ------------------- |
| Create    | `new int[5]` | `new ArrayList<>()` |
| Access    | `arr[i]`     | `list.get(i)`       |
| Change    | `arr[i] = x` | `list.set(i, x)`    |
| Add       | ❌            | `.add(x)`           |
| Remove    | ❌            | `.remove(i)`        |
| Length    | `.length`    | `.size()`           |
| Size      | Fixed        | Dynamic             |

---

# 🔢 Primitive Types in ArrayList

`ArrayList` uses objects rather than primitive types.

So:

```java
ArrayList<int> numbers;
```

❌ Invalid.

Instead:

```java
ArrayList<Integer> numbers;
```

Java wrapper types include:

```text
int       → Integer
double    → Double
boolean   → Boolean
char      → Character
```

---

# 🗺️ 2D Arrays

Useful for the dungeon map.

```java
int[][] map = new int[5][5];
```

Access:

```java
map[2][3] = 5;
```

The first index is the row.

The second index is the column.

```text
       columns
       0  1  2  3
     ┌────────────
row 0│
row 1│
row 2│       X
row 3│
```

---

# 🔁 Looping Through a 2D Array

```java
for (int row = 0; row < map.length; row++) {
    for (int col = 0; col < map[row].length; col++) {
        System.out.println(map[row][col]);
    }
}
```

Remember:

```java
map.length
```

= number of rows

```java
map[row].length
```

= number of columns in that row

---

# 📚 2D ArrayList

An `ArrayList` can contain other `ArrayList`s.

```java
ArrayList<ArrayList<Integer>> grid = new ArrayList<>();
```

Example:

```java
ArrayList<Integer> row = new ArrayList<>();

row.add(1);
row.add(2);
row.add(3);

grid.add(row);
```

Access:

```java
grid.get(0).get(1);
```

Result:

```text
2
```

Think:

```text
grid
│
├── row 0 → [1, 2, 3]
├── row 1 → [...]
└── row 2 → [...]
```

---

# 🎒 Planned Game Data Structures

The game will eventually use these concepts.

### Player Inventory

```java
ArrayList<Item> inventory;
```

### Enemies in a Room

```java
ArrayList<Enemy> enemies;
```

### Dungeon Map

```java
Room[][] dungeon;
```

### Player Position

```java
Point position;
```

---

# 🧠 Learning Roadmap

## Level 1 — Java Basics

* [ ] Variables
* [ ] Primitive types
* [ ] Strings
* [ ] `if / else`
* [ ] `for`
* [ ] `while`
* [ ] Methods
* [ ] `Scanner`

## Level 2 — Object-Oriented Programming

* [ ] Classes
* [ ] Objects
* [ ] Constructors
* [ ] `this`
* [ ] `private`
* [ ] Getters/setters
* [ ] `static`
* [ ] Inheritance
* [ ] `super`
* [ ] Polymorphism

## Level 3 — Data Structures

* [ ] 1D arrays
* [ ] 2D arrays
* [ ] `ArrayList`
* [ ] 2D `ArrayList`
* [ ] Searching
* [ ] Sorting
* [ ] Object collections

## Level 4 — Dungeon

* [ ] Player
* [ ] Enemies
* [ ] Combat
* [ ] Items
* [ ] Inventory
* [ ] Rooms
* [ ] Dungeon map
* [ ] Movement
* [ ] Multiple enemy types
* [ ] Saving/loading

## Level 5 — AP CSA

* [ ] Code tracing
* [ ] AP-style multiple choice
* [ ] Free-response questions
* [ ] Inheritance questions
* [ ] Array/ArrayList questions
* [ ] 2D array questions
* [ ] Recursion
* [ ] Polymorphism

---

# 🚧 Current Goal

Do **not** try to build the entire game at once.

The first milestone is:

```text
Main
 ↓
Game
 ↓
Create Player
 ↓
Create Enemy
 ↓
Player attacks Enemy
 ↓
Enemy attacks Player
 ↓
Repeat until one dies
```

After that, add one new Java concept at a time.

---

# 🎯 Main Objective

Build a fun game while becoming comfortable enough with Java that AP Computer Science A feels like learning the **Java version of programming concepts I already understand**, rather than learning programming from scratch.
