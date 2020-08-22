package Scripts;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import GenericLib.Browser;

import Locators.Locators;
import baseTest.baseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class animateBox extends baseTest{

	//public static String sActualColor="";


	@Test
	public static void verifyAnimateBox() {
		String sBeforelColor="";
		String sAfterColor="";
		org.openqa.selenium.Dimension sBeforeSize;
		org.openqa.selenium.Dimension sAfterSize;
		
			Browser.goToURL("https://jqueryui.com/animate/");
			driver.switchTo().frame(0);
			
			sBeforelColor=driver.findElement(By.xpath(Locators.ColorAnimation.getWidget("Animate"))).getCssValue("background-color");
			sBeforeSize=driver.findElement(By.xpath(Locators.ColorAnimation.getWidget("Animate"))).getSize();
			
			driver.findElement(By.xpath(Locators.ColorAnimation.getButton("Toggle Effect"))).click();
			Wait wait=new WebDriverWait(driver, 10); 
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3[@class='ui-widget-header ui-corner-all' and text()='Animate']//parent::div[contains(@style,'170')]")));
			
			sAfterColor=driver.findElement(By.xpath(Locators.ColorAnimation.getWidget("Animate"))).getCssValue("background-color");
			sAfterSize=driver.findElement(By.xpath(Locators.ColorAnimation.getWidget("Animate"))).getSize();
		
			
			Assert.assertNotSame(sBeforelColor, sAfterColor);
			Assert.assertTrue(sBeforeSize.width<sAfterSize.width);
			Assert.assertEquals("rgba(170, 0, 0, 1)", sAfterColor.toString());


	}

}
