package anudipday2;
class Shape{
    private String shapeName;
    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }
    public void displayShapeName() {
        System.out.println("Shape: " + shapeName);
    }
}
class Circle extends Shape {
    private double radius;
public Circle(double radius) {
        super("Circle");  // Call to Shape constructor
        this.radius = radius;
    }
 public double calculateArea() {
        return Math.PI * radius * radius;
    }
public void displayCircleInfo() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
    }
}

 class ColoredCircle extends Circle {

    private String color;
 public ColoredCircle(double radius, String color) {
        super(radius);  // Call to Circle constructor
        this.color = color;
    }
 public void displayColoredCircleInfo() {
        System.out.println("Color: " + color);
    }
}


public class ShapeMain {
    public static void main(String[] args) {
        ColoredCircle coloredCircle = new ColoredCircle(5.0, "Red");


        coloredCircle.displayShapeName();
        coloredCircle.displayCircleInfo();
        coloredCircle.displayColoredCircleInfo();

    }
}
