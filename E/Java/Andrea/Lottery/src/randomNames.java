import java.util.ArrayList;

/**
 * Created by antonia on 2017/11/22.
 */
public class randomNames {

    public static boolean isConsonat(char c) {

        c = (new String(c + "")).toLowerCase().charAt(0);
        if ( (c <= 122) && (c > 97) && (c != 'e') && (c != 'i')
                && (c != 'o') && (c != 'u')) {
            return true;
        }
        return false;
    }

    public static boolean isVowel(char c) {
        c = (new String(c + "")).toLowerCase().charAt(0);
        if ( (c == 'a') || (c == 'e') || (c == 'i')
                || (c == 'o') || (c == 'u')) {
            return true;
        }
        return false;
    }

    public static boolean check3consonants() {

    }


    public static void main(String[] args) {

        int lengthName = (int) Math.round(Math.random()*10) + 2;
        StringBuffer sb = new StringBuffer();


        int position = 0;
        while (position < lengthName) {
            int newChar = (int) Math.round(Math.random()*26) + 97;

           }



        }




    }
}
