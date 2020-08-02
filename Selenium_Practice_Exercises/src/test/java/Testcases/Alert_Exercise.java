package Testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

public class Alert_Exercise {
	public static void main(String[] args) throws NoAlertPresentException,InterruptedException  {                                                                                                                                     

		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();





// Alert Message handling

                     

driver.get("https://the-internet.herokuapp.com/javascript_alerts");                                 

                    
WebElement JSAlert = driver.findElement(By.xpath("//Button[contains(@onclick,'jsAlert')]"));
JSAlert.click();
Alert alert1 = driver.switchTo().alert();
String alertMessage1= driver.switchTo().alert().getText(); 
System.out.println(alertMessage1); 
//Accepting alert                   
alert1.accept();
System.out.println("Alert1 Completed");
Thread.sleep(5000);



WebElement JSConfirm = driver.findElement(By.xpath("//Button[contains(@onclick,'jsConfirm')]"));
JSConfirm.click();
Alert alert2 = driver.switchTo().alert();
String alertMessage2= driver.switchTo().alert().getText(); 
System.out.println(alertMessage2); 
//Cancelling alert                   
alert2.dismiss();
System.out.println("Alert2 Completed");
Thread.sleep(5000);


WebElement JSPrompt = driver.findElement(By.xpath("//Button[contains(@onclick,'jsPrompt')]"));
JSPrompt.click();
Alert alert3 = driver.switchTo().alert();
String alertMessage3= driver.switchTo().alert().getText(); 
System.out.println(alertMessage3); 
//Sending Keys alert                   
alert3.sendKeys("Test");
Thread.sleep(2000);
alert3.accept();
System.out.println("Alert3 Completed");
Thread.sleep(5000);
driver.quit();

 



      


/* Keerthi Notes:
 * Alert is a pop up we receive from the browser,
 * getText [gets the text of the popup],
 * accept() [Clicks on Ok or continue in the popup], 
 * dismiss() [clicks on cancel, negative button in the popup], 
 * sendKeys() [sends text in the popup])
 * 
 */

}  
}


	
