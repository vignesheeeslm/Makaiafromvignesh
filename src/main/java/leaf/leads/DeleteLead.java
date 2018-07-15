package leaf.leads;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;

public class DeleteLead extends PreAndPost {

	@BeforeTest
	public void setValue() {
		testcase = "DeleteLead";
		testdesc= "Deleting the lead"; 
		author= "Ganesh";
		node = "Lead"; 
		fileName = "DeleteLead";
		category = "Regression";
	}

	@Test(dataProvider="TEST")
	public void deleteLead(String DeleteName) throws InterruptedException {
		
		click(locateElement("link", "Leads"));
		click(locateElement("link", "Find Leads"));	
		Thread.sleep(5000);
		type(locateElement("xpath", "(//input[@name='firstName'])[3]"), DeleteName);
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		String leadID = getText(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		click(locateElement("link", "Delete"));
		
	}
}
