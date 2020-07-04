package naverNews;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NaverNewsEx2 {
	static String url = "https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=100&oid=001&aid=0011289099";

	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect(url).get();
			Elements body = doc.select("div#artickeBodyContents");
			System.out.println(doc);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
