abstract class Shape {
    protected String shapeName;

    public Shape(String name) {
        this.shapeName = name;
    }

    public String getShapeName() {
        return shapeName;
    }
    public abstract double calculateArea();
}

// Concrete class Circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        System.out.println("Shape: " + circle.getShapeName());
        System.out.println("Area: " + circle.calculateArea());
        Shape rectangle = new Rectangle(4.0, 6.0);
        System.out.println("\nShape: " + rectangle.getShapeName());
        System.out.println("Area: " + rectangle.calculateArea());
    }
}
