package Arcesium_Problem;

import problem_solving.Solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Goodstring {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            String[] line = br.readLine().split(" ");
            int N = Integer.parseInt(line[0]);
            int Q = Integer.parseInt(line[1]);
            String S = br.readLine();
            String[] arr_arr = br.readLine().split(" ");
            int[] arr = new int[N];
            for(int i_arr = 0; i_arr < arr_arr.length; i_arr++)
            {
                arr[i_arr] = Integer.parseInt(arr_arr[i_arr]);
            }
            int[][] ranges = new int[Q][2];
            for(int i_ranges = 0; i_ranges < Q; i_ranges++)
            {
                String[] arr_ranges = br.readLine().split(" ");
                for(int j_ranges = 0; j_ranges < arr_ranges.length; j_ranges++)
                {
                    ranges[i_ranges][j_ranges] = Integer.parseInt(arr_ranges[j_ranges]);
                }
            }

            int out_ = goodString(N, Q, S, arr, ranges);
            System.out.println(out_);

        }

        wr.close();
        br.close();
    }
    static int goodString(int N, int Q, String S, int[] arr, int[][] ranges){
        int NoOfOperations = 0;
        int result = 0;

        char [] c = S.toCharArray();
        for (int value : arr) {
            int index = value - 1;
            c[index] = '_';
            String St = String.valueOf(c);
            NoOfOperations++;
            String temp = "";
            int count = 0;
            for (int j = 0; j < Q; j++) {
                for (int k = j + 1; k < Q - j; k++) {
                    int start1 = ranges[j][0];
                    int end1 = ranges[j][1];
                    int start2 = ranges[k][0];
                    int end2 = ranges[k][1];
                    String sub1 = St.substring(start1 - 1, end1);
                    String sub2 = St.substring(start2 - 1, end2);


                }
            }
            if (count == Q) {
                result = NoOfOperations;
            }
        }
        return result;

    }
}
