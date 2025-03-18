package kunal_kushwaha_dsa;

public class InfiniteSortedArray {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        search(arr, 15);
    }

    public static void search(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (true) {
            if (end >= arr.length - 1) {
                System.out.println("Element not found");
                break;
            }
            if (target >= arr[start] && target <= arr[end]) {
                System.out.println(binarySearch(arr, start, end, target));
                break;
            } else {
                int newStart = end + 1;
                if (start > arr.length - 1) {
                    start = arr.length - 1;
                }
                end = end  + ((end - start + 1) * 2);
                if (end > arr.length - 1) {
                    end = arr.length - 1;
                }

                start = newStart;
            }
        }
    }

    public static int binarySearch(int[] arr, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
