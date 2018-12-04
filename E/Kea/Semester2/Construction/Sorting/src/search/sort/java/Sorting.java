package search.sort.java;

public class Sorting {

    private static final int C_NOT_FOUND = -1;

    public static int searchElement(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return C_NOT_FOUND;
    }

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        if (args.length > 0) {
            System.out.println(" ");
            for(int i =0; i<args.length; i++){
                System.out.println((i+1) + ": " +args[i]);
            }
        }
        Sorting.searchElement(a, 1);
    }
}

