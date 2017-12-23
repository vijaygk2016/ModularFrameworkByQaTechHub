package test;

import commonLibs.CommonDriver;
import designPattern.EbayPOM2Style;
import designPattern.EbayPOM3Style;

public class DemoEbayPOM3Style {

	public static void main(String[] args) {
		
		try {
			CommonDriver cmnDriver = new CommonDriver("firefox");
			cmnDriver.openBrowser("https://www.ebay.in/");
			EbayPOM3Style ebayHomePage = new EbayPOM3Style(cmnDriver.getDriver());
			ebayHomePage.searchItem("Apple Watches", "Watches");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
