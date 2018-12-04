package assignment2.java.andrea;

/**
 * Created by antonia on 2017/09/21.
 */
public class TestVar {

    public void runMe()
    {
        int x =0;
        int y =6;
        int z =10;
        //z++;


        System.out.println("z = " + z);
        System.out.println(y/x);

    }

    public void runMe2()
    {
        int x =0;
        int y =6;
        int z =10;
        ++z;

        System.out.println("z = " + z);

    }

    public void runMe3()
    {
        int y = 6;

        int x = y++; //postfix operator
        //int x = ++y; //prefix operator


        System.out.println("x = " + x);

    }

    public void runMe4()
    {
        int z = 6;
        System.out.println("z = " + ++z);
        System.out.println("z = " +z++);


    }

    public void runMe2h(){
        int y = 4;
        int x = 14;

        System.out.println("question 2h: " + x/y);
    }

    public void runMe3i(){
        int float_y = 4;
        int float_x = 14;

        System.out.println("question 2i: " + float_x/float_y);
    }

 public void runme3a(){
     String myStrangeString = + 1 + - - + - - + + + + + - 1 + " <";
     System.out.println(myStrangeString);
 }

}
