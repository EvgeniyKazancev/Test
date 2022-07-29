package Practic2.Z1.Z7;

public class Plane extends Transport {
    public Plane(int fuel, int speed) {
        super(fuel, speed);
    }
    @Override
    public boolean canMove(int n) {
        if (fuel >= n) {
            fuel -= n;
            return true;
        } else return false;
    }

    @Override
    public int getFuelLevel() {
        return fuel;
    }
    void fillFuel(int n){
        fuel += n;
    }
}