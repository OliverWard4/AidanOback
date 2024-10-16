package AidanOback.Hasing;

public class HashMap {

    private int[] arr;

    public HashMap() {

        arr = new int[10];
    }

    public void add(String name, int value) {
        int sum = 0;
        for (int i = 0; i < name.length(); i++) {
            sum = sum + name.charAt(i);
        }
        arr[sum % arr.length] = value;
    }
}
