package crawler;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class loadingurl {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String html = "<div><p>Sample Content</p>";
		Document document = Jsoup.parseBodyFragment(html);//�Էµ� html�� �Ľ���
		Element body = document.body(); //document.getElementById("body")�� ����
		Elements paragraphs = body.getElementsByTag("p");//�±װ� p�ΰ� �� ������
		for(Element paragraph : paragraphs) { //�� p�±� �ȿ� �ִ� ���빰 ���
			System.out.println(paragraph.text());
		}
		String url="http://www.google.com"; //google.com �ּ�
		Document document1 = Jsoup.connect(url).get(); //�ּҿ� ���� html �ؼ��Ѵ�.
		Elements contents = document1.getElementsByClass("gb_O"); //�̰��� �ϴ� ���빰�� �θ� Ŭ������ ã�´�.
		System.out.println(document1.title()); //���� �߿� �±װ� title�� �� ���
		for(Element content : contents) {
			System.out.println(content.getElementsByTag("span").text()); //���� �� �±װ� span�� �� ���
		}
	}

}

