package leetcode.easy;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Sudoku {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0 ; i < 9 ; i++){
            Set <Character> set = new HashSet<>();
            int count = 0;
            int total = 0;
            for (int j = 0 ; j < 9 ; j++){
                if (board[i][j] != '.'){
                    set.add(board[i][j]);
                }else{
                    count++;
                }
            }
            total = count + set.size();
            if (total != 9){
                return false;
            }
        }
        for (int i = 0 ; i < 9 ; i++){
            Set <Character> set = new HashSet<>();
            int count = 0;
            int total = 0;
            for (int j = 0 ; j < 9 ; j++){
                if (board[j][i] != '.'){
                    set.add(board[j][i]);
                }else{
                    count++;
                }
            }
            total = count + set.size();
            if (total != 9){
                return false;
            }
        }
        if (isBoxValid(board,  m , n, 0 , 0) != 0){
            return false;
        }
        return true;
    }
    int m = 0;
    int n = 0;
    public int isBoxValid(char[][] board, int m , int n, int s, int d){
        if (d != 0) return d;
        if (s == board.length ) return d;
        Set <Character> set = new HashSet<>();
        int count = 0;
        int total = 0;
        for (int i = m ; i < m + 3 ; i++) {
            for (int j = n; j < n + 3; j++) {
                if (board[i][j] != '.') {
                    set.add(board[i][j]);
                } else {
                    count++;
                }
            }
        }
        total = count + set.size();
        if (total != 9){
            d++;
        }
        else if(n < 6) {
            n = n + 3;
        }else if (n == 6){
            n = 0;
            m = m + 3;
        }
        return isBoxValid(board , m , n , s+1, d);
    }

    public static void main(String[] args) {
        char[][] in = {
                {'.','.','.','.','.','.','5','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'9','3','.','.','2','.','4','.','.'},
                {'.','.','7','.','.','.','3','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','3','4','.','.','.','.'},
                {'.','.','.','.','.','3','.','.','.'},
                {'.','.','.','.','.','5','2','.','.'}
        };
        Scanner sc = new Scanner(System.in);
//        int m = 9;
//        char [][] arr = new char[m][m];
//        for (int i = 0 ; i < m ; i++){
//            for (int j = 0 ; j < m ; j++) {
//                arr[i][j] = sc.next().charAt(0);
//            }
//        }
        Sudoku t1 = new Sudoku();
        System.out.println(t1.isValidSudoku(in));
    }
}
//        5 3 . . 7 . . . .
//        6 . . 1 9 5 . . .
//        . 9 8 . . . . 6 .
//        8 . . . 6 . . . 3
//        4 . . 8 . 3 . . 1
//        7 . . . 2 . . . 6
//        . 6 . . . . 2 8 .
//        . . . 4 1 9 . . 5
//        . . . . 8 . . 7 9
