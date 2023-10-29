package stepDefinitions;

import java.sql.Driver;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingpageObjects;
import pageObjects.PageObjectManager;
import utilities.TestContextSetup;

public class LandingPage {

	public WebDriver driver;
	public String landingpageproductname;
	public String offerpageproductname;
	TestContextSetup testContextSetup;
	PageObjectManager pageobjectmanager;
	public LandingPage(TestContextSetup testContextSetup) {
		
		this.testContextSetup=testContextSetup;
	}
	@Given("user is on GreenKart landing page")
	public void user_is_on_green_kart_landing_page() {
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		testContextSetup.driver = new ChromeDriver(options);
		testContextSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/");  
	}
	@When("^user searched with shortname (.+) and extract the actuall name of product$")
	public void user_searched_with_shortname_and_extract_the_actuall_name_of_product(String shortname) throws InterruptedException {
		
		//PageObjectManager pom = new PageObjectManager(testContextSetup.driver);
		LandingpageObjects lp =testContextSetup.pageobjectmanager.getLandingPage();
		//LandingpageObjects lp = new LandingpageObjects(testContextSetup.driver);
		lp.searchItem(shortname);
		//testContextSetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortname);
		Thread.sleep(2000);
		//testContextSetup.landingpageproductname = testContextSetup.driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
		testContextSetup.landingpageproductname = lp.productName().split("-")[0].trim();
		Thread.sleep(2000);
		System.out.println(landingpageproductname +"product name is extracted");
	}
	
}