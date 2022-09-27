package oops;

public class Main {
    public static void main(String[] args) {
        Car dieselCar = new Diesel();

        dieselCar.startEngine("Diesel");
        dieselCar.changeGear(3);
    }
}
