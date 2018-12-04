package sorting.interger.java;

public class SortAscending extends SortIntegerList {

    @Override
    public boolean needSwap(int a, int b) { //checks if its bigger
        return (a > b) ? true : false;
    }

}
