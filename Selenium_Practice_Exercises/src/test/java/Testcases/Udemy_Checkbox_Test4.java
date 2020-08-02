package Testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Udemy_Checkbox_Test4 {
  @Test
  public void check() {
	// objects and variables instantiation
	  System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");

     WebDriver driver = new ChromeDriver();

     driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
     WebElement block = driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]"));
     List<WebElement> checkboxes = block.findElements(By.name("sports"));
     int count=0;
     for (WebElement checkbox: checkboxes)
     {
    	 checkbox.click();
    	 count++;
     }
     System.out.println("Total checkboxes are: " +count);
     System.out.println("Checked all checkboxes");
     }
  }

