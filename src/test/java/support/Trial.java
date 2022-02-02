package support;

public class Trial 
{
	public static void main(String[]args) throws Throwable
	{
		
		//Browser Launch
		Object [] input=new Object[2];
		         input[0]="Chrome";
		         input[1]="D:\\Automation support\\chromedriver.exe";
		         Temp.browserLaunch(input);
		         
		//Open Application
		Object [] input1=new Object[1];
		         input1[0]="https://www.flipkart.com/";
		         Temp.openApplication();
		//Click on Cancel
		Object [] input2=new Object[1];
		         input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		         Temp.clickOnElement(input2);
		//moveToElement
		Object [] input3=new Object[1];
		         input3[0]="//*[@class='_1_3w1N']";
		         Temp.moveOnElement(input3);
		//Click on My Profile
		Object [] input4=new Object[1];
		         input4[0]="//*[@class='_3vhnxf'][1]";
		         Temp.clickOnElement(input4);
		//Enter User name
		Object [] input5=new Object[2];
		          input5[0]="//*[@class='_2IX_2- VJZDxU']";
		          input5[1]="9970357376";
		          Temp.EnterData(input5);
		//Enter Passsword
		          Object [] input6=new Object[2];
		          input6[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
		          input6[1]="kailas1234";
		          Temp.EnterData(input6);
		//Click on Login button
		Object [] input7=new Object[1];
		          input7[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";
		          Temp.clickOnElement(input7);
		//get Text after successful login
		Object[] input8=new Object[2];
		         input8[0]="//*[text()='Personal Information']";
		         input8[1]="Personal Information";
		         Temp.GetText(input8);
	}

}
