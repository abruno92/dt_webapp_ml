package antonia.semester3.mpf;

/**
 * Created by antonia on 2018/02/21.
 */

public class loopingThroughArrayOfStrings {

    static String[] months = {"January", "February", "March", "April", "May", "June", "July", "August",
            "September", "October", "November", "December"};


    static int counter = 0;


    public static void main(String[] args) {

        //forIncrementLoop();
        forDecrementLoop("Months of the Year:");
        //forEachLoop();
        //whileLoop();
        //doWhileLoop();


    }


        static void forIncrementLoop() {

            for (int i = 0; i <= months.length; i++) {
                System.out.print( months[i]);
                System.out.println();

            }
        }

        static void forDecrementLoop(String label){

            System.out.println(label);

            for(int i = 0; i <=label.length() - 1; i++){
                System.out.print("*");
            }
            System.out.println();

            for(int i = months.length - 1; i >= 0; i--){
                System.out.print(months[i]);
                System.out.println();
            }

        }

        static void forEachLoop(){

            for( String month : months ) {
                System.out.println(month);
            }

        }

        static void whileLoop(){

            int counter = 0;
            while(counter <= months.length) {
                System.out.println(months[counter]);
                counter++;
            }

        }

        static void doWhileLoop(){

            do{
                System.out.println(months[counter]);
                counter ++;
            }while(counter <= months.length);

        }

}






