package Practic2.Z1.Z6;

public class Vector3D extends Vector{
    public Vector3D(int x1, int y1, int z1, int x2, int y2, int z2) {
        super(x1, y1, z1, x2, y2, z2);
    }

    @Override
    double getLength() {
        return  Math.sqrt(x1 * x1  + y2 * y2 + z1 * z2);
    }

    @Override
    String getVectorCords() {
        return  (x1 - x2) + " " + (y1 - y2) + " " + (z1 + z2);
    }
    double getScalarProduct(Vector3D vector){
        return (x1 * x2 + y1 * y2 + z1 * z2 ) * 3;
    }
}
