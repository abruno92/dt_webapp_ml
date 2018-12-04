package java.andrea.puesdocode;

public class Main {

    public static void main(String[] args) {

        boolean lottery[] = new boolean[90];

         int nrLoop = 0;
         while (nrLoop < 6) {
             int currNum = (int) Math.round(Math.random() * 90 + 1);
             if (!lottery[currNum]) {
                 System.out.println(currNum);
                 lottery[currNum] = true;
                 nrLoop++;
             }
         }

        System.out.println(" --- ");
        System.out.println(Math.round(Math.random() * 90 + 1));


    }


}
