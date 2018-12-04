package sorting.observ.java;
import java.util.Scanner;

public class Client extends Observer {

    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observer1 = new HexObserver(subject);
        Observer observer2 = new BinaryObserver(subject);
        subject.readTemperature(100);

        while (true) {
            System.out.print("Enter integer to convert (0 to quit): ");
            Scanner sc = new Scanner(System.in);
            int value = sc.nextInt();
            subject.setState(value);
            if (value == 0) {
                break;
            }
        }
    }
    @Override
    public void update(){

    }

}
