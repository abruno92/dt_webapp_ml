package search.sort.java;

public class SequentialSearch {

    private static final int C_NOT_FOUND = -1;

    public static int searchElement(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return C_NOT_FOUND;
    }

    public static int searchElement(String[] arr, String element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(element)) {
                return i;
            }
        }
        return C_NOT_FOUND;
    }

    public static int searchElement(Object[] arr, Object element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(element)) {
                return i;
            }
        }
        return C_NOT_FOUND;
    }

    public static void main(String[] args) {
        NewClass[] a = {new NewClass(1), new NewClass(3), new NewClass(5)};

        System.out.println(SequentialSearch.searchElement(a, new NewClass(3)));;
    }


}