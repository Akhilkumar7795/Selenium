package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingpageObjects {

	public WebDriver driver;
	public LandingpageObjects(WebDriver driver) {
		this.driver=driver;
	}
	By Search=By.xpath("//input[@type='search']");
	By productname=By.cssSelector("h4.product-name");
	
	public void searchItem(String name)
	{
		driver.findElement(Search).sendKeys(name);
	}
	
	public String productName() {
		
		return driver.findElement(productname).getText();
	}
	
}
