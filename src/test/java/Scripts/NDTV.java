package Scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import GenericLib.Browser;
import Locators.Locators;
import baseTest.baseTest;
import junit.framework.Assert;

public class NDTV extends baseTest{
	
	
	@Test
	public static void NDTVHref() {
		String topbus="";
		String bottombus="";
		Browser.goToURL("https://www.ndtv.com/business");
		List<WebElement> elements=driver.findElements(By.xpath(Locators.NdTv.topMenu()));
		
		for(WebElement s: elements) {
			System.out.println(s.getAttribute("href"));
			if(s.getText().contains("Business")) {
				topbus=s.getAttribute("href");
			}
		}
		
		List<WebElement> elements1=driver.findElements(By.xpath(Locators.NdTv.bottomMenu()));
		
		for(WebElement l: elements1) {
			System.out.println(l.getAttribute("href"));
			
			if(l.getText().contains("BUSINESS")) {
				bottombus=l.getAttribute("href");
			}
		}
		
		Assert.assertTrue(topbus.equalsIgnoreCase(bottombus));
		
		
	}

}
