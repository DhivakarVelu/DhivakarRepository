package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLeads extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLeads";
		testDescription="Create Leads";
		testNodes="Create Leads";
		category="Smoke";
		authors="Dhiva";
		browserName="chrome";
		dataSheetName="TC003";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void createLeads(String uName,String pwd,String cName, String fName, String lName, String desc, String phoneno) {
		/*LoginPage lp = new LoginPage();
		lp.enterUserName();
		lp.enterPassword();
		lp.clickLogIn();*/
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRM()
		.clickLeads()
		.clickCreateLeads()
		.enterCName(cName)
		.enterFName(fName)
		.enterLName(lName)
		.enterPhoneno(phoneno)
		.clickEnter()
		.verifyFName(desc);
		
		
		
		
		
		
		
	}

}
