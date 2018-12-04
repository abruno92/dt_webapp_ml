package search.sort.java;

/**
 * Created by antonia on 2017/03/20.
 */
public class CompareObject {

    String a;

    public CompareObject(String b) {
        a = b;
    }

    public boolean equals(Object object2) {
        if(a == object2) {
            return true;
        }
        else return false;
    }

    public boolean equals2(Object object2) {
        if(a.equals(object2)) {
            return true;
        }
        else return false;
    }



    public static void main(String[] args) {

        CompareObject object1 = new CompareObject("compare test");
        CompareObject object2 = new CompareObject("compare test");

        object1.equals(object2);
        System.out.println(object1.equals(object2));

        object1.equals2(object2);
        System.out.println(object1.equals2(object2));
    }


}