package naverNews;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NaverNewsEx1 {

	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect("https://www.danawa.com").get();

			Elements hotdeal = doc.select(".main_news_rooms");

			Elements deal = hotdeal.select("li");

			for (Element e : deal) {
				System.out.println(e.text());
			}
		} catch (Exception e) {
		}
	}

}
