package lead.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;

public class FindLeadPage extends PreAndPost{
	
	public FindLeadPage(EventFiringWebDriver driver,ExtentTest test)
	{
		this.driver = driver;
		this.test =test;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="(//input[@name='firstName'])[3]")
	WebElement elefirstname;
	@FindBy(xpath="//button[text()='Find Leads']")
	WebElement elesearchbutton;
	@FindBy(xpath="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	WebElement elesearchLead;
		
	String leadID = getText(elesearchLead) ;
		
	
		
	FindLeadPage Typefirstname(String searchname)
	{
		type(elefirstname, searchname);
		return this;
	}
	
		
	FindLeadPage clickfindleadssubmit()
	{
		click(elesearchbutton);
		return this;
	}
	
	EditLeadPage clicksearchedlead()
	{
		click(elesearchLead);
		return new EditLeadPage(driver,test);
	}
	
		

}
