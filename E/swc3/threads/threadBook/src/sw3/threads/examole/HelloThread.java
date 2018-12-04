package sw3.threads.examole;

/**
 * Created by antonia on 2017/09/24.
 */
class HelloThread extends Thread {

    public void run(){

        int pause;

        for(int i=0; i<=10; i++)
        try{
            System.out.println("hello");
            pause = (int)(Math.random()*3000);
            sleep(pause);

        }catch(InterruptedException interruptEx){

            System.out.println(interruptEx);

        }

    }



}
