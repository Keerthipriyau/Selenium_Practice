package Testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WelcomeTest {




public static String excel_Read_value(int a, int b) throws IOException
{
	 File file=new File(".\\data\\Sample.xlsx");
	 
	   // load file
	   FileInputStream fis=new FileInputStream(file);
	 
	   // Load workbook
	   XSSFWorkbook wb=new XSSFWorkbook(fis);
	   
	   // Load sheet- Here we are loading first sheetonly
	      XSSFSheet sheet= wb.getSheet("Login");
	     	      String value = sheet.getRow(a).getCell(b).getStringCellValue();
		
		return value;
		

}

public static void main(String[] args) throws IOException {
	// TODO Auto-generated method stub
	
	String username = excel_Read_value(1, 0);
	String password = excel_Read_value(1, 1);
	System.out.println("Username is : "+username);
	System.out.println("Password is : "+password);	
	System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe"); 
		 WebDriver driver = new ChromeDriver(); 
		 driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize(); 
		 String title = driver.getTitle();
		 System.out.println("Title is: " +title); 
		 
        WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[2]")); 
        email.sendKeys(username); 
        WebElement passwd = driver.findElement(By.xpath("//input[@type='password']"));
		 passwd.sendKeys(password);
		  
		
		System.out.println("Iam here");


	}

}


