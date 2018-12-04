import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

      Main.andreasWay();
        System.out.println("");
      Main.antoniasWayIsBetter();


    }

    public static void andreasWay(){

        boolean lottery[] = new boolean[90];

        int nrLoop = 0;
        while (nrLoop < 6) {
            int currNum = (int) Math.round(Math.random() * 90);
            if (!lottery[currNum]) {
                System.out.print(currNum + " ");
                lottery[currNum] = true;
                nrLoop++;
            }
        }

        System.out.print(" --- ");
        System.out.print(Math.round(Math.random() * 90 + 1));


    }

    public static void antoniasWayIsBetter(){

        ArrayList<Integer> previousNr = new ArrayList<Integer>();

        while (previousNr.size() < 6) {
            int currNum = (int) Math.round(Math.random() * 90);
            if (!previousNr.contains(currNum)) {
                System.out.print(currNum + " ");
                previousNr.add(currNum);
            }
        }

        System.out.print(" --- ");
        System.out.print(Math.round(Math.random() * 90 + 1));

    }



}
