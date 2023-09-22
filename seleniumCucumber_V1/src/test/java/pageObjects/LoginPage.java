package pageObjects;

import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LoginPage {
	
	public WebDriver ldriver;
	public Logger logj;
	
	
	public void OPenUrl(String url) {
		
		ldriver.get(url);
	}
	
	
	public void SetUserName(String username) {
		
		
		WebElement usess=   ldriver.findElement(By.xpath("//*[@id=\"Email\"]"));
		usess.clear();
		usess.sendKeys(username);
		
	}
	
	public void setPasswd(String passwd) {
		WebElement pass=   ldriver.findElement(By.xpath("//*[@id=\"Password\"]"));
		pass.clear();
		pass.sendKeys(passwd);
			
		
	}


	public void clickLogin() {
		
		ldriver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();

		
	}
	public void verifyLoginSuccess(String title ) {
		Assert.assertEquals(title, ldriver.getTitle());

	}
     public void clickLogout() {
    	 ldriver.findElement(By.linkText("Logout")).click();

     }
     public void verifyLogoutSuccess(String title ) {
 		Assert.assertEquals(title, ldriver.getTitle());
     }
}
