package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import lib.selenium.WebDriverServiceImpl;

public class Hooks extends WebDriverServiceImpl

{

	@Before	
	public void beforetest(Scenario Sc)
	{
		startReport();
		System.out.println("beforeTest");
		System.out.println("beforeClass");
		startTestCase(Sc.getName(), Sc.getId());
		startTestModule("Lead");
		test.assignAuthor("Gopi");
		test.assignCategory("Create");
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		webdriver = new ChromeDriver();
		driver = new EventFiringWebDriver(webdriver);
		driver.register(this);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		type(locateElement("id", "username"), "DemoSalesManager");	
		type(locateElement("id", "password"), "crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("link", "CRM/SFA"));
		
	}
	
	@After	
	public void aftertest(Scenario Sc)
	{
		closeActiveBrowser();
		System.out.println("afterClass");
		System.out.println("afterTest");
		System.out.println("aftersuite");
		endResult();
		
		
	}
	
	
}
