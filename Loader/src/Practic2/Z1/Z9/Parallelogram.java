package Practic2.Z1.Z9;

public class Parallelogram extends Quadrangle implements Figure{
    double alpha; // левый нижний угол  в градусах
    double beta; // левый верхний угол , в градусах

    public Parallelogram(int a, int b,  double alpha, double beta, String color) {
        super(a, b, color);
        this.alpha = alpha;
        this.beta = beta;
    }

    @Override
    double getLargeDiagonal() {
       double d1 = Math.sqrt(Math.pow(a,2) + Math.pow(b,2) - 2 * (a * b) * Math.cos(Math.toRadians(beta)));
       double d2 = Math.sqrt(Math.pow(a,2) + Math.pow(b,2) + 2 * (a * b) * Math.cos(Math.toRadians(alpha)));
        return Math.max(d1,d2);

    }

    @Override
    double getHeight() {
        return a * Math.min(a * Math.sin(Math.toRadians(alpha)), b * Math.sin(Math.toRadians(beta)));
    }

    @Override
    String getColor() {
        return color;
    }

    @Override
    public double area() {
        return Math.max(a,b) * getHeight();
    }

    @Override
    public double perimeter() {
        return 2 * (a + b);
    }
}
