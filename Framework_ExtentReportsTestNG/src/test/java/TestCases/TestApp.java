package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import ObjectRepositry.demoqaRegistration;
import ObjectRepositry.demoqafirstpage;
import resources.MyListener;

public class TestApp extends MyListener {
	demoqafirstpage dfp;
	demoqaRegistration dr;
	

	 @BeforeTest
	 public void beforeTest() {
		 dfp = PageFactory.initElements(driver, demoqafirstpage.class);
	 dr = PageFactory.initElements(driver, demoqaRegistration.class);

	 }
	 @AfterTest
	 public void afterTest() {
	  System.out.println("in after test");
	  dfp = null;
	  dr = null;
	 }
	 @Test
	 public void testDemoQA() throws InterruptedException, IOException {
	  System.out.println("in test method");
	  dfp.loadWebPage("https://demoqa.com/forms");
	  dfp.clickform();
		dr.enterdetails();
	  test.log(LogStatus.INFO, "the test demoqa is passed");
	 }
	}