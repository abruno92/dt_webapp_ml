package java.ch2.ch2ex;

public class Main {

    public static void main(String[] args) {

        buzz();

    }

    public static void buzz(){

        for(int i = 1; i<=5; i++)
        {
            for(int j = 0; j<i; j++)
            {
                System.out.println("o ");
            }

            for(int j = 0; j < 5-i; j++)
            {
                System.out.println(".");
            }
            System.out.println();
        }

    }
}