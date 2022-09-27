package oops;

public class Diesel implements Car{

    @Override
    public void startEngine(String s) {
        System.out.println(s+" Car Started.");
    }

    @Override
    public void changeGear(int gear) {
        System.out.println("Gear changed to : " + gear);
    }

    @Override
    public void blowHorn() {
        System.out.println("Horn Blown !!!");
    }

    @Override
    public void applyBrake() {
        System.out.println("Brake Applied");
    }

    @Override
    public void stopEngine() {
        System.out.println(" Diesel Engine Stopped");
    }

    public void extraFeature() {

    }
}
