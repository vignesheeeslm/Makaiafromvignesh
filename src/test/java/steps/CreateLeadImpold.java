/*package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLeadImpold {

	ChromeDriver driver;
	@Given("Open the browser")
	public void OpenBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 driver = new ChromeDriver();

	}

	@And ("launch the URL")
	public void OpenURL()
	{
		driver.get("http://leaftaps.com/opentaps/");

	}


	@And ("set the timeouts")
	public void SetTimeout()
	{
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

	}

	@And ("maximize the browser")
	public void Maximize()
	{
		driver.manage().window().maximize();

	}

	@And ("Enter the username as (.*)")
	public void Enterusername(String name)
	{
		driver.findElementById("username").sendKeys(name);
	}

	@And ("Enter the password as (.*)")
	public void Enteruserpassword(String password)
	{
		driver.findElementById("password").sendKeys(password);
	}

	@And ("click on the login button")
	public void Submitbutton()
	{
		driver.findElementByClassName("decorativeSubmit").click();
	}
	
	@And ("Click on CRMSFA")
	public void CRM()
	{
		driver.findElementByLinkText("CRM/SFA").click();
	}
	
	@And ("click on create Lead")
	public void CreateLeadclick()
	{
		driver.findElementByLinkText("Create Lead").click();
	}
	
	@And ("Enter the company name as (.*)")
	public void CompName(String Cname)
	{
		driver.findElementById("createLeadForm_companyName").sendKeys(Cname);
	}
	
	@And ("Enter the first name as (.*)")
	public void FirstName(String Fname)
	{
		driver.findElementById("createLeadForm_firstName").sendKeys(Fname);
	}
	
	@And ("Enter the Last name as (.*)")
	public void LastName(String Lname)
	{
		driver.findElementById("createLeadForm_lastName").sendKeys(Lname);
	}
	
	@When ("click submit button")
	public void submit()
	{
		driver.findElementByClassName("smallSubmit").click();
	}
	
	@When ("verify the name")
	public void success()
	{
		System.out.println("Success");
	}


}
*/