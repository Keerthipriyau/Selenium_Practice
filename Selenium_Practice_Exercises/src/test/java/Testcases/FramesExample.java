package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe"); 
		 WebDriver driver = new ChromeDriver(); 
		 driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		 driver.manage().window().maximize();
		   JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1500)");
			Thread.sleep(5000);
		 driver.switchTo().frame(driver.findElement(By.id("courses-iframe")));
		 driver.findElement(By.className("login-btn")).click();
		 
		 //driver.switchTo().defaultContent(); //to come to original content, out of iframes
		 driver.quit();
		
	}

}
