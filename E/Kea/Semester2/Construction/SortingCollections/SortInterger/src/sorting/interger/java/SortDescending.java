package sorting.interger.java;

public class SortDescending extends SortIntegerList {

    @Override
    public boolean needSwap(int a, int b) { // if a is smaller than be return true/ false
        return (a < b) ? true : false;
    }

}
