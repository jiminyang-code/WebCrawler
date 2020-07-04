import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JSoupParserExample2 {
	public static void main(String[] args) {
		try {
			getDetailMovie();
//			getSummary();
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	private static void getDetailMovie() throws Exception {
		Document doc = Jsoup.connect("https://movie.daum.net/moviedb/main?movieId=67256").get();
		Elements es = doc.getElementsByClass("detail_movie");
		for (int i = 0; i < es.size(); i++) {
			Element e = es.get(i);
		}

	}
//
//	private static void getImage() throws Exception {
//		Document doc = Jsoup.connect("https://www.imdb.com/title/tt6911608/soundtrack?ref_=tt_trv_sndm")
//				.postDataCharset("utf-8").get();
//
//		Elements html = doc.getElementsByTag("img");
//
//		for (int i = 0; i < html.size(); i++) {
//			Element e = html.get(i);
//			System.out.println(e);
//			System.out.println(e.attr("src"));
//		}
//
//	}

	public static void getSummary() throws Exception {
		Document doc = Jsoup.connect("https://movie.daum.net/moviedb/main?movieId=67256").postDataCharset("utf-8")
				.get();

		Elements html = doc.getElementsByClass("tit_movie");
		System.out.println(html.toString());
	}
}
