package Lab5;

// Базовий клас Персонаж
abstract class Character {
    protected String name;
    protected int strength;
    protected int defense;

    public Character(String name, int strength, int defense) {
        this.name = name;
        this.strength = strength;
        this.defense = defense;
    }

    public int getStrength() {
        return strength;
    }

    public int getDefense() {
        return defense;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return getName() + " (Сила: " + getStrength() + ", Захист: " + getDefense() + ")";
    }
}
