package cucumbermap;

import java.net.UnknownHostException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import support.HTMLReportGenerator;

public class Hookable 
{
	@Before
	  public void before(Scenario scenario) throws UnknownHostException
	{
		HTMLReportGenerator.TestSuiteStart("E:\\Maven project testing\\Flipkart\\target\\Report\\flipkart.html", "FlipkartProject");
		HTMLReportGenerator.TestCaseStart(scenario.getName(), scenario.getStatus());
		System.out.println("------------------------------Scenario start------------------------------------");
		
	}

	
	@After
	public void after(Scenario scenario)
	{
		
		System.out.println("-------------------------------Scenario end------------------------------------");
		HTMLReportGenerator.TestCaseEnd();
		HTMLReportGenerator.TestSuiteEnd();
	}

}
