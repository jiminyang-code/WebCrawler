package crawler;

import org.jsoup.Jsoup;

import org.jsoup.nodes.Document;

import java.io.IOException;

import org.jsoup.nodes.*;

import org.jsoup.select.Elements;

public class navernews {

	public static void main(String[] args) throws IOException {

		String url = "http://news.naver.com/";

		Document document = Jsoup.connect(url).get(); // ���̹� ���� url �ؼ�.

		// �� �ð� �ֿ� ������ ������ �̱�

		Elements strong = document.getElementsByClass("newsnow_tx_inner"); // �̰��� �ϴ� ������ �θ� class.

		for (Element st : strong) {

			System.out.println(st.getElementsByTag("strong").text());// �θ� Ŭ���� �ȿ� �ִ� strong �±��� ���빰

			// System.out.println(st.getElementsByTag("a").text());

		}

	}

}
