package lynda.addingValues;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String s1 = getInput("Enter a value: ");
	String s2 = getInput("Enter a value: ");
    String s3 = getInput("Enter a value: ");



	double result = addValues(s1,s2);
    System.out.println("The answer is: " + result);

    double result2 = addValues(s1,s2,s3);
    System.out.println("The answer is: " + result2);

    double result3 = addValues(s1,s2,s3, s1,s2,s3);
    System.out.print("The answer is: " + result3);

    }

    static String getInput(String prompt){
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    static double addValues(String s1, String s2){
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double result = d1 + d2;
        return result;
    }

    static double addValues(String s1, String s2, String s3){
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double d3 = Double.parseDouble(s3);
        double result2 = d1 + d2 + d3;
        return result2;
    }

    static double addValues(String ... Values){
        double result = 0;
        for(String value : Values){
        double d = Double.parseDouble(value);
        result += d;
        }
        return result;
    }



}
