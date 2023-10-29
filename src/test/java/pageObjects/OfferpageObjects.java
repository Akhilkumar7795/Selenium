package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferpageObjects {

	public WebDriver driver;
	public OfferpageObjects(WebDriver driver) {
		this.driver=driver;
	}
	By search1=By.xpath("//input[@type='search']");
	By productName=By.cssSelector("tr td:nth-child(1)");
	By topDeals=By.linkText("Top Deals");
	
	public void search1(String name) {
		
		driver.findElement(search1).sendKeys(name);
	}
public String productName() {
		
		return driver.findElement(productName).getText();
	}
public void deals() {
	
	driver.findElement(topDeals).click();
}
	
}
