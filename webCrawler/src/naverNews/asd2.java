package naverNews;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class asd2 {
	static String url = "http://www.cgv.co.kr/movies/";

	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect(url).get();
			Elements link = doc.select("div.box-contents>a>strong.title");
			for (Element element : link) {
				String str = element.text();
				for (int i = 1; i < str.length(); i++) {
					
				}
				System.out.println(str);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
