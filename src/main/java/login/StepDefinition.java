package login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	WebDriver driver = setDriver.Set();
	
	@Given("^I goto Login Page$")
	public void i_goto_Login_Page(){
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}
	
	@When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_enter_email_and_password(String emailID, String passWD){
    	driver.findElement(By.id("email")).sendKeys(emailID);
    	driver.findElement(By.id("passwd")).sendKeys(passWD);
    	driver.findElement(By.id("SubmitLogin")).submit();
    }
    
    @Then("^I validate login page details$")
    public void validate_login(){
    	System.out.println(driver.getTitle());
    	driver.close();
    }

}
