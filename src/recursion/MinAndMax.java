package recursion;

public class MinAndMax {
    public static void main(String[] args) {
        int[] arr = {1,4,8,2,-6,10,15,18};
        findMin(Integer.MAX_VALUE, arr, arr.length - 1);
        findMax(Integer.MIN_VALUE, arr, arr.length - 1);
    }

    private static void findMin(int min, int[] arr, int length) {
        if(length < 1){
            System.out.println(min);
            return;
        }
        min = Math.min(min , arr[length]);
        findMin(min, arr, length - 1);
    }

    private static void findMax(int max, int[] arr, int length) {
        if(length < 1){
            System.out.println(max);
            return;
        }
        max = Math.max(max , arr[length]);
        findMax(max, arr, length - 1);
    }
}
