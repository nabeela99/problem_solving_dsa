package Java_Basic;

public class Inheritance {
    private static int a = 10;
    private static int add(int a , int b){
        int sum = a + b;
        return sum;
    }
    class NestedClass{
        int num = a;
        int num1 = 2;
        int sum1 = Inheritance.add(num,num1);
    }
    class SubClass extends NestedClass{
        int ab = a;
        int be = 20;
        int sum1 = Inheritance.add(ab,be);
    }
    public static void main(String[] args) {
        Inheritance t1 = new Inheritance();
        System.out.println(t1.add(1,2));
        Inheritance.NestedClass t2 = t1.new NestedClass();
    }
}
class Child extends Inheritance{
    int num3 = 10;
}
