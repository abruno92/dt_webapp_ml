package sw3.threads.examole;

/**
 * Created by antonia on 2017/09/24.
 */
class GoodByeThread extends Thread {

    int pause;

    public void run() {
        for (int i = 0; i <= 10; i++)
            try {

                System.out.println("Goodbye");
                pause = (int) (Math.random() * 3000);
                sleep(pause);

            } catch (InterruptedException interruptEx) {
                System.out.println(interruptEx);
            }
    }
}
