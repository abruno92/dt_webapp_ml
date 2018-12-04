package sorting.interger.java;

import java.util.Arrays;

public class SortingArrays {

    public static void main(String[] args) {
        Student s1 = new Student("Thomas", 21);
        Student s2 = new Student("Sigita", 19);
        Student s3 = new Student("Mantas", 36);
        Student[] students = new Student[]{s1, s2, s3};
        // sort by age
        System.out.println("Sorting according the age\n"
                + "-------------------------");
        Arrays.sort(students, new StdAgeComp());

        for (int i = 0; i < students.length; ++i) {
            System.out.println(students[i]);
        }
        // sort by name
        System.out.println("\nSorting according the name\n"
                + "--------------------------");
        Arrays.sort(students, new StdNameComp());
        for (int i = 0; i < students.length; ++i) {
            System.out.println(students[i]);
        }
    }
}
