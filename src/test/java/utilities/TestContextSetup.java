package utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContextSetup {

	public WebDriver driver;
	public String landingpageproductname;
	public PageObjectManager pageobjectmanager;
	public TestBase testbase;
	
	public TestContextSetup() throws IOException {
		testbase = new TestBase();
		pageobjectmanager = new PageObjectManager(testbase.webDriverManager());
	}
		
	
}
