package Practic2.Z1;

public class Orc implements Playable{


    public String move(){
        return "run";

    }

    @Override
    public String attack() {
        return "ax blow"  ;
    }

    @Override
    public String defence() {
        return "block";
    }
}
