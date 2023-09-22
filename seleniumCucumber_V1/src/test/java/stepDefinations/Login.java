package stepDefinations;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.properties.PropertiesConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.Log;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pageObjects.LoginPage;

public class Login {
	
	WebDriver driver;
	LoginPage lp;

	public static Logger LOG = LogManager.getLogger(Login.class);
	
				
			
	@Before
	public void initSetup() {		
		
	LOG.info("************Initial Setup***********");
		
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "//Drivers//chromedriver.exe");
	
	//System.setProperty("webdriver.firefox.driver",System.getProperty("user.dir")+ "//Drivers//geckodriver.exe");
	
//	driver=new ChromeDriver();
	
	//driver=new FirefoxDriver();
		
	
	
	}

	@Given("User lanched chrome browser")
	public void user_lanched_chrome_browser() {
		
			
		driver=new ChromeDriver();
		
		lp= new LoginPage();	
		lp.ldriver=driver;
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("user opens URl {string}")
	public void user_opens_u_rl(String url) {
	   
		lp.OPenUrl(url);
		
	}

	@When("user enters crdentislas as {string} and password as {string}")
	public void user_enters_crdentislas_as_and_password_as(String username, String passwd) {
	    
	lp.SetUserName(username);
	lp.setPasswd(passwd);
				
	}

	@When("user clicks on Login")
	public void user_clicks_on_login() {
		lp.clickLogin();	
    }

	@Then("page title should be {string}")
	public void page_title_should_be(String title) {
		lp.verifyLoginSuccess(title);
		
	
	   
	}

	@Then("user clicks on Logout")
	public void user_clicks_on_logout() {
	   lp.clickLogout();
	   
	   try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	    
	
	@Then("page title should be as {string}")
	public void page_title_should_be_as(String title) {
	    lp.verifyLogoutSuccess(title);
	}

	
}
