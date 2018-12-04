
class MyThread extends Thread {

    private static final long C_MAX = 50;
    private final String name;

    public MyThread(String name) {
        super();
        // calls the parent class
        this.name = name;
    }

    @Override
    public void run() {
        for (int i=0; i<MyThread.C_MAX; ++i)
            System.out.println("Hello " + name);
    }

    public static void main(String [] args) {

        MyThread t1 = new MyThread("Andrea");
        MyThread t2 = new MyThread("Antonia");
        MyThread t3 = new MyThread("Eduards");
        MyThread t4 = new MyThread("Cristian");
        MyThread t5 = new MyThread("Sheriff");
        MyThread t6 = new MyThread("Mantas");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}
