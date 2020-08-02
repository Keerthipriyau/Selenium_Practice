package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//rahulonlinetutor@gmail.com
public class portalHomePage {

	
	public WebDriver driver;
	
	By welcome=By.xpath("//li[text()='Welcome Admin']");
	
	
	
	
	
	public portalHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}




	
	public WebElement welcomeScreen()
	{
		return driver.findElement(welcome);
	}
	
	
	
}
