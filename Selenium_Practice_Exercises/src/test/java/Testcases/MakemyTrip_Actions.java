package Testcases;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Utilities.Utils;

public class MakemyTrip_Actions {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe"); 
		 WebDriver driver = new ChromeDriver(); 
		 driver.get("https://www.makemytrip.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
		 Actions action = new Actions(driver);
		 action.click();
		// driver.findElement(By.xpath("//li[@class='menu_Flights']")).click();
	WebElement More=driver.findElement(By.xpath("//span[text()='More']"));

	
	action.moveToElement(More).click(driver.findElement(By.xpath("//a[@href='//mybiz.makemytrip.com/']"))).build().perform();
	
	Utils.getScreenshot(driver);
	
	
Robot robot=new Robot();
robot.keyPress(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_A);
robot.keyRelease(KeyEvent.VK_A);
robot.keyRelease(KeyEvent.VK_CONTROL);
Thread.sleep(2000);

Rectangle screenSize = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());

// Take the Snapshot of the Screen

            BufferedImage tmp = robot.createScreenCapture(screenSize); 

            

            // Provide the destination details to copy the screenshot

            String path=".\\Screenshots\\Keerthi"+System.currentTimeMillis()+".jpg";

            

            // To copy source image in to destination path

            ImageIO.write(tmp, "jpg",new File(path));
            driver.quit();
            
            
	}

}
