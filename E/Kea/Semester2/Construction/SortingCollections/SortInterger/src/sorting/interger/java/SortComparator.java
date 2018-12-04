package sorting.interger.java;

import java.util.*;

public class SortComparator {

    public static void main(String args[]) {

        int[][] sort = {{1, 2}, {3, 7}, {8, 9}, {4, 2}, {5, 3}};

        Arrays.sort(sort, Comparator.comparing((int[] arr) -> arr[0])
                .reversed());

        System.out.println(Arrays.deepToString(sort));

    }
}