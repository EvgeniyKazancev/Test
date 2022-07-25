package Test;

public class Percussion extends MusicalInstrument {
    int year;

    public Percussion(String name, String manufacturer, int price, int year) {
        super(name, manufacturer, price);
        this.year = year;
    }
    public String play(){
        return "Bump";
    }

}
