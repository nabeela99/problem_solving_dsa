package Java_Basic;

class A {

    public A() {
        System.out.print("A ");
    }
}

class B extends A {

    public B() {
        System.out.print("B ");
    }
    public B(int a) {
        System.out.print("B " + a);
    }
}

public class ConstructorTest extends B {

    public ConstructorTest() {
        super(12);
        System.out.print("C ");
    }

    public static void main(String[] args) {
        ConstructorTest c = new ConstructorTest();
    }
}
