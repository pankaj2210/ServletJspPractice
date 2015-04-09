package services;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class ScrapeWebpageService {

	public String getFlipkartProductPrice(String url)
			throws IOException {
		String fkPrice = null;
		Document doc = Jsoup.connect(url).get();

		fkPrice = doc.select(".pricing .selling-price").text();
		System.out.println(fkPrice);
		return fkPrice;
	}

	public String getFlipkartProductName(String url)
			throws IOException {
		String fkName = null;
		Document doc = Jsoup.connect(url).get();

		fkName = doc.select(".product-details .line").select("h1").text();
		System.out.println(fkName);
		return fkName;
		
	}
}
