package JavaAndrea.Assignment3;
import java.util.Random;


/**
 * Created by antonia on 2017/10/12.
 */
public class RandomLettersName {

    //char [] letterArray  = {'a', 'b' , 'c', 'd' ,'e', 'f' ,'g', 'h' ,'i', 'j' ,'k', 'l' ,
           // 'm', 'n' , 'o' , 'p', 'q' ,'r', 's' ,'t', 'u' ,'v', 'w','x', 'y' , 'z'};
    String letters = "abcdefghijklmnopqrstuvwxyz";
    Random r = new Random();

    public void checkMyLetters(){
        for(int i = 0; i<12; i++){
            System.out.print(letters.charAt(r.nextInt(letters.length())));
        }
    }
}
