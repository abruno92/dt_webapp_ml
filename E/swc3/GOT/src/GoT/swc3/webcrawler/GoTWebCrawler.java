package GoT.swc3.webcrawler;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;


public class GoTWebCrawler {

    public static void main(String... args) {
        try {
            Document doc = Jsoup.connect("https://genius.com/3354672").get();
            String script = doc.select("p").get(0).text();
            String episodeTitle = doc.select("h1").text();

            //System.out.println(script);

            File episodeFile = new File(episodeTitle + ".txt");
            PrintStream writer = new PrintStream(episodeFile);
            writer.println(episodeTitle);
            writer.print(script);
            findWords(script);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void findWords(String scriptToSearch) {
        String[] scriptWords = scriptToSearch.split(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Word:");
        String input = sc.nextLine();

        int count =0;

        for (String w : scriptWords) {

            if(input.equalsIgnoreCase(w)){
                count++;
            }
        }

        System.out.println(count);
    }
}
