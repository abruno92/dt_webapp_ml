package sw3.threads.examole;

public class Main {

    public static void main(String[] args) {

	HelloThread hello = new HelloThread();
	GoodByeThread goodbye = new GoodByeThread();

	hello.start();
	goodbye.start();

	}
}
