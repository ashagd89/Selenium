package IEpackage;
import org.openqa.selenium.firefox.FirefoxDriver;
public class IEE{
	
	public static void main( String []args)
	{
		
		
	System.setProperty("webdriver.firefox.marionette", "C://Users//KiranAnnegowda//Documents//asha//Testing//geckodriver-v0.26.0-win64//geckodriver.exe");
		
		
	FirefoxDriver driver=new FirefoxDriver();	
		
		driver.get("http://newtours.demoaut.com/");
		
		
		
	}
	
	
	
	
	
	
	
	
	
	}