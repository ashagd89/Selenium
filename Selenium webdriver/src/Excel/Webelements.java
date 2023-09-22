package Excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Webelements{
	
	public static void main( String []args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C://Users/KiranAnnegowda/Documents/asha/Testing/Chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();

		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
	driver.findElement(By.name("login")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[3]")).click();
		driver.findElement(By.name("firstName")).sendKeys("David");
		driver.findElement(By.name("lastName")).sendKeys("Russel");
		driver.findElement(By.name("phone")).sendKeys("4355556666");
		driver.findElement(By.name("email")).sendKeys("kkk.@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("xxx");
		driver.findElement(By.name("city")).sendKeys("Glen");
		driver.findElement(By.name("state")).sendKeys("Va");
		driver.findElement(By.name("postalCode")).sendKeys("23077");
		WebElement element=driver.findElement(By.name("country"));
		Select sel=new Select(element);
		sel.selectByValue("2");
		
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/table/tbody/tr[14]/td/a/img")).click();		
		Thread.sleep(3000);
		driver.close();
	
		
		
		
		
		
		
		
	}
	
	
}