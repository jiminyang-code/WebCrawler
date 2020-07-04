package naverNews;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class asd3 {
	static String url = "https://www.imdb.com/?ref_=nv_home";

	public static void main(String[] args) {
		try {

			Document doc = Jsoup.connect(url).get();

			Elements link = doc.select(
					"div.ipc-sub-grid ipc-sub-grid--page-span-3 ipc-sub-grid--nowrap ipc-shoveler__grid>a.ipc-poster-card__title ipc-poster-card__title--clamp-2 ipc-poster-card__title--href");

			for (Element element : link) {
				String str = element.text();
				System.out.println(str);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
