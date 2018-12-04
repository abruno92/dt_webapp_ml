package antonia.semester3.mpf;

import java.util.Scanner;

/**
 * Created by antonia on 2018/02/21.
 */
public class SwitchMonth {
    public static void main(String[] args) {

        switchMonths(); // for int
        switchStringMonths();

    }

    public static void switchStringMonths() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Write the first three letters of a month:  ");
        String monthName = sc.nextLine();

        switch (monthName) {
            case "Jan":
                System.out.println("It is January");
                break;
            case "Feb":
                System.out.println("It is Febraury");
                break;
            case "Mar":
                System.out.println("It is March");
                break;
            case "Apr":
                System.out.println("It is April");
                break;
            default:
                System.out.println("oops");
        }

    }


    public static void switchMonths(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a number from 1 - 12: ");
        String input2 = sc.nextLine();
        int monthNumber = Integer.parseInt(input2);

        switch(monthNumber){
            case 1:
                System.out.println("It is January");
                break;
            case 2:
                System.out.println("It is Febraury");
                break;
            case 3:
                System.out.println("It is March");
                break;
            case 4:
                System.out.println("It is April");
                break;
            default:
                System.out.println("oops");
        }




    }
}
