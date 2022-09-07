package Practic2.Z1.Z6;

public class Vector2D extends Vector{

    public Vector2D(int x1, int y1, int z1 , int x2, int y2, int z2 ) {
        super(x1, y1, 0, x2, y2, 0);

    }
    @Override
    double getLength() {

        return Math.sqrt(Math.pow(x1 - x2, 2)  + Math.pow(y2 - y2, 2) );
    }

    @Override
    String getVectorCords() {

        return (x1 - x2) + " " + (y1 - y2);
    }

   double getScalarProduct(Vector2D vector2D){
       String cords = getVectorCords();
       String cords2 = vector2D.getVectorCords();
     return Integer.parseInt(cords.split(" ")[0]) * Integer.parseInt(cords2.split(" ")[0])+
             Integer.parseInt(cords2.split(" ")[1]) * Integer.parseInt(cords.split(" ")[1]);
    }
    public double getAngle(Vector2D vector2D){
        if(getLength() != 0 && vector2D.getLength() !=0){
         return  getScalarProduct(vector2D)  /  this.getLength() + vector2D.getLength();
        }else return -2.0;
   }
}
