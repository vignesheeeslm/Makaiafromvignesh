package lead.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;

public class CreateLeadPage extends PreAndPost{
	
	public CreateLeadPage(EventFiringWebDriver driver,ExtentTest test)
	{
		this.driver = driver;
		this.test =test;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id="createLeadForm_companyName")
	WebElement eleCompanyName;
	@FindBy(id="createLeadForm_firstName")
	WebElement eleFName;
	@FindBy(id="createLeadForm_lastName")
	WebElement eleLname;
	@FindBy(id="createLeadForm_primaryEmail")
	WebElement eleEmail;
	@FindBy(id="createLeadForm_primaryPhoneNumber")
	WebElement elephone;
	@FindBy(className="smallSubmit")
	WebElement elesubmit;
	
		
	CreateLeadPage Typecompany(String cName)
	{
		type(eleCompanyName, cName);
		return this;
	}
	
	CreateLeadPage Typefname(String fName)
	{
		type(eleFName, fName);
		return this;
	}
	CreateLeadPage Typelname(String lName)
	{
		type(eleLname, lName);
		return this;
	}
	
	CreateLeadPage typeemail(String email)
	{
		type(eleEmail,email);
		return this;
	}
	
	CreateLeadPage typephone(String phone)
	{
		type(elephone, phone);
		return this;
	}
	
	
	
	void clickcreateleadssubmit()
	{
		click(elesubmit);
	//	return new VerifyLeadPage(driver,test);
		
	
	}

}
