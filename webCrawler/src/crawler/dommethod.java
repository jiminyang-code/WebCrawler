package crawler;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class dommethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String html = "<html><head><title>Sample Title</title></head>" + "<body>" + "<p>Sample Content</p>"
				+ "<p>Another p tag</p>" + "<div id='sampleDiv'><a href='www.google.com'>Google</a></div>"
				+ "</body></html>";

		Document document = Jsoup.parse(html);
		System.out.println("==========<title>==========\n" + document.title());

		Elements paragraphs = document.getElementsByTag("p");
		for (Element paragraph : paragraphs) {
			System.out.println("==========<p>==========\n" + paragraph.text());
		}

		Element sampleDiv = document.getElementById("sampleDiv");
		System.out.println("==========<sampleDiv>==========\n" + sampleDiv.text());

		// id�� sampleDiv�� a�±׿� �ִ� ��ҵ��� links�� ����.
		Elements links = sampleDiv.getElementsByTag("a");
		// �� ��Ҹ� link��� ��.
		for (Element link : links) {
			System.out.println("Href : " + link.attr("href"));// �ش� ��ҿ� �ִ� �Ӽ��� href�� ���� ���� ���
			System.out.println("Text : " + link.text());// �ش� ��ҿ� �ִ� ���빰 ���
		}
	}

}
