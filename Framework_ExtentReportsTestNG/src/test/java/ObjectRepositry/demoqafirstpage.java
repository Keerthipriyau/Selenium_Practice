package ObjectRepositry;

	

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class demoqafirstpage {

	WebDriver driver;
	 @FindBy(xpath = "//span[text()='Practice Form']") WebElement pForm;
	
	 public demoqafirstpage(WebDriver driver) {
	  super();
	  this.driver = driver;
	 }
	
	 public void clickform() {
		 pForm.click();
	 }
	 public void loadWebPage(String url) {
	  driver.get(url);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 }
	}