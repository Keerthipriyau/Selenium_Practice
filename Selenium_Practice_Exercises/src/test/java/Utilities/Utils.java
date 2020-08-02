package Utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utils {



public static void getScreenshot(WebDriver driver) throws IOException {

	 try {
	String timestamp = new SimpleDateFormat("yyyy_MM_dd").format(new Date());
	File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	File targetFile = new File(".\\Screenshots",
	"Keerthi_" + timestamp + ".jpg");
	FileUtils.copyFile(screenshotFile, targetFile);
	} catch (Exception e) {
	System.out.println("An exception occured while taking screenshot " + e.getCause());
	}
	}


}
