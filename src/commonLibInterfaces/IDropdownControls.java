package commonLibInterfaces;

import java.util.List;

import org.openqa.selenium.WebElement;

public interface IDropdownControls {
	
	public void selectViaVisiableText(WebElement element, String text) throws Exception;

	public void selectViaValue(WebElement element, String value) throws Exception;

	public void selectViaIndex(WebElement element, String index) throws Exception;

	public boolean isMultiple(WebElement element) throws Exception;

	public List<WebElement> getAllOption(WebElement element) throws Exception;

	public List<WebElement> getAllSelectedOption(WebElement element) throws Exception;

	public WebElement getFirstSelectedOption(WebElement element) throws Exception;

}
