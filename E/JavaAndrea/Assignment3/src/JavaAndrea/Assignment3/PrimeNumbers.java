package JavaAndrea.Assignment3;

import java.util.Scanner;

/**
 * Created by antonia on 2017/09/29.
 */
public class PrimeNumbers {

    public void printIfPrime(int nr){
        boolean isPrime = true;

        int i = 2;
        while (isPrime && i<=nr/2){
            int remainder = nr % i;
            if(remainder == 0){
                isPrime = false;
            }
            i++;
        }
        if(isPrime){
            System.out.print(nr + " ");
        }
    }


    public void printPrimesTo(int max) {

        if (max > 0){
            System.out.print("1 ");
        }
        for(int i =2; i<=max; i++){
            printIfPrime(i);
        }

    }


    public static void main(String[] args) {

        int max =0;
        System.out.print("Enter max number ");
        Scanner sc = new Scanner(System.in);
        String nmb =sc.nextLine();
        try {
            max = Integer.parseInt(nmb);
        }catch(NumberFormatException ex){
            System.out.println("oops");
            System.exit(100);
        }

        if(max <0 ){
            max = Math.abs(max);
        }

        PrimeNumbers pn = new PrimeNumbers();
        pn.printPrimesTo(max);


    }

}


