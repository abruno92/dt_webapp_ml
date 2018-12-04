class StopThread extends Thread {

    private volatile boolean stop = false;

    public void stopIt() {
        stop = true;
    }

    @Override
    public void run() {
        int counter = 0;
        while (!stop) {
            System.out.println(counter++);
        }
        System.out.println("Exiting thread...");
    }

    public static void main(String[] args) throws InterruptedException {
        StopThread st = new StopThread();
        st.start();
        Thread.sleep(100);
        st.stopIt();
    }

}
