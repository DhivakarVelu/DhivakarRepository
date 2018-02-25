package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyViewLeadPage extends ProjectMethods{

	public MyViewLeadPage() {
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement eleClickEditButton;

	public EditLeadPage clickEditButton() {
		click(eleClickEditButton);
		return new EditLeadPage();		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Delete")
	private WebElement eleClickDeleteButton;

	public MyLeadPage clickDeleteButton() {
		click(eleClickDeleteButton);
		return new MyLeadPage();		
	}
	
	









}
