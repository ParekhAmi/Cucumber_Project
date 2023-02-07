package stepDefinations;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.cucumber.junit.Cucumber;
import pages.LoginPage;

public class LoginStepDefination {

	LoginPage lp = new LoginPage();

	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() throws Throwable {
		lp.openLoginPage();
	}

	@When("^title of login page is \"([^\"]*)\"$")
	public void title_of_login_page_is(String title) throws Throwable {
		String expectedTitle = title;
		String actualTitle = lp.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String a, String b) throws Throwable {
		lp.enterEmailPassword(a, b);

	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		lp.clickOnLoginButton();

	}

	@Then("^user get error for email$")
	public void user_get_error_for_email() throws Throwable {
		String expecErr = "Please enter a username or card number without special characters.";
		String actErr = lp.readEmailErr();

		Assert.assertEquals(expecErr, actErr);
	}

	@Then("^user quit$")
	public void user_quit() throws Throwable {
		lp.closeBrowser();

	}
}
