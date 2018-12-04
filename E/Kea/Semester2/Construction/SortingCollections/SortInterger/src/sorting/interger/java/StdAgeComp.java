package sorting.interger.java;

import java.util.Comparator;

public class StdAgeComp implements Comparator<Student> {

    public StdAgeComp() {
    }

    @Override
    public int compare(Student s1, Student s2) {
        // since Integer class implements the interface Comparator
        // the following holds:
        return Integer.compare(s1.getAge(), s2.getAge());
        // otherwise one can compare the field manually like
        //return (s1.getAge() > s2.getAge() ? 1 :
        //                     (s1.getAge() < s2.getAge() ? -1 : 0) );
    }

}