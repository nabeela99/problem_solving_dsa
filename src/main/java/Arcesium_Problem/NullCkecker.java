package Arcesium_Problem;

public class NullCkecker {
    String print(String s){
        return "String";
    }
    String print(Object o){
        return "Object";
    }
    public static void main(String[] args) {
        NullCkecker obj = new NullCkecker();
        System.out.println(obj.print(null));
    }
}
