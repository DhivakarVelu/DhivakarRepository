package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyFindPage extends ProjectMethods{

	public MyFindPage() {
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.XPATH,using="(//span[@class='x-tab-strip-text ']) [2]")
	private WebElement eleClickPhone;

	public MyFindPage clickPhone() {
		click(eleClickPhone);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='phoneNumber']")
	private WebElement eleEnterPhoneNo;

	public MyFindPage enterPhoneNo(String data) {
		type(eleEnterPhoneNo, data);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="(//button[@class='x-btn-text']) [7]")
	private WebElement eleClickFindLeads;

	public MyFindPage clickFindLeads() {
		click(eleClickFindLeads);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a")
	private WebElement eleClickResultLead;

	public MyViewLeadPage clickResultLead() throws InterruptedException {
		Thread.sleep(2000);
		click(eleClickResultLead);
		return new MyViewLeadPage();		
	}
	









}
