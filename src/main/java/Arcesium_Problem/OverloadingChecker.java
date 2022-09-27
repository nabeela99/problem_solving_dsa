package Arcesium_Problem;

public class OverloadingChecker {
    int print(int a){
        return a;
    }
    double print(double b){
        return b;
    }
    public static void main(String[] args) {

        OverloadingChecker obj = new OverloadingChecker();
        int res = obj.print(100);
        int a = 10;

        System.out.println(res);
        System.out.println(a);
    }
}
