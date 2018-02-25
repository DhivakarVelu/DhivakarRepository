package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeadPage extends ProjectMethods{

	public MyLeadPage() {
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement eleClickCreateLeads;

	public CreateLeadPage clickCreateLeads() {
		click(eleClickCreateLeads);
		return new CreateLeadPage();		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleClickFindLeads;

	public MyFindPage clickFindLeads() {
		click(eleClickFindLeads);
		return new MyFindPage();		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement eleClickMergeLeads;

	public CreateLeadPage clickMergeLeads() {
		click(eleClickMergeLeads);
		return new CreateLeadPage();		
	}
	









}
