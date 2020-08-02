package ObjectRepositry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CleartripFlightsBookingPage {
	

	WebDriver driver;
	
	public CleartripFlightsBookingPage (WebDriver driver) {
		this.driver=driver;
			}
	
	

	By book=By.xpath("(//div//button[contains(.,'Book')])[3]");

	public String Title()
	{
		return driver.getTitle();
	}
	
	
	
	public WebElement Book()
	{
		return driver.findElement(book);
	}

	
}
