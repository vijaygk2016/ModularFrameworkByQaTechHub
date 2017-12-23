package test;

import commonLibs.CommonDriver;
import commonLibs.DropdownControls;
import commonLibs.TextboxControls;
import commonLibs.WebElementControls;
import designPattern.EbayPOM1Style;

public class DemoEbayPOM1Style {

	public static void main(String[] args){
		
		try {
			CommonDriver cmnDriver=new CommonDriver("firefox");
			TextboxControls textbox = new TextboxControls();
			DropdownControls dropdown = new DropdownControls();
			WebElementControls element = new WebElementControls();
			
			cmnDriver.openBrowser("https://www.ebay.in/");
			
			EbayPOM1Style ebayHomePage = new EbayPOM1Style(cmnDriver.getDriver());
			textbox.setText(ebayHomePage.searchBox, "Apple Watches");
			dropdown.selectViaVisiableText(ebayHomePage.searchDropdown, "Watches");
			
			element.click(ebayHomePage.searchButton);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
