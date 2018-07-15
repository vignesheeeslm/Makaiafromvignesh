package leaf.leads;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;

public class MergeLead extends PreAndPost{
	
	@BeforeTest
	public void setValue() {
		testcase = "MergeLead";
		testdesc= "Merging the lead"; 
		author= "Santhose";
		node = "Lead"; 
		fileName = "MergeLead";
		category = "Regression";
	}
	
	@Test(dataProvider="TEST")
	public void mergeLead(String SourceLead,String MergeLead) throws InterruptedException {
		
		click(locateElement("link", "Leads"));		
		click(locateElement("link", "Merge Leads"));
		click(locateElement("xpath", "//img[@alt='Lookup']"));
		switchToWindow(1);
		type(locateElement("xpath", "//input[@name='firstName']"), SourceLead);
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		Thread.sleep(2000);
		String text = getText(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		switchToWindow(0);
		click(locateElement("xpath", "(//img[@alt='Lookup'])[2]"));
		switchToWindow(1);
		type(locateElement("xpath", "//input[@name='firstName']"), MergeLead);
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		Thread.sleep(2000);				
		click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		switchToWindow(0);
		click(locateElement("link", "Merge"));
		acceptAlert();
		click(locateElement("link", "Find Leads"));
		type(locateElement("xpath", "//input[@name='id']"), text);		
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		Thread.sleep(2000);
		verifyPartialText(locateElement("class", "x-paging-info"), "No records to display");
	}
}
