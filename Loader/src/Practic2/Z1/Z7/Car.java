package Practic2.Z1.Z7;

public class Car extends Transport {
    int maxPassenger;

    public Car(int fuel, int speed, int maxPassenger) {
        super(fuel, speed);
        this.maxPassenger = maxPassenger;
    }

    @Override
    public boolean canMove(int n) {
        if (fuel >= n){
            fuel -= n;
            return true;
        }else  return false;
    }

    @Override
    public int getFuelLevel() {
        return fuel;
    }
    int  getMaxPassenger(){
        return maxPassenger;
    }
}
