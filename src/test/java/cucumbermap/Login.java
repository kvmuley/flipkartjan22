package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import support.HTMLReportGenerator;
import support.Temp;

public class Login 
{
	@Given("^user open \"([^\"]*)\" browser with exe$")
	public void user_open_browser_with_exe(String bname)
	{
		Object [] input=new Object[2];
        input[0]=bname;
        Temp.browserLaunch(input);
	}

	@Given("^user open url as$")
	public void user_open_url_as() throws Throwable
	{
		
        Temp.openApplication();	
	}

	@When("^user click on cancel button$")
	public void user_click_on_cancel_button() throws Throwable 
	{
		Object [] input2=new Object[1];
        input2[0]="//*[@class='_2KpZ6l _2doB4z']";
        Hashtable<String,Object> output2=Temp.clickOnElement(input2);
HTMLReportGenerator.StepDetails(output2.get("STATUS").toString(), "^user click on cancel button$", output2.get("MESSAGE").toString());
	}

	@When("^user move on Login DropDown$")
	public void user_move_on_Login_DropDown() throws Throwable 
	{
		Object [] input3=new Object[1];
        input3[0]="//*[@class='_1_3w1N']";
        Hashtable<String,Object> output3=Temp.moveOnElement(input3);
HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(), "^user move on Login DropDown$", output3.get("MESSAGE").toString());
	}

	@When("^user click on My Profile$")
	public void user_click_on_My_Profile() throws Throwable 
	{
		Object [] input4=new Object[1];
        input4[0]="//*[@class='_3vhnxf'][1]";
        Hashtable<String,Object> output4=Temp.clickOnElement(input4);
HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "^user click on My Profile$", output4.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String uname) throws Throwable 
	{
		Object [] input5=new Object[2];
        input5[0]="//*[@class='_2IX_2- VJZDxU']";
        input5[1]=uname;
        Hashtable<String,Object> output5=Temp.EnterData(input5);
HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "^user enter \"([^\"]*)\" as username$", output5.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String pw) throws Throwable 
	{
		Object [] input6=new Object[2];
        input6[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
        input6[1]=pw;
        Hashtable<String,Object> output6=Temp.EnterData(input6);
HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(), "^user enter \"([^\"]*)\" as password$", output6.get("MESSAGE").toString());	
	}

	@When("^user click on Login button$")
	public void user_click_on_Login_button() throws Throwable 
	{
		Object [] input7=new Object[1];
        input7[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";
        Hashtable<String,Object> output7=Temp.clickOnElement(input7);
HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "^user click on Login button$", output7.get("MESSAGE").toString());	
	}

	@Then("^Application shows user profile to user$")
	public void application_shows_user_profile_to_user() throws Throwable 
	{
		Object[] input8=new Object[2];
        input8[0]="//*[text()='Personal Information']";
        input8[1]="Personal Information";
        Hashtable<String,Object> output8=Temp.GetText(input8);
HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "^Application shows user profile to user$", output8.get("MESSAGE").toString());	
	}

}
