package construction.webcrawler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebCrawler {


    public static void main(String[] args) {

        try {
            URL myURL = new URL("https://genius.com/albums/Game-of-thrones/Season-1-scripts/");

            URLConnection conn = myURL.openConnection();
            conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/535.1 " +
                    "(KHTML, like Gecko) Chrome/13.0.782.112 Safari/535.1");

            conn.connect();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));

            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }

            in.close();

        } catch (MalformedURLException ex1) {

            System.out.println("fail");
            System.err.println(ex1);

        } catch (IOException ex2) {
            System.err.println(ex2);

        }


        try {
            Document doc = Jsoup.connect("https://genius.com/albums/Game-of-thrones/Season-1-scripts/").get();

            if(doc.text().contains("")){
                //System.out.println();
            }

            Elements elements = doc.select("html");
            for(Element link : questions)
            System.out.println(elements.html());
        } catch (Exception ex) {
            System.out.println(ex);
        }


    }

}

