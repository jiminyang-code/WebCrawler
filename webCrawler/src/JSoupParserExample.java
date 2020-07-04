
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.google.gson.Gson;

public class JSoupParserExample {
	public static void main(String[] args) {
		try {
			getTitles();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void getTitles() throws Exception {
		for (int id = 0; id < 1; id++) {
			try {
				Document doc = Jsoup
						.connect("https://www.imdb.com/title/tt5697572/soundtrack?ref_=tt_trv_snd" + (id + 1)).get();
				Elements es = doc.getElementsByClass("track-list");
				Element e = es.get(0);
				String title = e.html();
				System.out.println();
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("¨ú©ª¢¥? ¢¬?????¢¥?¢¥?.");
			}

		}
	}
//	private static void getImage() throws Exception {
//		Document doc = Jsoup.connect("https://www.imdb.com/title/tt6911608/soundtrack?ref_=tt_trv_sndm").postDataCharset("utf-8").get();
//		
//		Elements html =doc.getElementsByTag("img");
//		
//		for (int i=0; i<html.size();i++) {
//			Element e = html.get(i);
//			System.out.println(e);
//			System.out.println(e.attr("src"));
//		}
//		
//	}

	public static void getSummary() throws Exception {
		Document doc = Jsoup.connect("https://datalab.naver.com/").postDataCharset("utf-8").get();

		Elements html = doc.getElementsByClass("rank_inner v2");
		System.out.println(html.toString());
	}
}
