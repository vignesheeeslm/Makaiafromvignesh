package lead.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;

public class VerifyLeadPage extends WebDriverServiceImpl{
	
	public VerifyLeadPage(EventFiringWebDriver driver,ExtentTest test)
	{
		this.driver = driver;
		this.test =test;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Create Lead")
	WebElement elecreateleadlink;
	

	/*CreateLeadPage clickcreateleads()
	{
		click(elecreateleadlink);
		
		
	
	}
*/
}
