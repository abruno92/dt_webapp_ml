public class myThreadJoin extends Thread {

    private static final long C_MAX = 500;
    private String name;

    public myThreadJoin(String name) {
        super();
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread() + ": starting");
        // give a chance to another thread to run
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        for (int i = 0; i < myThreadJoin.C_MAX; ++i)
            System.out.println("Hello " + name);
        System.out.println("Thread " + Thread.currentThread() + ": exiting");
    }

    public static void main(String[] args) {
        System.out.println("Thread " + Thread.currentThread() + ": starting");
        myThreadJoin t1 = new myThreadJoin("Gerli");
        t1.start();

        for (int i = 0; i < 10000; i++) {

            System.out.println("Hello Antonia" + i);

            if (i == 2000) {

                try {
                    t1.join();
                    // makes main wait for this thread to finish!
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                System.out.println("Thread " + Thread.currentThread() + ": exiting");
            }
        }
    }
}