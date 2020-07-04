package crawler;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class finderror {
   public static void main(String[] args) throws IOException{
      
      String url = "https://www.zillow.com/homes/for_sale/Denver-CO/pmf,pf_pt/118576962_zpid/11093_rid/globalrelevanceex_sort/39.976331,-104.6101,39.554089,-105.104485_rect/10_zm/";
      //String url = "https://www.zillow.com/homes/for_sale/pmf,pf_pt/globalrelevanceex_sort/39.78473,-104.864244,39.701045,-104.974108_rect/12_zm/";

      Document document = Jsoup.connect(url).get(); //url(uniform resource locator)�� ���� �Ľ��� ������ document��.

      Elements addr = document.getElementsByClass("zsg-photo-card-address");//�Ľ� ���� �� class�� zsg-photo-card-address�� ���� addr��.
      Elements price = document.getElementsByClass("zsg-photo-card-price");

      for(int i =0; i < price.size(); i++){ //ã�Ƴ� ����� ������ŭ �ݺ�
         System.out.println(addr.get(i).text()+":"+price.get(i).text());//�� Ŭ������ ���빰 ���
      }
   }
}

