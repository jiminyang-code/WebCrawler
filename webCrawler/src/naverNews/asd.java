package naverNews;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class asd {
	static String url = "https://search.naver.com/search.naver?sm=top_hty&fbm=0&ie=utf8&query=%EC%8B%A0%EC%9E%91%EA%B2%8C%EC%9E%84";

	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect(url).get();
			Elements link = doc.select("div.info_text>strong>a");
			for (Element element : link) {
				String str = element.text();
				System.out.println(str);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
