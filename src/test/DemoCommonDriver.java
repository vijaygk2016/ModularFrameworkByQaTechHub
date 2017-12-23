package test;

import commonLibs.CommonDriver;

public class DemoCommonDriver {

	public static void main(String[] args) {
		try {
			
			CommonDriver Driver = new CommonDriver("chrome");

			Driver.setPageLoadTimeout(401);
			Driver.setElementDetectionTimeout(201);
			
			Driver.openBrowser("http://qatechhub.com");
			System.out.println(Driver.getTitel());
			Driver.closeAllBrower();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
