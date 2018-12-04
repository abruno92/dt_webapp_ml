package sorting.interger.java;

public abstract class SortIntegerList {

    int[] array = {2, 3, 5, 1, 9, -2, 0, 4};

    public final void sort() {
        for (int i = 0; i<(array.length-1); ++i)
            for (int k = i; k < array.length; ++k)
                if (needSwap(array[i], array[k])) { //"need to swap method" I need to compare, but im not sure what will happen
                    swap(i, k);
                }
    }

    public abstract boolean needSwap(int i, int k);

    private void swap(int i, int k) {
        int tmp = array[i];
        array[i] = array[k];
        array[k] = tmp;
    }

    public void printArray(String msg) {
        System.out.print(msg + " ");
        for (int i=0; i<array.length; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }


}

