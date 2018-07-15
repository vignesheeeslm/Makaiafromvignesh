package tests;

import java.util.Scanner;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.selenium.WebDriverServiceImpl;

public class CreatAccount extends WebDriverServiceImpl{

	@Test
	public void createLead() {

		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");

		WebElement elePassword = locateElement("id", "password");
		type(elePassword, "crmsfa");

		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);

		WebElement eleCRM = locateElement("link", "CRM/SFA");
		click(eleCRM);

		WebElement eleAccclick = locateElement("link", "Create Account");
		click(eleAccclick);
		
		Scanner userinput = new Scanner(System.in);
		
		System.out.println("Enter the account name: ");
		String Accountname = userinput.nextLine();
		
		WebElement eleaccname = locateElement("id", "accountName");
		type(eleaccname, Accountname);
		
		WebElement elecurrencyUomId = locateElement("id", "currencyUomId");
		selectDropDownUsingVisibleText(elecurrencyUomId, "INR - Indian Rupee");
		
		WebElement eleindustryEnumId = locateElement("name", "industryEnumId");
		selectDropDownUsingVisibleText(eleindustryEnumId, "Computer Hardware");
		
		WebElement eledataSourceId = locateElement("id", "dataSourceId");
		selectDropDownUsingVisibleText(eledataSourceId, "Conference");
		
		WebElement eleprimaryPhoneNumber = locateElement("id", "primaryPhoneNumber");
		type(eleprimaryPhoneNumber, "8870744444");
		
		WebElement eleprimaryEmail = locateElement("id", "primaryEmail");
		type(eleprimaryEmail, "victory@gmail.com");
		
		WebElement elegeneralCountryGeoId = locateElement("name", "generalCountryGeoId");
		selectDropDownUsingVisibleText(elegeneralCountryGeoId, "India");
		
		WebElement elecreateacc = locateElement("Xpath", "//input[@value='Create Account']");
		click(elecreateacc);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		WebElement elecreateaccgen = locateElement("Xpath", "(//span[@class='tabletext'])[3]");
		String accountnumgen = elecreateaccgen.getText();
		String finalaccnum = accountnumgen.replaceAll("[^0-9]", "");
		System.out.println("Acccccccc Nummmmmmm" + finalaccnum);
		
		
		WebElement eleFindAccounts= locateElement("link", "Find Accounts");
		click(eleFindAccounts);
		
		
		WebElement eleaccidenter = locateElement("Xpath", "//input[@name='id']");
		type(eleaccidenter, finalaccnum);
		
		WebElement eleaccnameenter = locateElement("Xpath", "(//input[@name='accountName'])[2]");
		type(eleaccnameenter, Accountname);
		
		WebElement eleaccclick = locateElement("Xpath", "//button[text()='Find Accounts']");
		click(eleaccclick);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement elerecord = locateElement("Xpath", "//table[@class='x-grid3-row-table']//tbody//tr//td//div//a");
		String fetchaccno = elerecord.getText();
		click(elerecord);
		
		if(fetchaccno.equals(finalaccnum))
			System.out.println("Passsssssssssssssssssss");
		else 
			System.out.println("Failllllllllllll");
				driver.close();





	}


}





