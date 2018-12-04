package ConstructionSummer.Generics;

import org.jsoup.Jsoup;

import javax.lang.model.util.Elements;
import javax.swing.text.Document;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class WebCrawlerHWK {
    public WebCrawlerHWK() {
    }

    public static void main(String[] args) {
        try {
            URL ex = new URL("https://genius.com/albums/Game-of-thrones/Season-1-scripts/");
            URLConnection elements = ex.openConnection();
            elements.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/535.1 (KHTML, like Gecko) Chrome/13.0.782.112 Safari/535.1");
            elements.connect();
            BufferedReader in = new BufferedReader(new InputStreamReader(elements.getInputStream()));

            String inputLine;
            while((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }

            in.close();
        } catch (MalformedURLException var6) {
            System.out.println("fail");
            System.err.println(var6);
        } catch (IOException var7) {
            System.err.println(var7);
        }

        try {
            Document ex1 = Jsoup.connect("https://genius.com/albums/Game-of-thrones/Season-1-scripts/").get();
            if(ex1.text().contains("lyrics")) {
                System.out.println();
            }

            Elements elements = ex1.select("html");
            System.out.println(elements.html());
        } catch (Exception var5) {
            System.out.println(var5);
        }

    }
}
