package All;

public abstract class Shape {
    public abstract double calculatePerimeter();


}

class Triangle extends Shape {
    int x;
   int length;
    @Override
    public double calculatePerimeter() {
        return x = 3 * length;
    }
}

class Square extends Shape {
 int length,x;

    @Override
    public double calculatePerimeter() {
        return x = 4 * length;
    }
}

class Circle extends Shape {
    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {

        return Math.PI * Math.pow(radius, 2);
    }
}
