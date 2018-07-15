package lib.selenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class PreAndPost extends WebDriverServiceImpl{
	
public String testcase, testdesc, author,node, fileName,category;	
	@Parameters({"URL","userName"})
	@BeforeMethod
	public void beforeMethod(String url,String uName) {
		//for reports
		startTestModule(node);
		test.assignAuthor(author);
		test.assignCategory(category);
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		webdriver = new ChromeDriver();
		driver = new EventFiringWebDriver(webdriver);
		driver.register(this);
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		type(locateElement("id", "username"), uName);	
		type(locateElement("id", "password"), "crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("link", "CRM/SFA"));
	}

	@AfterMethod
	public void afterMethod() {
		closeActiveBrowser();
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
		startTestCase(testcase, testdesc);		
	}

	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
				
	}
	@DataProvider(name ="TEST")
	public String[][] getourExcel() throws IOException {
		
		
		ReadExcel readExcelVar= new ReadExcel();
		String[][] readExcel = readExcelVar.readExcel(fileName);
		return readExcel;

	}


	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforesuite");
		startReport();
	}


	@AfterSuite
	public void afterSuite() {
		System.out.println("aftersuite");
		endResult();
	}

	
	
	
	
	
	
	
	
	
}
