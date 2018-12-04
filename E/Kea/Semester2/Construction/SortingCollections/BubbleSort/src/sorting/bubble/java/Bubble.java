package sorting.bubble.java;

public class Bubble{
public static void selectionSort(Comparable[] list) {

        int min;
        Comparable temp;

        for(int i=0; i<list.length-1; ++i)
        {
         min = i;
         for(int j=i+1; j<list.length; j++) {
             if (list[min].compareTo(list[j]))
                 min = j;
         }

         temp = list[i];
         list[i] = list[min];
         list[min] = temp;
        }
    }
}