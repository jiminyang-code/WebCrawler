package naverNews;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NaverNewsEx3 {
	static String url = "https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=100&oid=001&aid=0011289099";

	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect(url).get();
			Elements news_url = doc.select("a._sp_each_url");
			for (Element element : news_url) {
				String url2 = element.attr("href");
				if (url2.contains("news.naver.com")) {
					Document doc2 = Jsoup.connect(url2).get();
					Elements body = doc2.select("div#articleBodyContents");
					Elements title = doc2.select("h3#articleTitle");
					String str = body.text();
					System.out.println("제목 : " + title.text());
					System.out.println("본문 : " + str);
				}
			}
			System.out.println(doc);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
//_sp_each_title
//dd
