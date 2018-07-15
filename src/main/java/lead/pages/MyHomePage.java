package lead.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import lib.listeners.WebDriverListener;
import lib.selenium.WebDriverServiceImpl;

public class MyHomePage extends WebDriverServiceImpl{
	
	public MyHomePage(EventFiringWebDriver driver,ExtentTest test)
	{
		this.driver = driver;
		this.test =test;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Leads")
	WebElement eleleadlink;
	

	public MyLeadsPage clickleads()
	{
		click(eleleadlink);
		return new MyLeadsPage(driver, test);
		
	
	}

}
