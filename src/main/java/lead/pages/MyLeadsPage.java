package lead.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;

public class MyLeadsPage extends WebDriverServiceImpl{
	
	public MyLeadsPage(EventFiringWebDriver driver,ExtentTest test)
	{
		this.driver = driver;
		this.test =test;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Create Lead")
	WebElement elecreateleadlink;
	
	@FindBy(linkText="Find Leads")
	WebElement elefindleadlink;
	

	CreateLeadPage clickcreateleads()
	{
		click(elecreateleadlink);
		return new CreateLeadPage(driver,test);
		
	
	}


	FindLeadPage clickfindleads()
	{
		click(elefindleadlink);
		return new FindLeadPage(driver,test);
		
	
	}


}
