package ObjectRepositry;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class demoqaRegistration {

	WebDriver driver;
	
	@FindBy(id="firstName") WebElement Fname;
	@FindBy(id="lastName") WebElement Lname;
	@FindBy(id="userEmail") WebElement EmaId;
	@FindBy(id="userNumber") WebElement number;
	@FindBy(id="submit") WebElement submitbtn;
	
		
	
	
	 public demoqaRegistration(WebDriver driver) {
	  super();
	  this.driver = driver;
	 }
	 public void enterdetails() throws InterruptedException, IOException {
		 
		  
		 Fname.sendKeys("Keerthi");
		 Lname.sendKeys("Priya");
		 EmaId.sendKeys("test@test12.com");

		 number.sendKeys("9090909090");
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,5000)");
		 
		 Thread.sleep(4000);
		 submitbtn.click();
			js.executeScript("window.scrollBy(0,1000)");
		 
			 Thread.sleep(4000);
	       }
}	
		 
	 
	 