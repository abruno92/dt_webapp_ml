package antonia.semester3.mpf;

import java.util.Scanner;

/**
 * Created by antonia on 2018/02/27.
 */
public class ComplicatedCalculator {

    public static void main(String[] args) {

        String s1 = getInput("Enter a number: ");
        String s2 = getInput("Enter a number: ");
        String op = getInput("Enter either an operator (+, -, * or /): ");

        {

            double result = 0;

            try {
                switch (op) {
                    case "+":
                        result = addValues(s1, s2);
                        break;

                    case "-":
                        result = minusValues(s1, s2);
                        break;

                    case "*":
                        result = minusValues(s1, s2);
                        break;

                    case "/":
                        result = divideValues(s1, s2);
                        break;

                    default:
                        System.out.println("oops");
                        return;

                }
                System.out.println("The answer is: " + result);


            } catch (Exception e) {
                System.out.println("Wrong Symbol" + e.getMessage());
            }
        }

    }

    static double addValues(String s1, String s2){
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 + d2; }

    static double minusValues(String s1, String s2){
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 - d2; }

    static double multiplyValues(String s1, String s2){
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 * d2; }

    static double divideValues(String s1, String s2){
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 / d2; }

    static String getInput(String promt) {
        System.out.println(promt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

}