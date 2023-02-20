package oops;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1.getRadius() + c1.getColor());
        Circle c2 = new Circle(2.0);
        System.out.println(c2.getRadius() + " " +  c2.getArea());
        Circle c3 = new Circle(5.0,"green");
        System.out.println(c3.getRadius() + c3.getColor());
        Circle c4 = new Circle();
        c4.setRadius(5.5);
        System.out.println("radius is: " + c4.getRadius());
        c4.setColor("green");
        System.out.println("color is: " + c4.getColor());
        Circle c5 = new Circle(5.5);
        System.out.println(c5.toString());
        System.out.println(c5);
    }
}
