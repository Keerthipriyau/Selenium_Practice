package Testcases;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Wikepedia_Test1 {
	//This test is to check the dropdown values and print the links present in the webpage
  @Test
  public void values_links() {
	// objects and variables instantiation
	  System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe"); 

      WebDriver driver = new ChromeDriver();

      driver.get("https://www.wikipedia.org/");
      //find the dropdown DROPDOWN element
      WebElement dropdown = driver.findElement(By.id("searchLanguage"));
      //to find the dropdownn elements inside the webelement DROPDOWN
      List <WebElement> values = dropdown.findElements(By.tagName("option"));
      System.out.println("The values size is " +values.size());
      int i=0;
      //to print the 8th dropdown value
      System.out.println(values.get(7).getText());
      //to print all dropdown values and its languate with getAttribute method
      for(i=0; i<values.size(); i++)
    	  System.out.println(values.get(i).getAttribute("Lang"));  
      
      //to Print all footer links
      //to set the bloc in which the links are present
      WebElement block = driver.findElement(By.xpath("//*[@class='footer']"));
      // to find the links inside the block webelement
      List <WebElement> links = block.findElements(By.tagName("a"));
      //to print the links size count
      System.out.println("The Links size is " +links.size());
      //to print the link text and url with href attribute
      for(WebElement link: links) {
    	  System.out.println(link.getText()+"---URL IS ---"+link.getAttribute("href"));
      }
      
      
    		
      }
  }

