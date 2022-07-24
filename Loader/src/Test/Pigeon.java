package Test;

public class Pigeon extends Bird{
    int hunger;


    public Pigeon(String type , String[] continents, int population, int hunger) {
        super("pigeon", continents, population);
        this.hunger = hunger;

    }

    public void askForSeeds(){
      hunger -= 7;
         if (hunger < 0)  hunger = 0;

    }
    public void sleep(){
       hunger += 3;
    }

    public int getHunger() {
        return hunger;
    }

    @Override
    public String toString() {
        return "Pigeon{" +
                "hunger=" + hunger +
                '}';
    }
}
