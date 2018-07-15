package leaf.leads;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;

public class EditLead extends PreAndPost {
	@BeforeTest
	public void setValue() {
		testcase = "EditLead";
		testdesc= "Editing the exisiting lead"; 
		author= "Vignesh";
		node = "Lead"; 
		fileName = "EditLead";
		category = "Sanity";
	}

	@Test(dataProvider="TEST")
	public void editLead(String searchname,String Updateform) throws InterruptedException {
		
		click(locateElement("link", "Leads"));
		click(locateElement("link", "Find Leads"));				
		type(locateElement("xpath", "(//input[@name='firstName'])[3]"), searchname);
		click(locateElement("xpath", "//button[text()='Find Leads']"));		
		String leadID = getText(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		click(locateElement("link", "Edit"));		
		type(locateElement("id", "updateLeadForm_companyName"), Updateform);
		click(locateElement("class", "smallSubmit"));
		click(locateElement("link", "Find Leads"));
		type(locateElement("xpath", "//input[@name='id']"), leadID);
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		Thread.sleep(2000);
		click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"));
		verifyPartialText(locateElement("id", "viewLead_companyName_sp"), Updateform);
		
		
	}
}
