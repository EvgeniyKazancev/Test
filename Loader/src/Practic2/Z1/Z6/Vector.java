package Practic2.Z1.Z6;

public abstract class Vector {
    int x1,y1,z1,x2,y2,z2;

    public Vector(int x1, int y1, int z1, int x2, int y2, int z2) {
        this.x1 = x1;
        this.y1 = y1;
        this.z1 = z1;
        this.x2 = x2;
        this.y2 = y2;
        this.z2 = z2;
    }
    abstract double getLength();
    abstract String getVectorCords();
}
