package commonLibInterfaces;

import java.util.Set;

public interface IWindowHandle {

	public void switchToChildWindo() throws Exception;
	
	public void switchToParentWindo() throws Exception;
	
	public String getWindowHandle() throws Exception;
	
	public Set<String> getWindowHandles() throws Exception;
	
}
