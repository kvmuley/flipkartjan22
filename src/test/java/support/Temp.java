package support;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumbermap.ConfigReader;

public class Temp 
{
        public static WebDriver driver=null;
        public static ConfigReader config=null;
	
    public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>();
	//Browser Launch
	public static Hashtable<String,Object> browserLaunch(Object[]inputParameters)
	{
	try {
		String strBrowserName=(String) inputParameters[0];
		config=new ConfigReader();
		
		if(strBrowserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", config.getDriverPathChrome());
			  driver=new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		}
		else if(strBrowserName.equalsIgnoreCase("FireFox"))
		{
			System.setProperty("webdriver.gecko.driver", config.getDriverPathFF());
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		}
		outputParameters.put("STATUS","PASS");
		outputParameters.put("MESSAGE", "methodUsed: browserLaunch, Input_Data : " + config.getDriverPathChrome().toString());
		
	}catch(Exception e) 
	{
		outputParameters.put("STATUS","FAIL");
		outputParameters.put("MESSAGE", "methodUsed: browserLaunch, Input_Data : " + config.getDriverPathChrome().toString());	
	}
	return outputParameters;
	}
	
	//open Application
	public static Hashtable<String,Object> openApplication()
	{
	try {
		
		driver.get(config.getApplicationUrl());
		  driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		outputParameters.put("STATUS","PASS");
		outputParameters.put("MESSAGE", "methodUsed: openApplication, Input_Data : " + config.getApplicationUrl().toString());
	}catch(Exception e)
	{
		outputParameters.put("STATUS","FAIL");
		outputParameters.put("MESSAGE", "methodUsed: openApplication, Input_Data : " + config.getApplicationUrl().toString());
	}
     	return outputParameters;
	}
	//Click on Cancel
	public static Hashtable<String,Object> clickOnElement(Object[]inputParameters) throws Throwable
	{
	try {String xpath=(String) inputParameters[0];
		driver.findElement(By.xpath(xpath)).click();
		  driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		outputParameters.put("STATUS","PASS");
		outputParameters.put("MESSAGE", "methodUsed: clickOnElement, Input_Data : " + inputParameters[0].toString());
	}catch(Exception e)
	{
		outputParameters.put("STATUS","FAIL");
		outputParameters.put("MESSAGE", "methodUsed: clickOnElement, Input_Data : " + inputParameters[0].toString());
	}
		return outputParameters;
	}
	//moveOnElement
	public static Hashtable<String,Object> moveOnElement(Object[]inputParameters) throws Throwable
	{
	try {String xpath=(String) inputParameters[0];
		Actions act=new Actions(driver);
		WebElement element=driver.findElement(By.xpath(xpath));
		  act.moveToElement(element).build().perform();
		  driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		  outputParameters.put("STATUS","PASS");
		  outputParameters.put("MESSAGE", "methodUsed: moveOnElement, Input_Data : " + inputParameters[0].toString());
	}catch(Exception e) 
	{
		 outputParameters.put("STATUS","FAIL");
		 outputParameters.put("MESSAGE", "methodUsed: moveOnElement, Input_Data : " + inputParameters[0].toString());
	}
		  return outputParameters;
	}
	//Enter user name and password
	public static Hashtable<String,Object> EnterData(Object[]inputParameters)
	{
	try {String data=(String) inputParameters[0];
		String value=(String) inputParameters[1];
		driver.findElement(By.xpath(data)).sendKeys(value);
		  driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		outputParameters.put("STATUS","PASS");
		outputParameters.put("MESSAGE", "methodUsed: EnterData, Input_Data : " + inputParameters[1].toString());
	}catch(Exception e) 
	{
		outputParameters.put("STATUS","FAIL");
		outputParameters.put("MESSAGE", "methodUsed: EnterData, Input_Data : " + inputParameters[1].toString());
	}
		return outputParameters;
	}
	//Get Text
	public static Hashtable<String,Object> GetText(Object[]inputParameters)
	{
	try {String textpath=(String) inputParameters[0];
		WebElement getfrom=driver.findElement(By.xpath(textpath));
		   String passtext=getfrom.getText();
	    String textvalue=(String) inputParameters[1];
	    if(passtext.equalsIgnoreCase(textvalue))
	    {
	    	System.out.println("test case passed");
	    }
	    
	    else
	    {
	    	System.out.println("test case failed");
	    }
	    outputParameters.put("STATUS","PASS");
		outputParameters.put("MESSAGE", "methodUsed: GetText, Input_Data : " + inputParameters[1].toString());
	}catch(Exception e) 
	{
		 outputParameters.put("STATUS","FAIL");
		 outputParameters.put("MESSAGE", "methodUsed: GetText, Input_Data : " + inputParameters[1].toString());
	}
	    return outputParameters;
	}	
}
