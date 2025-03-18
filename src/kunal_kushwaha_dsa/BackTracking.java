package kunal_kushwaha_dsa;

import java.util.Arrays;
import java.util.Scanner;

public class BackTracking {
    public static void main(String[] args) {
        boolean[][] arr = new boolean[4][4];
        System.out.println(queens(arr, 0));

    }

    public static int queens(boolean[][] board, int row){
        if(row == board.length){
            for(boolean[] arr : board){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();
            return 1;
        }

        int value = 0;

        for(int i = 0; i < board.length; i++){
            if(isSafe(board, row, i)){
                board[row][i] = true;
                value += queens(board, row + 1);
                board[row][i] = false;
            }
        }
        return value;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        for(int j = row - 1; j >= 0; j--){
            if(board[j][col]){
                return false;
            }
        }

        int maxLeft = Math.min(row, col);

        for(int i = 1; i <= maxLeft; i++){
            if(board[row - i][col - i ]){
                return false;
            }
        }

        int maxRight = Math.min(row, board.length - col - 1);
        for(int i = 1; i <= maxRight; i++){
            if(board[row - i][col + i ]){
                return false;
            }
        }



        return true;
    }
}