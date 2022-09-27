package oops.inheritance;

public class Child extends Super{
    int a =15;
    int b =25;
    public static void main(String[] args) {
        Super sc = new Child();
        Child ch = new Child();

        System.out.println(sc.a);
        System.out.println(ch.a);

    }
}
