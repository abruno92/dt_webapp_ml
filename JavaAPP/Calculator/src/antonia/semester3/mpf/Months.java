package antonia.semester3.mpf;
import java.util.Scanner;

/**
 * Created by antonia on 2018/02/21.
 */
public class Months {
    public static void main(String[] args) {

        whatSeason();

    }

    public static void whatSeason(){

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i <= 3; i++) {

            System.out.println("What month number is it? ");

            String input = sc.nextLine();
            int monthNumber = Integer.parseInt(input);

            if (monthNumber >= 1 && monthNumber <= 2) {
                System.out.println("Its winter");
                System.out.println();
            } else if (monthNumber >= 3 && monthNumber <= 5) {
                System.out.println("Its Spring");
                System.out.println();
            } else if (monthNumber >= 6 && monthNumber <= 8) {
                System.out.println("Its Summer");
                System.out.println();
            } else if (monthNumber >= 9 && monthNumber <= 11) {
                System.out.println("Its Autumn");
                System.out.println();
            } else {
                System.out.println("unknown month");
                System.out.println();
            }

        }

    }

}
