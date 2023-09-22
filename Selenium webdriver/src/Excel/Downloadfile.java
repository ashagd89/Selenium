package Excel;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Downloadfile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","C://Users/KiranAnnegowda/Documents/asha/Testing/Chrome/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		 driver.manage().window().maximize();
		 
		 //download text
		 driver.findElement(By.id("textbox")).sendKeys("testing text file download");
		 driver.findElement(By.id("createTxt")).click();
		 driver.findElement(By.id("link-to-download")).click();
		 Thread.sleep(5000);
		 
		  if (isFileExist("C:\\Users\\KiranAnnegowda\\Downloads"))
		
		  {
			  
			System.out.println(" file exist");  
			  
		  }
		
		  else
			  
			  {
			  
				System.out.println(" no file exist");  

			  }
		//down load pdf
		  driver.findElement(By.id("pdftbox")).sendKeys("testing pdf file download");
			 driver.findElement(By.id("createPdf")).click();
			 driver.findElement(By.id("pdf-link-to-download")).click();
			 
			 Thread.sleep(5000);
			  if (isFileExist("C:\\Users\\KiranAnnegowda\\Downloads"))
			
			  {
				  
				System.out.println(" file exist");  
				  
			  }
			
			  else
				  
				  {
				  
					System.out.println(" no file exist");  

				  }}
		  static boolean  isFileExist(String path) {
		 
			  File f=new File(path);
		 
		 if(f.exists())
		 {
			 return true;
		 }
		 
		 else {
			 
			 return false;
		 } 
			 
			 
	}
	}
	


