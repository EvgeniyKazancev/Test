package Practic2.Z1.Z4;

public class Car {
    String carModel;

    public Car(String carModel) {
        this.carModel = carModel;
    }

    class Engine {
        boolean isWorking = false;
        int horsepower;

        public Engine( int horsepower) {

            this.horsepower = horsepower;
        }

        String startStopEngine() {
            isWorking = !isWorking;
            return isWorking ? "engine was started" : "engine was stopped";

        }
    }
}