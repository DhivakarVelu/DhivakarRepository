package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DeleteLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC004_EditLeads";
		testDescription="Edit Leads";
		testNodes="Edit Leads";
		category="Smoke";
		authors="Dhiva";
		browserName="chrome";
		dataSheetName="TC004";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void createLeads(String uName,String pwd, String phoneno, String companyName) throws InterruptedException {
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
		.clickFindLeads()
		.clickPhone()
		.enterPhoneNo(phoneno)
		.clickFindLeads()
		.clickResultLead()
		.clickDeleteButton();
		
		
		
		
		
		
		
	}

}
