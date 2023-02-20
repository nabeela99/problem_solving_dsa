package oops;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }
    public Circle(double radius) {
        this.radius = radius; // This refers to current object
    }
    public Circle (double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }
}


//    void test() {
//        this.print();
//    }
//
//    void print() {
//        System.out.println("Test");
//    }
