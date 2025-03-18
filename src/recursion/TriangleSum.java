package recursion;

import java.util.Arrays;

public class TriangleSum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        triangleSum(arr, arr.length);

    }

    public static void triangleSum(int[] arr, int level) {
        if(level <= 0){
            return ;
        }

        int[] newArr = new int[arr.length - 1];
        for(int i = 0; i < arr.length - 1; i++){
            newArr[i] = arr[i] + arr[i + 1];
        }
        triangleSum(newArr, level - 1);
        System.out.println(Arrays.toString(arr));
        return ;
    }
}
