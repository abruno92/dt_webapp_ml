package Java.Basics;


public class TestVars {
   public void runMe(){

       char abc = 'a';
       int a = abc;

       int h = 1;
       short c = (short) h;

       short d = 2;
       int e = d;



       System.out.println("\u2ee3");
       System.out.println(a);
       System.out.println(c);
       System.out.println(d);
   }

   public void ex5(){
       System.out.println("Hi, this is my entry point in runMe()");
       short a = 5, b = 12, c;

       //c = (short) (a + b);

       System.out.println("Result 0: " + (a+b) + " " );
       System.out.println("Result 1: " + 1000000000*(2000000000/500000));
       System.out.println("Result 2: " + (1000000000*2000000000)/500000);
       System.out.println("Result 3: " + (2-2.0) / (5-5.00));
       System.out.println("Result 4: " + (2-1.0) / (0.00));
   }

}
