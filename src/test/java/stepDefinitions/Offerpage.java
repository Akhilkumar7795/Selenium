package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.LandingpageObjects;
import pageObjects.OfferpageObjects;
import utilities.TestContextSetup;

public class Offerpage {
	public WebDriver driver;
	public String landingpageproductname;
	public String offerpageproductname;
	TestContextSetup testContextSetUp;
	public Offerpage(TestContextSetup testContextSetUp) {
		
		this.testContextSetUp=testContextSetUp;
	}
	@Then("^user searched for (.+)shortname in offers page")
	public void user_searched_for_same_shortname_in_offers_page(String shortname) throws InterruptedException {
	   
		swaitchToOffersPage();
		OfferpageObjects op = new OfferpageObjects(testContextSetUp.driver);
		op.search1(shortname);
		//testContextSetUp.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortname);
		Thread.sleep(2000);
		//offerpageproductname =testContextSetUp.driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();
		offerpageproductname =op.productName();
	}
	//single responsibility principle concept and loose coupled classes
	public void swaitchToOffersPage() {
		//testContextSetUp.driver.findElement(By.linkText("Top Deals")).click();
		//OfferpageObjects op = new OfferpageObjects(testContextSetUp.driver);
		LandingpageObjects lp =testContextSetUp.pageobjectmanager.getLandingPage();
		//lp.deals();
		Set<String> s1=testContextSetUp.driver.getWindowHandles();
		Iterator<String> i1=s1.iterator();
		String parentwindow=i1.next();
		String childwindow=i1.next();
		testContextSetUp.driver.switchTo().window(childwindow);
	}
	@Then("validate product name in offers page matches with landing page")
	public void  validate_product_name_in_offers_page_matches_with_landing_page()
	{
		
	Assert.assertEquals(offerpageproductname,testContextSetUp.landingpageproductname);
}
}
