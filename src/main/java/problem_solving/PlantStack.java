package problem_solving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class PlantStack {
    public static int poisonousPlants(List<Integer> p) {
        Stack <Integer> st = new Stack<>();
        for (Integer elem : p){
            st.push(elem);
        }
        boolean count = false;
        int num = -1;
        while (count == false){
            count = true;
            int temp = st.pop();
            while (!st.isEmpty()){
                if (st.peek() >= temp){
                    p.add(temp);
                    temp = st.pop();
                }else{
                    temp = st.pop();
                    count = false;
                }
            }
            p.add(temp);
            for (int i = p.size()-1 ; i >= 0 ;i--){
                st.push(p.get(i));
            }
            num++;
            p.clear();
        }
        return num;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> p = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = PlantStack.poisonousPlants(p);
        System.out.println(result);

        bufferedReader.close();
    }
}


