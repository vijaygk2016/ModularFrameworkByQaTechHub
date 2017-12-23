package commonLibs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import commonLibInterfaces.IActionControl;

public class ActionControl implements IActionControl {
	
	private WebDriver Driver;
	
	public ActionControl(WebDriver Driver){
		this.Driver=Driver;
	}

	@Override
	public void dragAndDrop(WebElement element1, WebElement element2) throws Exception {
		Actions action = new Actions(Driver);
		action.dragAndDrop(element1, element2).build().perform();
	}

	@Override
	public void moveToElement(WebElement element) throws Exception {
		Actions action = new Actions(Driver);
		action.moveToElement(element).build().perform();
		
	}

	@Override
	public void rightClick(WebElement element) throws Exception {
		Actions action = new Actions(Driver);
		action.contextClick(element).build().perform();
		
	}

	@Override
	public void doubleClick(WebElement element) throws Exception {
		Actions action = new Actions(Driver);
		action.doubleClick(element).build().perform();
		
	}

	@Override
	public void moveToElementAndClick(WebElement element) throws Exception {
		Actions action = new Actions(Driver);
		action.moveToElement(element).build().perform();
		
	}

}
