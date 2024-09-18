package AidanOback.binSear;

public class BinarySearch {

    public static int binarySearch(String[] arr, String target) {

        // String Variant
        int high = arr.length;
        int low = 0;
        while (low <= high) {
            int mid = (low + high - low) / 2;
            if (arr[mid].equals(target)) {
                return mid;
            } else if (arr[mid].compareTo(target) > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

}