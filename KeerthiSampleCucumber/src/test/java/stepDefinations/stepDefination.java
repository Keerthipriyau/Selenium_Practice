package stepDefinations;





import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

import pageObjects.LoginPage;

import pageObjects.portalHomePage;
import resources.base;

public class stepDefination extends base {

	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver = initializeDriver();
	}
	
	

	@And("^Navigate to \"([^\"]*)\" Site$")

	public void navigate_to_Site(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
	}

	@And("^Go to \"([^\"]*)\" Site$")
	public void go_to_something_site(String arg2) throws Throwable {
		driver.get(arg2);
		driver.manage().window().maximize();
	}
	


@When("^I login with following credentials$")
public void i_login_with_following_credentials(DataTable dt) {
	List<String> list = dt.asList(String.class);
	System.out.println("Username - " + list.get(0));
	System.out.println("Password - " + list.get(1));
}



  

	@Then("^Verify that user is succesfully logged in$")
	public void verify_that_user_is_succesfully_logged_in() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		portalHomePage p = new portalHomePage(driver);
		Assert.assertTrue(p.welcomeScreen().isDisplayed());
	}

	@When("^User enters (.+) and (.+) and logs in$")
	public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
		LoginPage lp = new LoginPage(driver);
		lp.loginUser(username, password);
		System.out.println("Successfully logged in");

	}

	@And("^close browsers$")
	public void close_browsers() throws Throwable {

		driver.quit();
	}

}
