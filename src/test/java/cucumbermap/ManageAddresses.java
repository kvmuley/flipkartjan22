package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import support.HTMLReportGenerator;
import support.Temp;

public class ManageAddresses 
{
	@When("^user move on manage address button$")
	public void user_move_on_manage_address_button() throws Throwable 
	{
		Object [] input18=new Object[1];
        input18[0]="//*[text()='Manage Addresses']";
        Hashtable<String,Object> output18=Temp.moveOnElement(input18);
HTMLReportGenerator.StepDetails(output18.get("STATUS").toString(), "^user move on manage address button$", output18.get("MESSAGE").toString());
	}
	
	@When("^user click on manage addresses$")
	public void user_click_on_manage_addresses() throws Throwable 
	{
		Object [] input9=new Object[1];
        input9[0]= "//*[text()='Manage Addresses']";
        Hashtable<String,Object> output9=Temp.clickOnElement(input9);
HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(), "^user click on manage addresses$", output9.get("MESSAGE").toString());    
	}

	@When("^user click on Add a new address$")
	public void user_click_on_Add_a_new_address() throws Throwable 
	{
		Object [] input10=new Object[1];
        input10[0]="//*[@class='_1QhEVk']";
        Hashtable<String,Object> output10=Temp.clickOnElement(input10);
HTMLReportGenerator.StepDetails(output10.get("STATUS").toString(), "^user click on Add a new address$", output10.get("MESSAGE").toString());
	}

	@When("^user enetr \"([^\"]*)\" as name$")
	public void user_enetr_as_name(String name) throws Throwable 
	{
		Object [] input11=new Object[2];
        input11[0]="//*[@name='name']";
        input11[1]=name;
        Hashtable<String,Object> output11=Temp.EnterData(input11);
HTMLReportGenerator.StepDetails(output11.get("STATUS").toString(), "^user enetr \"([^\"]*)\" as name$", output11.get("MESSAGE").toString()); 
	}

	@When("^user enter \"([^\"]*)\" as mobile number$")
	public void user_enter_as_mobile_number(String mobile) throws Throwable 
	{
		Object [] input12=new Object[2];
        input12[0]="//*[@name='phone']";
        input12[1]=mobile;
        Hashtable<String,Object> output12=Temp.EnterData(input12);
HTMLReportGenerator.StepDetails(output12.get("STATUS").toString(), "^user enter \"([^\\\"]*)\" as mobile number$", output12.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as Pincode$")
	public void user_enter_as_Pincode(String pin) throws Throwable 
	{
		Object [] input13=new Object[2];
        input13[0]="//*[@name='pincode']";
        input13[1]=pin;
        Hashtable<String,Object> output13=Temp.EnterData(input13);
HTMLReportGenerator.StepDetails(output13.get("STATUS").toString(), "^user enter \"([^\\\"]*)\" as Pincode$", output13.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as locality$")
	public void user_enter_as_locality(String locality) throws Throwable 
	{
		Object [] input14=new Object[2];
        input14[0]="//*[@name='addressLine2']";
        input14[1]=locality;
        Hashtable<String,Object> output14=Temp.EnterData(input14);
HTMLReportGenerator.StepDetails(output14.get("STATUS").toString(), "^user enter \"([^\"]*)\" as locality$", output14.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as address$")
	public void user_enter_as_address(String add) throws Throwable 
	{
		Object [] input15=new Object[2];
        input15[0]="//*[@name='addressLine1']";
        input15[1]=add;
        Hashtable<String,Object> output15=Temp.EnterData(input15);
HTMLReportGenerator.StepDetails(output15.get("STATUS").toString(), "^user enter \"([^\"]*)\" as address$", output15.get("MESSAGE").toString());
	}

	@When("^user select address type as home$")
	public void user_select_address_type_as_home() throws Throwable 
	{
		Object [] input16=new Object[1];
        input16[0]="//*[@for='HOME']";
        Hashtable<String,Object> output16=Temp.clickOnElement(input16);
HTMLReportGenerator.StepDetails(output16.get("STATUS").toString(), "^user select address type as home$", output16.get("MESSAGE").toString());	  
	}

	@When("^user click on save button$")
	public void user_click_on_save_button() throws Throwable 
	{
		Object [] input17=new Object[1];
        input17[0]="//*[@class='_2KpZ6l _1JDhFS _1o0c4q _3AWRsL']";
        Hashtable<String,Object> output17=Temp.clickOnElement(input17);
HTMLReportGenerator.StepDetails(output17.get("STATUS").toString(), "^user click on save button$", output17.get("MESSAGE").toString());
	}

	@Then("^application shows new address added successfully$")
	public void application_shows_new_address_added_successfully() throws Throwable 
	{
		Object[] input19=new Object[2];
        input19[0]="//*[text()='7972982151']";
        input19[1]="7972982151";
        Hashtable<String,Object> output19=Temp.GetText(input19);
HTMLReportGenerator.StepDetails(output19.get("STATUS").toString(), "^application shows new address added successfully$", output19.get("MESSAGE").toString());
	}


}
