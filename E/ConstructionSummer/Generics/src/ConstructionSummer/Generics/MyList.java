package ConstructionSummer.Generics;
import java.util.*;


/**
 * Created by antonia on 2017/08/31.
 */
public class MyList{


    public static void main(String[] args) {
/*
        List<String> alpa = new ArrayList<>();

        MyArrayList<String> woOp = new MyArrayList();
        woOp.add("a");
        woOp.add("b");
        woOp.add("c");
        System.out.println(woOp); */

        Set<String> mySet = new HashSet<>(); // doesnt sort
            mySet.add("a");
            mySet.add("b");
            mySet.add("c");

        System.out.println("Hash = " + mySet);

        Set<String> myNewSet = new TreeSet<>(); // sorts natural order
        myNewSet.add("a");
        myNewSet.add("b");
        myNewSet.add("c");

        System.out.println("Tree = " + myNewSet);



    }

}
