package cucumberOptions;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.PickleEventWrapper;
import cucumber.api.testng.TestNGCucumberRunner;



//@RunWith(Cucumber.class)
@CucumberOptions(  
		plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
		strict=true,
		  features = { "src/test/java/features" },
	    glue={ "stepDefinations" },
	    dryRun=false,
	    monochrome=true)

public class runnerSample extends AbstractTestNGCucumberTests  {

	private TestNGCucumberRunner testNGCucumberRunner;

	 


    /**
     * @throws Exception
     */
    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
        System.out.println("This is @BeforeClass annotation");
    }

 

    /**
     * @param pickleEvent
     * @param cucumberFeature
     * @throws Throwable
     */
    @Test(groups = "Cucumber", description = "Runs Cucumber Scenarios", dataProvider = "scenarios")
    public void scenario(PickleEventWrapper pickleEvent, CucumberFeatureWrapper cucumberFeature) throws Throwable {
        testNGCucumberRunner.runScenario(pickleEvent.getPickleEvent());
    }

 

    /**
     * @return
     */
    @DataProvider
    public Object[][] scenarios() {
        return testNGCucumberRunner.provideScenarios();
    }

 

    /**
     * @throws Exception
     */
    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
        testNGCucumberRunner.finish();
        //SendEmail.sndmail(); ---- Remove this for sendin email after Jenkins job is executed
        // tearDown();
    }
}
 