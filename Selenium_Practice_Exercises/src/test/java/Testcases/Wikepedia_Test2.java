package Testcases;

import java.io.File;
import java.io.IOException;
import java.util.Date;

//import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
//Test to showIsElement Present
//IsDisplayed() will just gives the visibility, it will throw element not found exception, if the element is not present in DOM. But when the element is present, but hidden then False will be returned. Whereas if the elelment is present then true will be displayed.

public class Wikepedia_Test2 {
	
public static WebDriver driver;

  
  public static boolean isElementPresent(By by) {
	/*  try {
		  driver.findElement(By.xpath(locator));
		  return true;
	  } catch (Throwable t) {
			  return false;
  }*/
	  int size = driver.findElements(by).size();
	  if (size==0)
		  return false;
	  else
		  return true;
	  
}
  public static void captureScreenshot() throws IOException {

		Date d = new Date();
		String fileName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(".//screenshot//" + fileName));

	}
  public static void main(String[] args) throws IOException {
	// objects and variables instantiation
	  System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe"); 

     driver = new ChromeDriver();

     driver.get("https://www.wikipedia.org/");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     captureScreenshot();
     
     System.out.println(isElementPresent(By.xpath("//*[@id='searchLanguage']")));
     //System.out.println(driver.findElement(By.xpath("//*[@id='searchLanguage123']")).isDisplayed());
  
  }
  
 
}
