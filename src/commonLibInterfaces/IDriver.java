package commonLibInterfaces;

public interface IDriver {
	
	
	
	public void openBrowser(String Url) throws Exception;
	
	public void closeBrower() throws Exception;
	
	public void closeAllBrower() throws Exception;
	
	public void setPageLoadTimeout(long pageLoadTimeout) throws Exception;
	
	public void setElementDetectionTimeout(long elementDetectionTimeout) throws Exception;
	
	public String getTitel() throws Exception;
	
	public String getPageSource() throws Exception;
	
	public String getCurrectUrl() throws Exception;
	
	public void navigateTo(String Url) throws Exception;
	
	public void navigateForward() throws Exception;
	
	public void navigateRefresh() throws Exception;
	
	public void navigateBack() throws Exception;
	

}
