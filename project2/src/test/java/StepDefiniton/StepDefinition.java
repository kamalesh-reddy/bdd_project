package StepDefiniton;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	WebDriver driver;
	String title;
	@Given("^Login application should be availabe$")
	public void login_application_should_be_availabe(){
	    // Write code here that turns the phrase above into concrete actions
	   // System.setProperty("webdriver.gecko.driver", "E:/gecko/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", "gecko/geckodriver");
	    driver= new FirefoxDriver();
	    driver.get("https://www.orangehrm.com/");
	}

	@When("^Validate Login application$")
	public void validate_Login_application(){
	    // Write code here that turns the phrase above into concrete actions
		title=driver.getTitle();
		System.out.println("title");
		System.out.println(title);
	 
	}

	@Then("^Login should be successful$")
	public void login_should_be_successful(){
	    // Write code here that turns the phrase above into concrete actions
		//Assert.assertEquals("OrangeHRM",title);
		System.out.println("hi");
		System.out.println("bye");
		
	   
	}



}
