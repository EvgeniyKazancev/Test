package Practic2.Z1.Z8;

public class Warrior extends Player {
    String armor;

    public Warrior(int hp, int level, String type, String weapon, String armor) {
        super(hp, level, type, weapon);
        this.armor = armor;
    }

    @Override
    void LevelUp() {
        level++;
    }

    @Override
    String getFullInfo() {
        return hp +" "+ level + " " + type + " " + weapon + " " + armor ;
    }

    @Override
    boolean doDamage() {
        return true;
    }
}
