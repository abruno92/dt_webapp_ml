package sorting.interger.java;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SortAscending sA = new SortAscending();
        sA.printArray("Before");
        sA.sort();
        sA.printArray("After");

        SortDescending sD = new SortDescending();
        sD.printArray("Before");
        sD.sort();
        sD.printArray("After");
    }
}