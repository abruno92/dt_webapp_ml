package constructionSummer.ag;

public class Main {

    public static void main(String[] args) {
        count();
        primary();
    }

    public static void count() {
        for (int i = 100; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void primary() {

        int i = 0;
        int num = 0;
        String primeNumbers = "";

        for (i = 1; i <= 100; i++)
        {
            int count = 0;

            for (num = i; num>=1; num--) {

                if (i % num == 0) {
                    count = count + 1;
                }

            }

                if (count == 2)
                {

                    primeNumbers = primeNumbers + i + " ";

                }
            }

            System.out.println("The primary numbers from 1 - 100:" + " " + primeNumbers);
        }
    }





