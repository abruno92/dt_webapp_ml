package sorting.observ.java;

/**
 * Created by antonia on 2017/04/03.
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        System.out.println("Created binary observer...");
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}