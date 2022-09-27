package mountblue_challenge;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class CavityMap {

    public static List<String> cavityMap(List<String> grid) {
        List<String> r = new ArrayList<>();
        int n = grid.size();
        String sbt = "";
        for(int i=0; i < n; i++){
            Boolean check = false;
            int up = 0;
            int down = 0;
            for(int j=1; j<n-1; j++){
                int left = Character.getNumericValue(grid.get(i).charAt(j-1));
                int right = Character.getNumericValue(grid.get(i).charAt(j+1));
                if (i != 0 && i != n-1) {
                    up = Character.getNumericValue(grid.get(i - 1).charAt(j));
                    down = Character.getNumericValue(grid.get(i + 1).charAt(j));
                }
                int middle = Character.getNumericValue(grid.get(i).charAt(j));

                if(left<middle && up<middle && right<middle && down<middle && i != 0 && i != n-1) {
                    StringBuilder sb = new StringBuilder(grid.get(i));
                    sb.setCharAt(j, 'X');
                    sbt = sb.toString();
                    check = true;
                }else if (left<middle && right<middle){
                    StringBuilder sb = new StringBuilder(grid.get(i));
                    sb.setCharAt(j, 'X');
                    sbt = sb.toString();
                    check = true;
                }
            }
            if (check == true){
                r.add(sbt);
            }else
                r.add(grid.get(i));
        }


        return r;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> grid = IntStream.range(0, n).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        List<String> result = cavityMap(grid);
        System.out.println(result);

        bufferedReader.close();
    }
}
