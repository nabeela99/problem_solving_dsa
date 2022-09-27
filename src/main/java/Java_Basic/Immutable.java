package Java_Basic;

public class Immutable {
    private final String name;
    public Immutable(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }
    public static void main(String[] args) {
        Immutable i1 = new Immutable("test");
        System.out.println(i1);
        i1 = new Immutable("something");
        System.out.println(i1);
    }


}
