package INEX;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class INEXPO{
	
	public static void main( String []args) throws InterruptedException
	{
		
		
	//System.setProperty("webdriver.ie.driver", "C://Users//KiranAnnegowda//Documents//asha//Testing//IE//IEDriverServer.exe");
	System.setProperty("webdriver.chrome.driver", "C://Users//KiranAnnegowda//Documents//asha//Testing//Chrome//chromedriver.exe");
		
		
	//WebDriver driver=new InternetExplorerDriver();
	WebDriver driver=new ChromeDriver();
	
		
		System.out.println("Before ....");
		
		driver.get("http://newtours.demoaut.com/");
	
		System.out.println("After ....");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("userName")).sendKeys("mercury");
		
		//driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
	
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(10000);
	
		//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		
		
		String exp_title ="Find a Flight: Mercury Tours:";
					
		String act_title=driver.getTitle();
		
		System.out.println(act_title);
		
		
		if (exp_title.equals(act_title))
		{
		System.out.println("pass")	;
		}
		else
		{
			System.out.println("fail")	;	
		}
		
		Scanner scanner = new Scanner (System.in);		
		String s = scanner.nextLine();
		
		driver.close();
	}
	}