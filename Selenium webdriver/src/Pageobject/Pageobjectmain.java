package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pageobjectmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users/KiranAnnegowda/Documents/asha/Testing/Chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		 Registrationpage page = new  Registrationpage (driver);
			driver.get("http://newtours.demoaut.com/");
			
		page.clickRegLink();
		page.setFirstName("xxx");
			
			
			
			
			
			
			
			
			
	}

}
