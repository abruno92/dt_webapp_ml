package sorting.observ.java;

/**
 * Created by antonia on 2017/04/03.
 */

public class HexObserver extends Observer {

    public HexObserver(Subject sbj){
        System.out.println("Created hex observer...");
        subject = sbj;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}