package sorting.interger.java;
import java.util.Comparator;

public class StdNameComp implements Comparator<Student> {

    public StdNameComp() {
    }

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName()) ;
    }

}
