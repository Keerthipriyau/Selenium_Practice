package Testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Udemy_Assignment1_Test7 {
	//Test to go to Google, search for way2automation, click on first link. Get the number of links in way2automation website and print them.
	
  @Test
  public void num_of_links() {
	  
	  //objects and variables instantiation
	  System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");

  WebDriver driver = new ChromeDriver();

  driver.get("https://www.google.co.in/");
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  
  driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("way2automation");
  
  driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).sendKeys(Keys.ENTER);
  System.out.println("click submit");
  driver.findElement(By.xpath("//h3[text() = 'Way2Automation']")).click();
  System.out.println("clicked link");
  List <WebElement> links = driver.findElements(By.tagName("a"));
  //to print the links size count
  System.out.println("The Links size is " +links.size());
  //to print the link text and url with href attribute
  for(WebElement link: links) {
	  System.out.println(link.getText()+"---URL IS ---"+link.getAttribute("href"));
  }
  
  
  }
}
