package ObjectRepositry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CleartripFlightsHomePage {
	

	WebDriver driver;
	
	public CleartripFlightsHomePage (WebDriver driver) {
		this.driver=driver;
			}
	
	
	By frombox=By.xpath("//input[@id='FromTag']");
	By tobox=By.xpath("//input[@id='ToTag']");
	By date=By.xpath("//input[@id='DepartDate']");
	By adultsselect=By.xpath("//select[@id='Adults']");
	By searchbtn=By.id("SearchBtn");
			
	
	public WebElement FromBox()
	{
		return driver.findElement(frombox);
	}



	public WebElement ToBox()
	{
		return driver.findElement(tobox);
	}

	
	
	public WebElement SelectDate()
	{
		return driver.findElement(date);
	}
	
	public WebElement SelectAdults()
	{
		return driver.findElement(adultsselect);
	}
	
	public WebElement SearchBtn()
	{
		return driver.findElement(searchbtn);
	}
}
