package kunal_kushwaha_dsa;

import java.util.Arrays;

public class SelectionSort {



    public static void main(String[] args) {
        int[] arr = {3, 1, 7, 2};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    public static int[] selectionSort(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int max = arr[0];
            int index = 0;
            for(int j = 1; j < n - i; j++) {
                if(arr[j] > max) {
                    max = arr[j];
                    index = j;
                }
            }

            arr[index] = arr[n - 1 - i];
            arr[n - 1 - i] = max;

        }
        return arr;
    }
}
