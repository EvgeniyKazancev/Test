package Tank;




public class Main {
    public static void main(String[] args) {
/*
Make a Tank(add code to class Tank),
which can move forward and backward
*/

        /*ank tank = new Tank();
        tank.goForward(10);
        tank.printPosition();
        tank.goForward(50);
        tank.printPosition();
        tank.goBackward(100);
        tank.printPosition();*/


        Tank justTank = new Tank();

        Tank anywareTank = new Tank(10, 10);

        Tank customTank = new Tank(20, 30, 200 );


       /** Tank tank = new Tank();
        tank.goForward(10);
        tank.printPosition();
        tank.turnRight();
        tank.goForward(50);
        tank.printPosition();
        tank.turnLeft();
        tank.goBackward(100);
        tank.printPosition();**/

        justTank.goForward(200);
        justTank.printPosition();
        anywareTank.goBackward(-200);
        anywareTank.printPosition();
        customTank.goForward(201);
        customTank.printPosition();

/*
This fragment of code has to output

The Tank is at 10 now.
The Tank is at 60 now.
The Tank is at -40 now.

*/
    }

}

