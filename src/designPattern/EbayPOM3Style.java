package designPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonLibs.DropdownControls;
import commonLibs.TextboxControls;
import commonLibs.WebElementControls;

public class EbayPOM3Style {

	@CacheLookup
	@FindBy(id = "gh-ac")
	private WebElement searchBox;

	@CacheLookup
	@FindBy(id = "gh-cat")
	private WebElement searchCategpry;

	@CacheLookup
	@FindBy(id = "gh-bth")
	private WebElement searchButton;

	@CacheLookup
	@FindBy(className = "listingscnt")
	private WebElement result;

	TextboxControls textbox;
	DropdownControls dropdown;
	WebElementControls element;

	public EbayPOM3Style(WebDriver Driver) {

		PageFactory.initElements(Driver, this);
		textbox = new TextboxControls();
		dropdown = new DropdownControls();
		element = new WebElementControls();

	}

	public void searchItem(String product, String category) throws Exception {

		textbox.setText(searchBox, product);
		dropdown.selectViaVisiableText(searchCategpry, category);
		element.click(searchButton);
		String resultFromElement = element.getText(result);

		System.out.println("Result :: " + resultFromElement);

	}

}
