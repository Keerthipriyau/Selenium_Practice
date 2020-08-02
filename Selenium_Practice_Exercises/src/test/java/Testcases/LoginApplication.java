package Testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ObjectRepositry.RediffHomePage;
import ObjectRepositry.RediffLoginPage;
import Utilities.Utils;

public class LoginApplication {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe"); 
		 WebDriver driver = new ChromeDriver(); 
		 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 driver.manage().window().maximize();
		 RediffLoginPage rd=new RediffLoginPage(driver);
		 rd.EmailId().sendKeys("keerthi@gmail.com");
		 rd.Password().sendKeys("test");
		 rd.Signin().click();
		 rd.Rediff().click();
		 RediffHomePage rh=new RediffHomePage(driver);
		 rh.Search().sendKeys("Laptop");
		 rh.Submit().click();
		 
		  
		 String title=rh.Title();
		System.out.println("The title of the page is: "+title);
	
		
	Utils.getScreenshot(driver);
	driver.quit();
	}

	

}
