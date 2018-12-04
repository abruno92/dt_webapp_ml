package antonia.semester3.mpf;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a numberic value: ");
        String input = sc.nextLine();
        Double d1 = Double.parseDouble(input);

        System.out.println("Enter a numberic value: ");
        String input2 = sc.nextLine();
        Double d2 = Double.parseDouble(input2);

        int answer = (int) (d1 + d2);
        System.out.println( "The answer is: " + answer);


    }
}
