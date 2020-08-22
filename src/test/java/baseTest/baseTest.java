package baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseTest {
	
	public static WebDriver driver;
	@BeforeClass
	public static boolean openBrowser() {
		try {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
	catch(Exception e) {
		return false;
	}
		
		return true;
	}

	@AfterClass
	public static boolean closeBrowser() {
		driver.close();
		return true;
	}
}