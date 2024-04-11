package stepDefinitions;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.Upcomingbikes;
import io.cucumber.java.en.Then;

public class step1_UpcomingBikes extends BaseClass {

	Logger logger = LogManager.getLogger(step1_UpcomingBikes.class);
	Upcomingbikes upcomingBike = new Upcomingbikes(driver);

	@Given("I open the website Zigwheels.com")
	public void i_open_the_website_Zigwheels_com() throws InterruptedException {
		// Write code here to open the website
		logger.info("**** Starting TC_001_UpcomingBike ****");
		logger.info("clicking on  New Bikes ");
		if (upcomingBike.NewBikes.isDisplayed()) {

			Assert.assertTrue(true);
		} else {
			Assert.fail();
		}

		upcomingBike.HoverNewBikes();
	}


	@When("I select upcoming bikes")
	public void i_select_upcoming_bikes() throws InterruptedException, IOException {
		// Write code here to select upcoming bikes
		logger.info("Selecting Upcoming Bikes");
		upcomingBike.selectUpcomingBikes();

	}

	@Then("Redirected to upcoming bikes page")
	public void RedirectedOnUpcomingBike() throws InterruptedException {
		logger.info("checking Upcoming Bikes page is displayed or not");
		String actlink = upcomingBike.driver.getCurrentUrl();
		String explink = "https://www.zigwheels.com/upcoming-bikes";
		Assert.assertEquals(explink, actlink);
	}

	@When("Clicking on manufacturers dropdown and check for Honda")
	public void manufacturersDropDown() throws InterruptedException {
		logger.info("clicking on Manufacturers dropdown");
		upcomingBike.clickManufacturers();
		if (upcomingBike.HondaOption.isDisplayed()) {

			Assert.assertTrue(true);
		} else {
			Assert.fail();
		}
	}

	@When("selecting Honda brand")
	public void selectHonda() throws InterruptedException {
		logger.info("selecting Honda brand");
		upcomingBike.selectBrand();
		if (upcomingBike.HondaPageTitle.isDisplayed()) {

			Assert.assertTrue(true);
		} else {
			Assert.fail();
		}

	}

	@Then("ViewMore button is visible or not")
	public void viewMoreButton() throws InterruptedException {
		logger.info("checking ViewMore button visibility");
		if (upcomingBike.viewMoreBikesButton.isDisplayed()) {

			Assert.assertTrue(true);
		} else {
			Assert.fail();
		}
		upcomingBike.clickViewMoreButton();
	}

	@Given("I am on the bikes page")
	public void i_am_on_the_bikes_page() throws InterruptedException, IOException {

		upcomingBike.HoverNewBikes();
		upcomingBike.selectUpcomingBikes();
		upcomingBike.clickManufacturers();
		upcomingBike.selectBrand();
		upcomingBike.clickViewMoreButton();
		logger.info("checking Honda upcoming Bikes page is displayed or not");
		String actlink = upcomingBike.driver.getCurrentUrl();
		String explink = "https://www.zigwheels.com/upcoming-honda-bikes";
		Assert.assertEquals(explink, actlink);
	}

	@Then("I should see the names of the bikes")
	public void i_should_see_the_names_of_the_bikes() throws InterruptedException {
		logger.info("checking all honda bikes names are there or not");
		int expectednumber = upcomingBike.allHondaBikes.size();
		int actualNumber = upcomingBike.modelName.size();
		Assert.assertEquals(expectednumber, actualNumber);
	}

	@Then("I should see the prices of the bikes")
	public void i_should_see_the_prices_of_the_bikes() throws InterruptedException {
		logger.info("checking all honda bikes prices are there or not");
		int expectednumber = upcomingBike.allHondaBikes.size();
		int actualNumber = upcomingBike.bikePrice.size();
		Assert.assertEquals(expectednumber, actualNumber);
	}

	@Then("I should see the expected dates of the bikes")
	public void i_should_see_the_expected_dates_of_the_bikes() throws InterruptedException {
		logger.info("checking all honda bikes expected dates are there or not");
		int expectednumber = upcomingBike.allHondaBikes.size();
		int actualNumber = upcomingBike.dateOfBikes.size();
		Assert.assertEquals(expectednumber, actualNumber);
	}

	@Then("Display bike details")
	public void display_bike_details() throws IOException, InterruptedException {
		// Write code here to display bike details
		logger.info("Displaying bikes details");
		upcomingBike.bikeDetails();
		logger.info("**** Finished TC_001_UpcomingBike ****");

	}

}
