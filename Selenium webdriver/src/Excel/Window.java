package Excel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {
	
	public static void main( String []args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C://Users/KiranAnnegowda/Documents/asha/Testing/Chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Slider.html");
		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[1]/button")).click();
		//driver.findElement(By.name(name))
		
	}
	
}