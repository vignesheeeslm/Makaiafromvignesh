package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.selenium.WebDriverServiceImpl;

public class DuplicateLead extends WebDriverServiceImpl{

	@Test
	public void duplicatelead() {

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

		WebElement eleemailclick = locateElement("Xpath", "//span[text()='Email']");
		click(eleemailclick);

		WebElement eleemailadd = locateElement("Xpath", "//input[@name='emailAddress']");
		type(eleemailadd, "pravinb1995.pp@gmail.com");


		WebElement elefindelementclick = locateElement("Xpath", "//button[text()='Find Leads']");
		click(elefindelementclick);

		WebElement elerecordclick = locateElement("Xpath", "(//table/tbody//tr//td//div//a)[1]");
		String value = elerecordclick.getText();
		WebElement elename = locateElement("Xpath", "(//table/tbody//tr//td//div//a)[3]");
		String sourcename = elename.getText();

		click(elerecordclick);


		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.navigate().refresh();

		WebElement eleduplicate = locateElement("link", "Duplicate Lead");
		click(eleduplicate);

		//WebElement elename = locateElement("id", "createLeadForm_firstName");
		//String sourcename =elename.getText();
		//click(elerecordclick);

		System.out.println(sourcename);

		//String valueee = elename.getText();


		String value1  =driver.getTitle();
		value1.contains("duplicateLead");

		WebElement elecreatelead = locateElement("Xpath", "//input[@value='Create Lead']");
		click(elecreatelead);

		WebElement dupname = locateElement("id", "viewLead_firstName_sp");

		System.out.println("Original name"+sourcename);
		System.out.println("duplicate name"+dupname.getText());
		if (dupname.getText().equals(sourcename))
			System.out.println("Name is same");
		else
			System.out.println("Name is different");	

		
	}


}





