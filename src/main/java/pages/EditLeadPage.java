package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods{

	public EditLeadPage() {
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement eleEnterCompanyName;

	public EditLeadPage enterCompanyName(String data) {
		type(eleEnterCompanyName, data);
		return this;		
	}
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleClickEditSubmit;

	public MyViewLeadPage clickEditSubmit() {
		click(eleClickEditSubmit);
		return new MyViewLeadPage();		
	}









}
