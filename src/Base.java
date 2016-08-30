import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Document doc;
		
		try {
			doc = Jsoup.connect("http://piperka.net").get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
		
		String title = doc.title();
		
		//System.out.println("Page Title: " + title);
		//System.out.println("Page: \n" + doc.html());
		
		Logger log = new Logger();
		log.out("Page title: " + title);
		log.close();
	}

}
