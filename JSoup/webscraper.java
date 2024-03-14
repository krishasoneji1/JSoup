
import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class webscraper {
    public static ArrayList<String> usernames = new ArrayList<String>();;
    public static ArrayList<String> reviews = new ArrayList<String>();
    public static void main(String[] args) throws IOException {
        

        Document doc1 = Jsoup.connect("https://www.walmart.com/reviews/product/825314902").get();
        Elements names1 = doc1.getElementsByClass("f6 gray pr2 mb2");
        Elements reviews1 = doc1.getElementsByClass("tl-m mb3 db-m");

        Document doc2 = Jsoup.connect("https://www.walmart.com/reviews/product/825314902?page=2").get();
        Elements names2 = doc2.getElementsByClass("f6 gray pr2 mb2");
        Elements reviews2 = doc2.getElementsByClass("tl-m mb3 db-m");

        Document doc3 = Jsoup.connect("https://www.walmart.com/reviews/product/825314902?page=3").get();
        Elements names3 = doc3.getElementsByClass("f6 gray pr2 mb2");
        Elements reviews3 = doc3.getElementsByClass("tl-m mb3 db-m");

        Document doc4 = Jsoup.connect("https://www.walmart.com/reviews/product/825314902?page=4").get();
        Elements names4 = doc4.getElementsByClass("f6 gray pr2 mb2");
        Elements reviews4 = doc4.getElementsByClass("tl-m mb3 db-m");

        Document doc5 = Jsoup.connect("https://www.walmart.com/reviews/product/825314902?page=5").get();
        Elements names5 = doc5.getElementsByClass("f6 gray pr2 mb2");
        Elements reviews5 = doc5.getElementsByClass("tl-m mb3 db-m");
        for (Element n1:names1)
        {
            usernames.add (n1.text());
        }
        

        for (Element n2:names2)
        {
   
            usernames.add (n2.text());
        }
        
        for (Element n3:names3)
        {

            usernames.add (n3.text());
        }
        for (Element n4:names4)
        {
        
            usernames.add (n4.text());
        
        }

        for (Element n5:names5)
        {
     
            usernames.add (n5.text());
        }

        for (Element r1:reviews1)
        {
            reviews.add (r1.text());
        }

        for (Element r2:reviews2)
        {
            reviews.add (r2.text());
        }

        for (Element r3:reviews3)
        {
            reviews.add (r3.text());
        }
        
        for (Element r4:reviews4)
        {
            reviews.add (r4.text());
        }

        for (Element r5:reviews5)
        {
            reviews.add (r5.text());
        }
        
       DataCollector dc = new DataCollector();
       dc.prepareData("usernames_and_reviews.txt", usernames, reviews);
       TargetedAd ta = new TargetedAd();
       ta.makeAd();
    } 
    
}

