package Excel;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.xml.bind.v2.schemagen.xmlschema.*;

public class Brokenlinks{
	
	public static void main( String []args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C://Users/KiranAnnegowda/Documents/asha/Testing/Chrome/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(5000);
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
			WebElement element=links.get(i);
			
			String url=element.getAttribute("href");
			
			URL link=new URL(url);
			
			HttpURLConnection httpconn=(HttpURLConnection)link.openConnection();
			
			Thread.sleep(2000);
			
			httpconn.connect();
			
		int Response=httpconn.getResponseCode();
		
		if (Response>=400)
			
			
		{
			
			System.out.println(url+" - "+"is broken link");
		}
		else {
			
			System.out.println(url+" - "+"is valid link");
		}	
			
			
			
			
			
			
		}
		
		
		
		
		
		
	}
	
}