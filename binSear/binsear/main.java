package AidanOback.binSear;

public class main {

    public static void main(String[] args) {

        int[] arr = { -5, -1, 0, 1, 2, 3, 4, 5 };

        int goal = 1;
        int x = BinarySearch.binarySearch(arr, goal);

        System.out.println(goal + "is at index " + x);

        /*
         * int low = 0;
         * int high = arr.length - 1;
         * 
         * while (low <= high) {
         * int mid = low + (high - low) / 2;
         * 
         * if (arr[mid] == target) {
         * return mid; // Target found
         * } else if (arr[mid] < target) {
         * low = mid + 1; // Search in the right half
         * } else {
         * high = mid - 1; // Search in the left half
         * }
         * }
         * 
         * return -1; // Target not found
         */

    }

}
