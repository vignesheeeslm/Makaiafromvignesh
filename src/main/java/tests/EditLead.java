package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;

public class EditLead extends PreAndPost{

	@Test (groups = {"smoke"},description ="Editing the lead")
	public void editLead() {

		WebElement eleUserName = locateElement("id", "username");

		type(eleUserName, "DemoSalesManager");

		WebElement elePassword = locateElement("id", "password");
		type(elePassword, "crmsfa");

		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);

		WebElement eleCRM = locateElement("link", "CRM/SFA");
		click(eleCRM);

		WebElement eleleadclick = locateElement("link", "Leads");
		click(eleleadclick);

		WebElement elefindleadclick = locateElement("link", "Find Leads");
		click(elefindleadclick);


		WebElement elefirstname = locateElement("Xpath", "(//input[@name='firstName'])[3]");
		elefirstname.sendKeys("Vignesh");

		WebElement elefirstdata = locateElement("Xpath", "((//table[@class='x-grid3-row-table'])[1])/tbody/tr/td/div/a");
		click(elefirstdata);

		driver.getTitle();

		WebElement eleEdit = locateElement("link", "Edit");
		click(eleEdit);


		WebElement elecompanyupdate = locateElement("id", "updateLeadForm_companyName");
		//elecompanyupdate.clear();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		type(elecompanyupdate, "Accenture");


		WebElement eleupdate = locateElement("Xpath", "(//input[@name='submitButton'])[1]");
		click(eleupdate);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*		WebElement elepresent = locateElement("find", "Accenture");
		System.out.println(elepresent+" is present in the screen");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 */		









	}


}





