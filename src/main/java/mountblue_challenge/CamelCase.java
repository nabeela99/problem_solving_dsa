package mountblue_challenge;

import java.util.ArrayList;
import java.util.List;

public class CamelCase {

    public static void main(String[] args) {
        System.out.println(camelcase("oneTwoThreeF"));
    }

    public static int camelcase(String s) {
        List<String> list = new ArrayList<>();
        return s.split("[A-Z]").length;
    }
}
