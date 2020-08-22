package Locators;

public  class Locators {

	public static String sXpath = "";

	public static class ColorAnimation {

		public static String getButton(String sName)
		{
			sXpath="//button[@id='button' and text()='"+sName+"']";
			return sXpath;

		}

		public static String getWidget(String sFrame)
		{
			sXpath="//h3[@class='ui-widget-header ui-corner-all' and text()='"+sFrame+"']//parent::div";
			return sXpath;

		}



	}


	public static class NdTv{

		public static String topMenu() {
			sXpath="//div[@class='nglobalnav_wrap']//a";
			return sXpath;

		}
		
		public static String bottomMenu() {
			sXpath="//ul//li[@class='more']//a";
			return sXpath;

		}

	}


	

}




