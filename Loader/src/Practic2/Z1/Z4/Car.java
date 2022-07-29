package Practic2.Z1.Z4;

public class Car {
    String carModel;

    public Car(String carModel) {
        this.carModel = carModel;
    }

    class Engin {
        boolean isWorking = false;
        int horsepower;

        public Engin( int horsepower) {

            this.horsepower = horsepower;
        }

        String startStopEngine() {
            if (isWorking) {
                isWorking = false;
                return "engine was stopped";

            }else {
                isWorking = true;
                return "engine was started";

            }

        }
    }
}