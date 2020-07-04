package naverNews;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

//public class youtubeEx1 {
//	static String url = "http://auto.danawa.com/";
//
//	public static void main(String[] args) {
//		try {
//
//			Document doc = Jsoup.connect(url).get();
//			Elements body = doc.select("div.mc_tw>span.mc_t_l2>span.mc_tp");
//			for (Element element : body) {
//				String str = element.text();
//				System.out.println(str);
//			}
//			System.out.println(doc.toString());
//		} catch (Exception e) {
//
//		}
//	}
//}

public class youtubeEx1 {
	static String url = "http://auto.danawa.com/";

	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect(url).get();
			Elements link = doc.select("div.mc_tw>span.mc_t_l2>span.mc_tp");
			for (Element element : link) {
				String str = element.text();
				System.out.println(str);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
