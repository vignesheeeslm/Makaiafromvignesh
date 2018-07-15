package lead.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;

public class EditLeadPage extends PreAndPost{
	
	public EditLeadPage(EventFiringWebDriver driver,ExtentTest test)
	{
		this.driver = driver;
		this.test =test;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(linkText="Edit")
	WebElement eleedit;
	
	@FindBy(id="updateLeadForm_companyName")
	WebElement eleupdatecompany;
	
	@FindBy(className="smallSubmit")
	WebElement elesmallSubmit;
	
	@FindBy(linkText="Find Leads")
	WebElement eleFindLeads;
	
	
	
	EditLeadPage clickeleedit()
	{
		click(eleedit);
		return this;
	
	}
	
	EditLeadPage Typeupdatecompany(String cName)
	{
		type(eleupdatecompany, cName);
		return this;
	}
	
	EditLeadPage clickelesmallSubmit()
	{
		click(elesmallSubmit);
		return this;
	
	}	
	
	/*
	void clickeleFindLeads()
	{
		click(eleFindLeads);
	//	return new FindLeadPage(driver,test);
		
	
	}*/

}
