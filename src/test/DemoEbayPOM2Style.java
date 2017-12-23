package test;

import commonLibs.CommonDriver;
import designPattern.EbayPOM2Style;

public class DemoEbayPOM2Style {

	public static void main(String[] args) {
		
		try {
			CommonDriver cmnDriver = new CommonDriver("firefox");
			cmnDriver.openBrowser("https://www.ebay.in/");
			EbayPOM2Style ebayHomePage = new EbayPOM2Style(cmnDriver.getDriver());
			ebayHomePage.searchItem("Apple Watches", "Watches");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
