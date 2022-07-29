package Practic2.Z1.Z8;

public abstract class Player {
    int hp, level;
    String type, weapon;

    public Player(int hp, int level, String type, String weapon) {
        this.hp = hp;
        this.level = level;
        this.type = type;
        this.weapon = weapon;
    }
    abstract String getFullInfo();
    abstract void LevelUp();
    abstract boolean doDamage();
}
