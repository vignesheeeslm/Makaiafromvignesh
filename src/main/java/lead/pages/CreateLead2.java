package lead.pages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lead.pages.MyHomePage;
import lib.selenium.PreAndPost;

public class CreateLead2 extends PreAndPost{

	@BeforeTest
	public void setValue() {
		testcase = "CreateLead2";
		testdesc= "Creating a new lead2"; 
		author= "Gopi";
		node = "Lead"; 
		fileName = "CreateLead";
		category = "smoke";
	}
	
	@Test(dataProvider="TEST")
	public void createLead(String cName,String fName,String lName,
			String email,String phone){		
		/*click(locateElement("link", "Leads"));		
		click(locateElement("link", "Create Lead"));		
		type(locateElement("id", "createLeadForm_companyName"), cName);		
		type(locateElement("id", "createLeadForm_firstName"), fName);		
		type(locateElement("id", "createLeadForm_lastName"), lName);
		type(locateElement("id", "createLeadForm_primaryEmail"), email);
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), phone);
		click(locateElement("class", "smallSubmit"));				
*/
	new MyHomePage(driver, test).clickleads().clickcreateleads().Typecompany(cName)
		.Typefname(fName).Typelname(lName).typeemail(email).typephone(phone).clickcreateleadssubmit();
	
	}

	
	
	@DataProvider(name="UAT")
	public Object[][] getData1() {
		Object[][] data = new Object[1][5];
		data[0][0] = "Cg";
		data[0][1] = "arun";
		data[0][2] = "f";
		data[0][3] = "arun@CG.com";
		data[0][4] = 1234567890;
		return data;

	}
	
	@DataProvider(name="TST",indices= {1})
	public String[][] getData() {
		String[][] data = new String[2][5];
		data[0][0] = "TestLeaf";
		data[0][1] = "sarath";
		data[0][2] = "M";
		data[0][3] = "Sarath@testLeaf.com";
		data[0][4] = "1234567890";
		
		data[1][0] = "TCS";
		data[1][1] = "govarathan";
		data[1][2] = "s";
		data[1][3] = "govarathan@TCS.com";
		data[1][4] = "9009000122";
		return data;
	}
	
	
	
	
}




