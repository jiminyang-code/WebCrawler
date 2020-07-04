package naverNews;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MovieEx1 {

	static String url = "http://www.cgv.co.kr/movies";

	public static List<MovieVO> getCGVData() throws IOException {
		List<MovieVO> list = new ArrayList<MovieVO>();

		Document doc;
		try {
			doc = Jsoup.connect(url).get();

			Elements title = doc.select("div.box-contents>a>strong.title");
			Elements percent = doc.select("div.score>strong.percent>span");
			for (int i = 0; i < 7; i++) {
				Element titleEle = title.get(i);
				String titleStr = titleEle.text();
				Element percentEle = percent.get(i);
				String percentStr = percentEle.text();
				System.out.println(titleStr);
				MovieVO mv = new MovieVO();
				mv.setTitle(titleStr);
				mv.setPercent(Double.parseDouble(percentStr));
				list.add(mv);
			}
			return list;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

	}

}
