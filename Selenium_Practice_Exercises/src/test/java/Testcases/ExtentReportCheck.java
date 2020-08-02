package Testcases;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

 

import java.io.File;
import java.io.FileInputStream;

 

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 



 

public class ExtentReportCheck {

 

    public static void main(String[] args) {
		
    	System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe"); 
		  WebDriver driver=new ChromeDriver(); driver.manage().window().maximize();
		 
        driver.get("https://www.google.com");
        ExtentReports report = new ExtentReports(".//Reports//Report1.html");
        report.loadConfig(new File(".\\src\\test\\java\\config.xml"));
        ExtentTest test = report.startTest("Login Functionality", "To check login functionality");
        System.out.println("start");
        test.log(LogStatus.INFO, "Information displayed");
        test.log(LogStatus.PASS, "Pass statement");
        test.log(LogStatus.FAIL, "Fail statement");
        test.log(LogStatus.WARNING, "warning statement");
        test.log(LogStatus.SKIP, "Skip statement");
        test.log(LogStatus.FATAL, "Fatal error statement");
        test.log(LogStatus.ERROR, " error statement");
        if (report != null) {
            //report.endTest(test);
            System.out.println("rep...");
        //    report.flush();
            
        }
       test = report.startTest("Login Functionality-invalid user", "To check login functionality for invalid user");
        System.out.println("start");
        test.log(LogStatus.INFO, "Information displayed");
        test.log(LogStatus.PASS, "Pass statement");
        test.log(LogStatus.FAIL, "Fail statement");
        test.log(LogStatus.WARNING, "warning statement");
        test.log(LogStatus.SKIP, "Skip statement");
        //test.log(LogStatus.FATAL, "Fatal error statement");
        test.log(LogStatus.ERROR, " error statement");
        //report.endTest(test);
    
        test.log(LogStatus.INFO,"Snapshot below: "+test.addScreenCapture(addScreenshot(driver)));
        report.flush();
        report.endTest(test);
    }
    
     public static String addScreenshot(WebDriver driver) {
         String encodedBase64 = null;
         FileInputStream fileInputStreamReader = null;
         try {
             File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
             fileInputStreamReader = new FileInputStream(scrFile);
         
             
             byte[] bytes = new byte[(int)scrFile.length()];
             fileInputStreamReader.read(bytes);
             encodedBase64 = new String(Base64.encodeBase64(bytes));
         } catch (Exception e) {
             e.printStackTrace();
         }
         return "data:image/png;base64,"+encodedBase64;
     }
}