package resources;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {

	  public WebDriver driver;
	public Properties prop;
public WebDriver initializeDriver() throws IOException
{
	
 prop= new Properties();
FileInputStream fis=new FileInputStream(".\\src\\main\\java\\resources\\data.properties");

prop.load(fis);
String browserName=prop.getProperty("browser");
System.out.println(browserName);

if(browserName.equals("chrome"))
{
	System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe"); 
	//Create prefs map to store all preferences 
	Map<String, Object> prefs = new HashMap<String, Object>();

	//Put this into prefs map to switch off browser notification
	prefs.put("profile.default_content_setting_values.notifications", 2);

	//Create chrome options to set this prefs
	ChromeOptions options = new ChromeOptions();
	options.setExperimentalOption("prefs", prefs);

	//Now initialize chrome driver with chrome options which will switch off this browser notification on the chrome browser
	driver = new ChromeDriver(options);
	
	
}
else if (browserName.equals("firefox"))
{
	 driver= new FirefoxDriver();
	//firefox code
}
else if (browserName.equals("IE"))
{
//	IE code
}

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
return driver;


}

public void getScreenshot(String result) throws IOException
{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("C://test//"+result+"screenshot.png"));
	
}


}
