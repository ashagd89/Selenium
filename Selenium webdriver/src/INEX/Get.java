package INEX;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get{
	
	private static final TimeUnit Seconds = null;

	public static void main( String []args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//KiranAnnegowda//Documents//asha//Testing//Chrome//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		/*System.out.println("Title"+driver.getTitle());
		System.out.println("Title"+driver.getCurrentUrl());
		String Test=driver.findElement(By.name("userName")).getText();
		System.out.println("Text"+Test);
		driver.close();
		driver.navigate().to("https://www.facebook.com/login.php");
		driver.navigate().back();
		driver.navigate().forward();
		driver.manage().timeouts().implicitlyWait(2,Seconds);
		driver.navigate().refresh();*/
		WebElement email=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		WebElement pass=driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		if(email.isDisplayed()&& email.isEnabled())
		{
		email.sendKeys("xxxx");	
		}
		if(pass.isDisplayed()&& pass.isEnabled())
		{
		pass.sendKeys("yyyy");	
		}
		
		driver.close();
		
		
		
		
		
		
		
	}
	
	
}
