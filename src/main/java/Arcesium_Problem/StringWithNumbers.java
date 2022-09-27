package Arcesium_Problem;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringWithNumbers {
    public static void main(String[] args) {
        String s = "App5les are1 go2od fo4r hea3lth";
        String[] sa = s.split(" ");
        String wNum;
        List<Integer> list = new ArrayList<>();
        for (int i = 0 ; i < sa.length; i++){
            int num = Integer.parseInt(sa[i].replaceAll("[a-z]|[A-Z]",""));
            wNum = sa[i].replaceAll("\\d","");
            sa[i] =  num + wNum + "";
            list.add(num);
            System.out.println(num);
        }
        Collections.sort(list);
        int j = 0;
        while (j < list.size())
            for (int i = 0 ; i < list.size(); i++) {
                if (list.get(j) == Character.getNumericValue(sa[i].charAt(0))) {
                    System.out.print(sa[i].substring(1) + " ");
                    j++;
                    break;
                }
            }
    }
}
