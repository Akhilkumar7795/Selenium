package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
 
	public LandingpageObjects lp1;
	public OfferpageObjects op1;
	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	public LandingpageObjects getLandingPage() {
		
		 lp1=new LandingpageObjects(driver);
		 return lp1;
	}
	
	public OfferpageObjects OfferpageObjects() {
		 op1=new OfferpageObjects(driver);
		 return op1;
	}
}
