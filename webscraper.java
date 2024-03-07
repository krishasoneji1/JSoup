import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class webscraper {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://www.amazon.com/AmazonBasics-Lightning-Certified-Charger-iPhone/dp/B07XS5ZPF3/ref=sr_1_1_ffob_sspa?crid=17JTUERC110TV&dib=eyJ2IjoiMSJ9.QCSfQB4V4rnB1scFoKktywuxhDtUMGh1JVRWHqg5z5WozYfwLnDDlUMDWzircN4DQ8sZUo0tTQLLxPbbj-fNFSLZGYYiPf7Cd-ZRpfwVlidna-ypicpynwNW3-W5AdgwD_oFrDFaXqymDTGIzC4iKN0ubrwnhK7mSzB6IpOGZ8n1GY_A186qBsh1FAgk1T8_4MsAoTlADjLEOcK8zlYEaGSLu1nNiS0uISHEdjAcN1Y.7xrhraziIJ7EH-LGB1Xt9aYylcUYCoHl0F_mCXTB3eI&dib_tag=se&keywords=charger&qid=1709708005&sprefix=charge%2Caps%2C170&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1").get();
        Elements elements = doc.getElementsByClass("a-profile-name");
        for (Element x:elements)
        {
            System.out.println(x.text());
        }
    }
    

}
