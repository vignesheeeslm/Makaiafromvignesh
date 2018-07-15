package lead.pages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lead.pages.MyHomePage;
import lib.selenium.PreAndPost;

public class CreateLead extends PreAndPost{

	@BeforeTest
	public void setValue() {
		testcase = "CreateLead";
		testdesc= "Creating a new lead"; 
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

	
	
		
	
	
}




