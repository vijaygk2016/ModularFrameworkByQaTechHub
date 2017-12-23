package commonLibs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import commonLibInterfaces.IDriver;

public class CommonDriver implements IDriver {

	private WebDriver Driver;
	private long pageLoadTimeout;
	private long elementDetectionTimeout;

	public CommonDriver(String browserType) throws Exception {

		pageLoadTimeout = 301;
		elementDetectionTimeout = 101;

		// remove white space from the end...
		browserType = browserType.trim();

		switch (browserType.toLowerCase()) {

		case "chrome":
			System.setProperty("webdriver.chrome.driver",
					"/Users/laxman_kouja/Documents/05Dec/ModularFramework/src/resources/chromedriver");
			Driver = new ChromeDriver();
			break;
		case "firefox":

			System.setProperty("webdriver.gecko.driver","/Users/laxman_kouja/Documents/05Dec/ModularFrameworkByQaTechHub/src/resources/geckodriver");
			Driver = new FirefoxDriver();
			break;
		default:
			throw new Exception("Invalid Browsertype : " + browserType);
		}

	}

	@Override
	public void openBrowser(String Url) throws Exception {

		Url = Url.trim();

		if (Url.isEmpty() || Url == null) {
			Url = "about:blank";
		}

		//Driver.manage().deleteAllCookies();
		//Driver.manage().timeouts().pageLoadTimeout(pageLoadTimeout, TimeUnit.SECONDS);
		//Driver.manage().timeouts().implicitlyWait(elementDetectionTimeout, TimeUnit.SECONDS);
		Driver.get(Url);
	}

	@Override
	public void closeBrower() throws Exception {
		Driver.close();

	}

	@Override
	public void closeAllBrower() throws Exception {
		Driver.quit();

	}

	public WebDriver getDriver() {
		return Driver;
	}

	@Override
	public void setPageLoadTimeout(long pageLoadTimeout) throws Exception {
		this.pageLoadTimeout = pageLoadTimeout;

	}

	@Override
	public void setElementDetectionTimeout(long elementDetectionTimeout) throws Exception {
		this.elementDetectionTimeout = elementDetectionTimeout;
	}

	@Override
	public String getTitel() throws Exception {
		return Driver.getTitle();

	}

	@Override
	public String getPageSource() throws Exception {
		return Driver.getPageSource();

	}

	@Override
	public String getCurrectUrl() throws Exception {
		return Driver.getCurrentUrl();

	}

	@Override
	public void navigateTo(String Url) throws Exception {
		Driver.navigate().to(Url);

	}

	@Override
	public void navigateForward() throws Exception {
		Driver.navigate().forward();

	}

	@Override
	public void navigateRefresh() throws Exception {
		Driver.navigate().refresh();
	}

	@Override
	public void navigateBack() throws Exception {
		Driver.navigate().back();

	}

}
