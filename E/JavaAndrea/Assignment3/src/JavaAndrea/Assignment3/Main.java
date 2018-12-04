package JavaAndrea.Assignment3;

public class Main{
    public static void main(String[] args) {

        String name = "Superman";
        System.out.println("My name is " + name);
      //  int a = Integer.parseInt(name);
      //  System.out.println("My variable a has value " + a);

        String ageString = "10";
        System.out.println("My age is " + ageString);
        int myAge = Integer.parseInt(ageString);

        int superpigeAge = 26;
        int totalAge = myAge + superpigeAge;
        System.out.println("Our combined age amount to " + totalAge);

        System.out.println("I am " + myAge + " years old while Superpige is " + superpigeAge);
        System.out.println("I am " + ageString + " years old while Superpige is " + superpigeAge);

    }
}