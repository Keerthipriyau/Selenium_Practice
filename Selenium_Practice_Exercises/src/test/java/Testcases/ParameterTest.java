package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParameterTest {
	@Test
    @Parameters({ "browser" })
    public void launch_Browser(String browser) throws Exception
{
   
        WebDriver driver;
       
        if (browser.equalsIgnoreCase("chrome"))
        {
        	System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(" https://www.spicejet.com/");
        System.out.println("Browser name"+ browser );
        driver.quit();
        }
       
        else if(browser.equalsIgnoreCase("firefox"))
           
        {
           
       
        	System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");
        driver = new FirefoxDriver();
            driver.get(" https://www.spicejet.com/");
            System.out.println("Browser name"+ browser );
            driver.quit();
            }   
       
       
        else{
       
            throw new Exception("Browser is not correct");
            }
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            }
}