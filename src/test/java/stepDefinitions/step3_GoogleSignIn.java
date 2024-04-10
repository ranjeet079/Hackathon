package stepDefinitions;

//import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.testng.Assert;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pageObjects.Loginpage;
import utilities.WindowHandle;
import factory.BaseClass;

public class step3_GoogleSignIn extends BaseClass {
	private Loginpage lp = new Loginpage(driver);
	Logger logger = LogManager.getLogger(step3_GoogleSignIn.class);

	@Given("I am on homepage")
	public void i_am_on_the_homepage() throws InterruptedException {
//        Thread.sleep(7000);
//		Thread.sleep(2000);
		logger.info("**** Starting TC_003_LoginSignup ****");
		try {
			logger.info("Navigating to the homepage");
			lp = new Loginpage(driver);
			lp.gotohome();
		} catch (Exception e) {
			logger.error("Failed to navigate to the homepage!!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	@When("I click on the Login\\/Signup button")
	public void i_click_on_the_Login_Signup_button() throws InterruptedException {
//		Thread.sleep(7000);
//		Thread.sleep(2000);
		try {
			logger.info("Clicking on the Login/Signup button");
//			Thread.sleep(5000);
			lp.clickLoginSignUp();
		} catch (Exception e) {
			logger.error("Failed to click on the Login/Signup button!!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	@When("I select the Google button")
	public void i_select_the_Google_button() throws InterruptedException {
//		Thread.sleep(7000);
//		Thread.sleep(2000);
		try {
			logger.info("Selecting the Google button");
			lp.selectGoogleButton();
		} catch (Exception e) {
			logger.error("Failed to select the Google button!!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	@Then("The Login\\/SignUp card should be displayed")
	public void the_Login_SignUp_card_should_be_displayed() throws InterruptedException {
//		Thread.sleep(7000);
//		Thread.sleep(2000);
		try {
			logger.info("Verifying that the Login/SignUp card is displayed");
			// Assuming screenshot() method captures and verifies the screenshot
			screenshot("LoginSignUpCard");
		} catch (Exception e) {
			logger.error("Failed to verify that the Login/SignUp card is displayed!!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	@Given("I am on the Google Accounts sign in page")
	public void i_am_on_the_Google_Accounts_sign_in_page() throws InterruptedException {
//		Thread.sleep(7000);
//		Thread.sleep(2000);
		try {
			logger.info("Navigating to the Google Accounts sign in page");
			// Assuming windowNavigate() method navigates to the given page
			lp.gotohome();
			lp.clickLoginSignUp();
			lp.selectGoogleButton();
			WindowHandle window = new WindowHandle(driver);
			window.windowNavigate("Sign in - Google Accounts");
		} catch (Exception e) {
			logger.error("Failed to navigate to the Google Accounts sign in page!!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	@When("I enter my email")
	public void i_enter_my_email() throws InterruptedException {
//		Thread.sleep(7000);
//		Thread.sleep(2000);
		try {
			logger.info("Entering email");
			Loginpage lp = new Loginpage(driver);
			lp.setEmailInput();
		} catch (InterruptedException e) {
			logger.error("Failed to enter email!!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	@When("I click on the next button")
	public void i_click_on_the_next_button() throws InterruptedException {
//		Thread.sleep(7000);
//		Thread.sleep(2000);
		try {
			logger.info("Clicking on the next button");
			lp.clickNextButton();
		} catch (Exception e) {
			logger.error("Failed to click on the next button!!!");
			e.printStackTrace();
			Assert.fail();
		}
	}

	@Then("The error message should be captured if login fails")
	public void the_error_message_should_be_captured_if_login_fails() throws InterruptedException {
//		Thread.sleep(7000);
//		Thread.sleep(2000);
		try {
			logger.info("Capturing error message");
			lp.captureErrorMsg();
		} catch (Exception e) {
			logger.error("Failed to capture error message!!!");
			e.printStackTrace();
			Assert.fail();
		}
		logger.info("**** Finished TC_003_LoginSignup ****");
	}
	
	
}
