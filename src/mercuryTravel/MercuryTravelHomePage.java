package mercuryTravel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MercuryTravelHomePage {
	
	@FindBy(id="flights")
	private WebElement flightLink;
	
	@FindBy(id="hotels")
	private WebElement hotelLink;
	
	public MercuryTravelHomePage(WebDriver Driver){
		
		PageFactory.initElements(Driver, this);
		
	}
}
