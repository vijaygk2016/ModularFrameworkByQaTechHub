package utils.commonUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {

	public void waitForSeconds(int timeoutInSceonds) throws Exception {
		Thread.sleep(timeoutInSceonds * 1000);
	}

	private WebDriverWait getWaitDriver(WebDriver driver, int timeoutInSceonds) {
		WebDriverWait wait = new WebDriverWait(driver, timeoutInSceonds);
		return wait;

	}

	public void waitTillElementVisible(WebDriver driver, WebElement element, int timeoutInSceonds) throws Exception {
		getWaitDriver(driver, timeoutInSceonds).until(ExpectedConditions.visibilityOf(element));
	}

	public void waitTillAlertIsPresent(WebDriver driver, int timeoutInSceonds) throws Exception {
		getWaitDriver(driver, timeoutInSceonds).until(ExpectedConditions.alertIsPresent());
	}

	public void waitTillElementBecomeClickable(WebDriver driver, WebElement element, int timeoutInSceonds)
			throws Exception {
		getWaitDriver(driver, timeoutInSceonds).until(ExpectedConditions.elementToBeClickable(element));
	}
	
}
