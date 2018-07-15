package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.selenium.WebDriverServiceImpl;

public class MergeLeadAlertFramework extends WebDriverServiceImpl{

	@Test(groups = {"sanity"})
	public void mergelead() {

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

		WebElement eleMergeLeadclick1 = locateElement("link", "Merge Leads");
		click(eleMergeLeadclick1);


		WebElement elefromlead = locateElement("Xpath", "(//img[@src='/images/fieldlookup.gif'])[1]");
		click(elefromlead);

		locateElement("switchto", "1");

		WebElement elefind = locateElement("Xpath", "(//input[@class=' x-form-text x-form-field'])[1]");
		type(elefind, "10011");

		WebElement elefindlead = locateElement("Xpath", "//button[text()='Find Leads']");
		click(elefindlead);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}


		WebElement elesearchfrom = locateElement("link", "10011");
		click(elesearchfrom);

		locateElement("switchto", "0");


		//To lead fetch

		WebElement eleTolead = locateElement("Xpath", "(//img[@src='/images/fieldlookup.gif'])[2]");
		click(eleTolead);

		locateElement("switchto", "1");

		WebElement elefind1 = locateElement("Xpath", "(//input[@class=' x-form-text x-form-field'])[1]");
		type(elefind1, "10012");

		WebElement elefindlead1 = locateElement("Xpath", "//button[text()='Find Leads']");
		click(elefindlead1);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}


		WebElement elesearchfrom1 = locateElement("link", "10012");
		click(elesearchfrom1);

		locateElement("switchto", "0");

		WebElement eleMergebutton = locateElement("link", "Merge");
		click(eleMergebutton);

		driver.switchTo().alert().accept();

		WebElement eleleadclick1 = locateElement("link", "Leads");
		click(eleleadclick1);

		WebElement elemergeclick1 = locateElement("link", "Merge Leads");
		click(elemergeclick1);

		WebElement elefromlead1 = locateElement("Xpath", "(//img[@src='/images/fieldlookup.gif'])[1]");
		click(elefromlead1);

		locateElement("switchto", "1");

		WebElement elefind2 = locateElement("Xpath", "(//input[@class=' x-form-text x-form-field'])[1]");
		type(elefind2, "10011");

		WebElement elefindlead2 = locateElement("Xpath", "//button[text()='Find Leads']");
		click(elefindlead2);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		WebElement eleNodisp = locateElement("Xpath", "//div[text()='No records to display']");

		System.out.println(eleNodisp+"Trying to close");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		





	}


}





