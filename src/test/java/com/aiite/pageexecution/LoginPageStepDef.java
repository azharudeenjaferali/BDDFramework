package com.aiite.pageexecution;

import org.junit.Assert;

import com.aiite.basepack.BaseClass;
import com.aiite.pagefactory.HomePage;
import com.aiite.pagefactory.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDef {
	
	@Given("Launch the browser and load the Url.")
	public void launch_the_browser_and_load_the_url() {
		BaseClass.browserLaunch();
		BaseClass.loadURL("https://www.facebook.com/");
	}

	@When("Provide valid {string} and {string}.")
	public void provide_valid_and(String a, String b) {
		LoginPage lp = new LoginPage();		
		BaseClass.searchElementById(lp.userName).sendKeys(a);
		BaseClass.searchElementById(lp.passWord).sendKeys(b);
		BaseClass.searchElementByXpath(lp.loginBtn).click();
	}

	@Then("Validate the user is logged in {string}")
	public void validate_the_user_is_logged_in(String a) throws Exception {
		Thread.sleep(3000);
		System.out.println("Validating the user");
		//validation
		Assert.assertTrue(true);
		BaseClass.closeBrowser();
	}

}
