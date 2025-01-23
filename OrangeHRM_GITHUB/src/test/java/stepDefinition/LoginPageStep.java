package stepDefinition;

import BaseLayer.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageLayer.LoginPage;

public class LoginPageStep extends BaseClass{
	
	LoginPage login;
	
	@Given("user should be on the {string} browser")
	public void user_should_be_on_the_browser(String browserName) {
		BaseClass.initialization(browserName);
	   
	}
	@When("user enters valide credentials")
	public void user_enters_valide_credentials() {
	   login=new LoginPage();
	   login.loginFunctionality("Admin", "admin123");
	}
	@Then("user clicks on the login button")
	public void user_clicks_on_the_login_button() {
	   login.clickOnLoginBtn();
	}

	
	
}
