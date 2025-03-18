package arrays;
import java.lang.reflect.Array;
import java.util.*;

public class ArrayExample {

    public static void main(String[] args) {
        int [] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            Random rand = new Random();
            arr[i] = rand.nextInt(100);

        }
        sortArray(arr);
    }

    public static void sortArray(int[] arr){
        int[] sortedArray = Arrays.copyOf(arr, arr.length);
        int temp;
        for(int k = 0; k < sortedArray.length; k++){
        for(int i = 0; i < sortedArray.length - 1; i++){
            if(sortedArray[i] < sortedArray[i+1]){
                temp = sortedArray[i];
                sortedArray[i] = sortedArray[i+1];
                sortedArray[i+1] = temp;
                System.out.println(Arrays.toString(sortedArray));

            }
        }
        }
        System.out.println(Arrays.toString(sortedArray));
    }
}
