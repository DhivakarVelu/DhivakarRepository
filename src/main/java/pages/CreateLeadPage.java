package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{

	public CreateLeadPage() {
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleEnterCName;

	public CreateLeadPage enterCName(String data) {
		type(eleEnterCName,data);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleEnterFName;

	public CreateLeadPage enterFName(String data) {
		type(eleEnterFName,data);
		return this;		
	}
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleEnterLName;

	public CreateLeadPage enterLName(String data) {
		type(eleEnterLName,data);
		return this;		
	}
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneNumber")
	private WebElement eleEnterPhoneno;

	public CreateLeadPage enterPhoneno(String data) {
		type(eleEnterPhoneno,data);
		return this;		
	}
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleClickEnter;

	public ViewLeadPage clickEnter() {
		click(eleClickEnter);
		return new ViewLeadPage();		
	}









}
