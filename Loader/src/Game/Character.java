package Game;

public abstract class Character implements Fight {
    private String name;
    private int hp, gold, power, experience, dexterity;

    public Character(String name, int hp, int gold, int power, int experience, int dexterity) {
        this.name = name;
        this.hp = hp;
        this.gold = gold;
        this.power = power;
        this.experience = experience;
        this.dexterity = dexterity;
    }

    public Character() {

    }

    @Override
    public int attack() {
        if (dexterity * 3 > getRandomValue() ) {
            return getRandomValue() <= 10 ? power * 2 : power;

        } else
            return  0;
    }

    private int getRandomValue() {
        return (int)(Math.random() * 100);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    @Override
    public String toString() {
        return String.format("%s здоровье:%d", name, hp);
    }
}
