package fetchDatafromSite;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class FetchData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
Document doc=Jsoup.connect("url").userAgent("mozilla/17.0").get();
		Elements  temp=doc.select("div.info");
		
		int i=0;
		for(Element movieList:temp)
		{
			i++;
			System.out.println(i +" "+movieList.getElementsByTag("a").first().text() );
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		}

}
