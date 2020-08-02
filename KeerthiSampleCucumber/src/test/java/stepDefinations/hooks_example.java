package stepDefinations;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks_example {
	
	@Before
	public void hello()
	{
		System.out.println("BeforeScenario");
		
	}
	
	@After
	public void world()
	{
		System.out.println("AfterScenario");
		
	}

}
