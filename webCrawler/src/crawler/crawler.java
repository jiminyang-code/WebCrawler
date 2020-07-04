package crawler;

import org.jsoup.Jsoup;

import org.jsoup.nodes.Document;

import org.jsoup.nodes.Element;

import org.jsoup.select.Elements;

public class crawler {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		String html="<html><head><title>Sample Title</title></head>"

				+"<body><p>Sample Content</p></body></html>";

		Document document = Jsoup.parse(html); //html�̶�� ���ڿ��� �ؼ�

		System.out.println("==========<head>==========\n"+document.head());//head �±� �����ؼ� ���

		System.out.println("==========<body>==========\n"+document.body());//body �±� �����ؼ� ���

		System.out.println("==========<title>==========\n"+document.title());//title �±� ���� ���빰 ���, �� title �±״� �ȳ�����?

		System.out.println("==========<body>==========\n"+document.getElementsByTag("body"));//body�±׸� ������ ��� �±׿� ���빰 ���

		Elements paragraphs = document.getElementsByTag("p");

		for(Element paragraph : paragraphs){

			System.out.println("==========<p>==========\n"+paragraph.text());//�±׸� ������ �±� ���� ���빰�� ���

		}

	}



}

