package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",glue="stepDefinitions",monochrome=true)
public class TestNgRunner extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		return super.scenarios();
	}
	
}
