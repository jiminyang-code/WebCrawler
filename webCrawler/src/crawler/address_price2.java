package crawler;

import org.jsoup.Jsoup;

import org.jsoup.nodes.Document;

import org.jsoup.nodes.Element;

import org.jsoup.select.Elements;

import java.io.IOException;

public class address_price2 {

	public static void main(String[] args) throws IOException {

		// ������ �ּҿ� ���� �̱�

		String url = "https://www.zillow.com/homes/for_sale/Denver-CO/pmf,pf_pt/118576962_zpid/11093_rid/globalrelevanceex_sort/39.976331,-104.6101,39.554089,-105.104485_rect/10_zm/";

		Document document = Jsoup.connect(url).get();// url �ؼ��ϱ�

		Elements parents = document.getElementsByClass("zsg-photo-card-spec");// ���ϴ� ������ �θ� Ŭ����

		for (Element paragraph : parents) { // �θ� Ŭ���� �ȿ� �ִ� address, price Ŭ���� ���

			System.out.println(paragraph.getElementsByClass("zsg-photo-card-address").text() + ' '
					+ paragraph.getElementsByClass("zsg-photo-card-price").text());

		}

	}

}
