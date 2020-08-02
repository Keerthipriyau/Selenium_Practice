package pageObjects;



import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends objectBasepage {

	//public WebDriver driver;

	
	@FindBy(id="txtUsername")
	public WebElement email;
	
	@FindBy(id="txtPassword")
	public WebElement password;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	public WebElement login;
	
	
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		super(driver); //it takes the parent driver
		PageFactory.initElements(driver, this);
	}

public void loginUser(String username, String password) throws IOException
{
	 LoginPage lp=new LoginPage(driver);
	if (lp.explicitvisible(driver, lp.email))
		 lp.setText(lp.email, username);
		 else
		 {
			 System.out.println("Email Element not Found");
		 objectBasepage.getScreenshot(driver);
		 }
		 if (lp.explicitvisible(driver, lp.password))	
			lp.setText(lp.password, password);
		 else
			 System.out.println("Password Element not Found");
			//lp.enterPassword(password);
		 if (lp.explicitvisible(driver, lp.login))	
	        lp.clickElement(lp.login);
		 else
			 System.out.println("Login button Element not Found");
}
}
