package tests;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import lib.selenium.WebDriverServiceImpl;

public class Flipkart extends WebDriverServiceImpl{

	@Test
	public void createLead() {

		
		WebElement eleloginig = locateElement("Xpath", "//button[@class='_2AkmmA _29YdH8']");
		click(eleloginig);
		
		WebElement eletvapp = locateElement("Xpath", "//span[text()='TVs & Appliances']");
		Actions builder = new Actions(webdriver);
		builder.moveToElement(eletvapp).perform();;
		WebElement elesamsung = locateElement("Xpath", "(//span [text()='Samsung'])[2]");
		builder.moveToElement(elesamsung).click().perform();
		
		WebElement elesamsungmin = locateElement("Xpath", "(//select[@class='fPjUPw'])[1]");
		selectDropDownUsingValue(elesamsungmin,"25000");
		
		WebElement elesamsungmax = locateElement("Xpath", "(//select[@class='fPjUPw'])[2]");
		selectDropDownUsingValue(elesamsungmax,"60000");
		
		WebElement elescreensize = locateElement("Xpath", "//div[text()='Screen Size']");
		elescreensize.click();
		
		WebElement elescreensizesele = locateElement("Xpath", "//div[text()='48 - 55']");
		elescreensizesele.click();
		
		WebElement elefirstproduct = locateElement("Xpath", "(((//div[@class='bhgxx2 col-12-12']))[4]//div//div//div)[14]");
		elefirstproduct.click();
		
		
				
		
		

	}


}





