package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import lib.selenium.WebDriverServiceImpl;

public class CreateLeadImplementation extends WebDriverServiceImpl{

/*	ChromeDriver driver;
	@Given("Open the browser")
	public void OpenBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 driver = new ChromeDriver();

	}*/


	/*public void CreateLead(EventFiringWebDriver driver)
	{
		this.driver = driver;
		
		
		webdriver.findElementByLinkText("Create Lead").click();
	}
*/
	
	@And ("click on create Lead")
	public void CreateLeadclick()
	{
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		
	}
	
	@And ("Enter the company name as (.*)")
	public void CompName(String Cname)
	{
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Cname);
			
	}
	
	@And ("Enter the first name as (.*)")
	public void FirstName(String Fname)
	{
		webdriver.findElement(By.id("createLeadForm_firstName")).sendKeys(Fname);
		
		
	}
	
	@And ("Enter the Last name as (.*)")
	public void LastName(String Lname)
	{
		webdriver.findElement(By.id("createLeadForm_lastName")).sendKeys(Lname);
		
	}
	
	@When ("click submit button")
	public void submit()
	{
		webdriver.findElement(By.className("smallSubmit")).click();
		
	}
	
	@When ("verify the name")
	public void success()
	{
		System.out.println("Success");
	}


}
