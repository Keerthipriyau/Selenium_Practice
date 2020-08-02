package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {
    public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.udemy.com/");
	Thread.sleep(5000);
	   String title = driver.getTitle();
	   System.out.println("Title is: " +title);
	   driver.quit();
    }
}

