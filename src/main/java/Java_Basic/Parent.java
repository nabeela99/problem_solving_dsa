package Java_Basic;

public interface Parent {
    default void a(){
        System.out.println("This is parent calling");
    }
    void b();
    void c();
}
interface Parent1 {
    default void a(){
        System.out.println("This id parent1 calling");
    }
    void m();
}
class Child_D implements Parent,Parent1{
    public void a(){
        Parent.super.a();
        Parent1.super.a();
        System.out.println("Multiple Inheritance check for a");
    }
    public void b(){
        System.out.println("Multiple Inheritance check for b");
    }
    public void c(){
        System.out.println("Multiple Inheritance check for c");
    }
    public void m(){
        System.out.println("Multiple Inheritance check for m");
    }
}
abstract class Child_A implements Parent{
    public void a(){
        System.out.println("This is a");
    }
    public abstract void d();
}
class Child_B extends Child_A{
    public int index = 1;
    public void d(){
        System.out.println("This is d");
    }
    public void b(){
        System.out.println("This is b");
    }
    public void c(){
        System.out.println("This is c");
    }
}
class Child_C extends Child_B{

    public void b() {
        System.out.println("This is 2nd b");
    }
    public void d() {
        System.out.println("This is  2nd d");
    }

}
class Test{
    public static void main(String[] args) {
        Parent obj = new Child_B();
        obj.a();
        obj.b();
        obj.c();
        Child_D obj1 = new Child_D();
        obj1.a();
        obj1.b();
        obj1.c();
        obj1.m();
        Child_C obj2 = new Child_C();
//        List<Integer> list = new ArrayList<>();
//        list.add(2);
//        list.add(5);
//        list.add(20);
//        list.add(22);
//        Iterator t1 = list.iterator();
//        while(t1.hasNext()){
//            int i = (Integer)t1.next();
//            if(i <= 22) {
//                t1.remove();
//            }
//        }
//        System.out.println(list.size());
    }
}

