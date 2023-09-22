package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Registrationpage {
	
	WebDriver driver;
	 
	@FindBy(how=How.LINK_TEXT,using="REGISTER")WebElement RegLink;
	
	@FindBy(name="firstName")WebElement Firstname ; 
	
	@FindBy(name="LastName")WebElement lastname ;
	
	@FindBy(name="phone")WebElement phone ;
	
	@FindBy(name="userName")WebElement email ; 
	  
	@FindBy(name="address1")WebElement address1 ;
	
	@FindBy(name="address2")WebElement address2 ;
	
	@FindBy(name="city")WebElement city ;
	
	@FindBy(name="state")WebElement state ;
	
	@FindBy(name="country")WebElement country ;
	
	@FindBy(name="email")WebElement username ;
	
	@FindBy(name="password")WebElement password ;
	
	@FindBy(name="confirmPassword")WebElement confirmpassword ;
	
	@FindBy(name="register")WebElement registerBtn ;

	
	 Registrationpage(WebDriver d)
	 {
	driver=d ;//this.driver=driver;	 
		 PageFactory.initElements(d,this);
	 }
	 
	 public void clickRegLink()
	 {
		 RegLink.click(); 
		 
	 }
	 
	 public void setFirstName(String fname) {
		Firstname.sendKeys(fname) ;
	 }
	 
	 
	 public void setLastName(String lname) {
			lastname.sendKeys(lname) ;
		 }
		  
	 
	 
	 public void setPhone(String ph) {
			phone.sendKeys(ph) ;
		 }
		 
	 public void setemail(String mail) {
			email.sendKeys(mail) ;
		 }
		 
	 
	 public void setAdress(String add1) {
			address1.sendKeys(add1) ;
		 }
		 
	 
	 public void setaddress(String add2) {
			address2.sendKeys(add2) ;
		 }
		 
	 public void setcity(String fname) {
			city.sendKeys(fname) ;
		 }
		  
	 
	 
	 
	 public void setstate(String fname) {
			state.sendKeys(fname) ;
		 }
		  
	 
	 
	 
	 public void setemail1(String fname) {
			username.sendKeys(fname) ;
		 }
	
	
	 
	 public void setcountry() {
			//country.sendKeys(fname) ;
			Select sel=new Select(country);
			sel.selectByValue("2");
			
		 }
		  
	 

	 
	 
	 public void setpassword(String fname) {
			password.sendKeys(fname) ;
		 }
		  

	 
	 
	 public void setconfirmpassword(String fname) {
			confirmpassword.sendKeys(fname) ;
		 }
		  
	 public void clicksubmit()
	 {
		 registerBtn.click(); 
		 
	 } 
}
