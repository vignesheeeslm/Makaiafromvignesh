package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.selenium.WebDriverServiceImpl;

public class DeleteLead extends WebDriverServiceImpl{

	@Test(groups = {"sanity"})
	public void deletelead() {

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

		WebElement elephoneclick = locateElement("Xpath", "//span[text()='Phone']");
		click(elephoneclick);

		WebElement elephone = locateElement("Xpath", "//input[@name='phoneNumber']");
		type(elephone, "1234567890");


		WebElement elefindelementclick = locateElement("Xpath", "//button[text()='Find Leads']");
		click(elefindelementclick);

		WebElement elerecordclick = locateElement("Xpath", "(//table/tbody//tr//td//div//a)[1]");
		String value = elerecordclick.getText();

		click(elerecordclick);

		WebElement eledelete = locateElement("link", "Delete");
		click(eledelete);

		WebElement eleleadclick1 = locateElement("link", "Leads");
		click(eleleadclick1);

		WebElement elefindleadclick1 = locateElement("link", "Find Leads");
		click(elefindleadclick1);

		WebElement elefind = locateElement("Xpath", "(//input[@class=' x-form-text x-form-field'])[24]");
		type(elefind, value);

		WebElement elefindlead = locateElement("Xpath", "//button[text()='Find Leads']");
		click(elefindlead);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement elefindele = locateElement("Xpath", "//div[text()='No records to display']");

		value.equals("No records to display");
		System.out.println(elefindele.getText());

		

	}


}





