package pageObjects;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class objectBasepage {
	public WebDriver driver;
	
	public objectBasepage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void setText(WebElement element, String text) {
		element.sendKeys(text);
	
	}
	
	public void clickElement(WebElement element) {
		element.click();
	
	}
	
	
	  public boolean explicitvisible(WebDriver driver, WebElement element) {
		  try {
	  WebDriverWait waitTo = new WebDriverWait(driver, 20);
	  waitTo.until(ExpectedConditions.visibilityOf(element)); 
	  return true;
		  }
		  catch(Exception e)
		  {
			  return false;
		  }
		  
	  }
	  public static void getScreenshot(WebDriver driver) throws IOException
	  {
	  	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  	String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
	  	FileUtils.copyFile(src, new File("C://test//" +"screenshot" +timestamp +".png"));
	  	
	  }
	 
}
