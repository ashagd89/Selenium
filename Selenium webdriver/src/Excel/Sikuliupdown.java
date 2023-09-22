package Excel;

import java.util.regex.Pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;

public class Sikuliupdown {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver","C://Users/KiranAnnegowda/Documents/asha/Testing/Chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		 
		driver.manage().window().maximize();
		String imagesFilepath="C:\\Users\\KiranAnnegowda\\Documents\\asha";// screenshot of the file text
		String inputFilepath="C:\\Users\\KiranAnnegowda\\Documents\\asha";//screen shot of the open button
			Screen s=new Screen();	
			Pattern fileInputTextbox=new Pattern(imagesFilepath+"image.PNG");
		Pattern openButton=new Pattern(imagesFilepath +"openButton.png");
		Thread.sleep(5000);
				
		s.wait(fileInputTextbox,20);
		s.type(fileInputTextbox,inputFilepath+".....jpg");//file to be upload
		s.click( openButton);
		// TODO Auto-generated method stub

	}

}
