package GenericLib;

import baseTest.baseTest;

public  class Browser extends baseTest {

	public static boolean goToURL(String url) {
		try {
			driver.get(url);
			driver.manage().window().maximize();
		}
		catch(Exception e) {
			return false;
		}
		
		
		return true;
				
	}
	
}
