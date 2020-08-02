package Testcases;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import ObjectRepositry.CleartripFlightsBookingPage;
import ObjectRepositry.CleartripFlightsHomePage;


public class ClearTripTestCase1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe"); 
		//Create prefs map to store all preferences 
		Map<String, Object> prefs = new HashMap<String, Object>();

		//Put this into prefs map to switch off browser notification
		prefs.put("profile.default_content_setting_values.notifications", 2);

		//Create chrome options to set this prefs
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);

		//Now initialize chrome driver with chrome options which will switch off this browser notification on the chrome browser
		WebDriver driver = new ChromeDriver(options);

		
		  driver.get("https://www.cleartrip.com/");
		 driver.manage().window().maximize();
		   int rowcount=getRowCount("Details");
	       String[] fromplace = getvalues("From");
	       String[] toplace=getvalues("To");
	       String[] selectdate=getvalues("Date");
	       String[] selectadults=getvalues("Adults");
	       String[] flag=getvalues("Value");
	       System.out.println("RowCount is " +rowcount);
	       for(int i=0;i<rowcount;i++)
	       {
	    	  
	            String from=fromplace[i];
	            String top=toplace[i];
	            String date=selectdate[i];
	            String adults=selectadults[i];
	            String val=flag[i];
	            System.out.println("From is:"+from);
	            System.out.println("To is:"+top);
	            System.out.println("Date is:"+date);
	            System.out.println("Adults is:"+adults);
	            System.out.println("Flag is:"+val);
		 CleartripFlightsHomePage ch=new CleartripFlightsHomePage(driver);
	if (val.equalsIgnoreCase("TRUE"))
		
	{
  		
	     ch.FromBox().click();
	     ch.FromBox().clear();
	     ch.FromBox().sendKeys(from);
	     waitFor(5000);
	     ch.FromBox().sendKeys(Keys.ENTER);
	  
  //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 
	     ch.ToBox().click();
	     ch.ToBox().clear();
	     ch.ToBox().sendKeys(top);
	     waitFor(5000);
	     ch.ToBox().sendKeys(Keys.ENTER);
	   
	     ch.SelectDate().clear(); //to clear date field
	     ch.SelectDate().sendKeys(date);//to enter data
	 	 Select s = new Select(ch.SelectAdults());
		 s.selectByValue(adults);// select value in Adults dropdown
		 
	    ch.SearchBtn().click();
	    System.out.println("Clicked Search button");
	
	    waitFor(6000);
		CleartripFlightsBookingPage cb=new CleartripFlightsBookingPage(driver);
		
		 // driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	    waitFor(8000);
		String title=cb.Title();
		System.out.println("The title of the 2nd page is: "+title);
	   
	  	waitFor(5000);
	     cb.Book().click();
			
	

  
	     waitFor(5000);
	     String MainWindow=driver.getWindowHandle();		
 		
	        // To handle all new opened window.				
	            Set<String> s1=driver.getWindowHandles();		
	        Iterator<String> i1=s1.iterator();		
	        		
	        while(i1.hasNext())			
	        {		
	            String ChildWindow=i1.next();		
	            		
	            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
	            {    		
	                 
	                    // Switching to Child window
	                    driver.switchTo().window(ChildWindow);	 
	              System.out.println("Am here");
	              waitFor(5000);
	     	           titlemethod(driver);			
	                                 
				// Closing the Child Window.
	                        driver.close();		
	            }		
	         
	        }		
	    	
	        // Switching to Parent window i.e Main Window.
	            driver.switchTo().window(MainWindow);
	           
	           driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	            driver.get("https://www.cleartrip.com/");
	     
	  
	
	}
	else if(val.equalsIgnoreCase("FALSE"))
	    	   System.out.println("Cannot be executed as the flag is set to FALSE");
	       }

	       driver.quit();
	       System.out.println("Program completed"); 
	}
	public static void titlemethod(WebDriver driver)
	{
		
        String title1=driver.getTitle();
        String expectedTitle = "Cleartrip | Book your flight securely in simple steps";
        System.out.println("The title of the 3rd page is: "+title1);
        assertEquals(expectedTitle,title1);
      
	}
	
	
	 private static void waitFor(int durationInMilliSeconds) {
	        try {
	            Thread.sleep(durationInMilliSeconds);
	        } catch (InterruptedException e) {
	            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
	        }
	    }
	 
	 
	 public static String[] getvalues(String colname) throws IOException
	 {
	   FileInputStream fis=new FileInputStream(".\\data\\\\CleartripData.xlsx");
	   XSSFWorkbook workbook=new XSSFWorkbook(fis);
	   XSSFSheet sheet = workbook.getSheet("Details");
	   int val = sheet.getLastRowNum();
	   String values[]=new String[val+1];
	   // we can hard code row number as 0 as columnnames will always be in first row
	    XSSFRow row = sheet.getRow(0);
	    int k=0;
	   for(int col=0;col<row.getLastCellNum();col++)
	   {
	       String columnname=row.getCell(col).getStringCellValue();
	       if(columnname.equalsIgnoreCase(colname))
	       {
	           for(int no=1;no<=sheet.getLastRowNum();no++)
	           {
	           try{
	               // we set col into getcell as it belong to the same column which columname
	               values[k++]=sheet.getRow(no).getCell(col).getStringCellValue().toString();
	             
	           }
	            catch(Exception e)
	            {
	               values[k]="";
	            }
	           }
	       }
	   }   
	   return values;
	 }

	  

	 public static int getRowCount(String sheet) throws IOException
	 {
	     FileInputStream fis=new FileInputStream(".\\data\\\\CleartripData.xlsx");
	     XSSFWorkbook workbook=new XSSFWorkbook(fis);
	      XSSFSheet sheetname = workbook.getSheet(sheet);
	     int val = sheetname.getLastRowNum();
	     return val;
	 }

}
