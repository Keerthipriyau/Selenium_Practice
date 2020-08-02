package Testcases;

import java.io.IOException;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 

public class AutoIT {
    static WebDriver driver;

 

    public static void main(String[] args) throws InterruptedException, IOException {
        if (autoITUpload() == true) {
            System.out.println("File upload is pass");
        } else {
            System.out.println("File upload is fail");
        }
    }

 

    public static boolean autoITUpload() throws InterruptedException, IOException {
    	System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe"); 
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://altoconvertpdftojpg.com/");
        driver.findElement(By.xpath("//button[@aria-controls='dropzoneInput']")).click();
        driver.findElement(By.xpath("//button[@aria-controls='dropzoneInput']")).isDisplayed();
        Thread.sleep(5000);
        Runtime.getRuntime().exec(".\\AutoIT\\fileupload.exe");
        Thread.sleep(5000);
        driver.quit();
        return true;
    }

    

}
