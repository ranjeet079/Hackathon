package stepDefinitions;
//import java.io.IOException;

//import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

//import org.junit.Assert;
//import static org.junit.Assert.assertTrue;
//import org.apache.logging.log4j.LogManager;

//import org.testng.annotations.Test;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.Upcomingbikes;
//import factory.BaseClass;
import io.cucumber.java.en.Then;

public class step1_UpcomingBikes extends BaseClass {

	Logger logger = LogManager.getLogger(step1_UpcomingBikes.class);
	Upcomingbikes upcomingBike = new Upcomingbikes(driver);

	@Given("I open the website Zigwheels.com")
	public void i_open_the_website_Zigwheels_com() throws InterruptedException {
		// Write code here to open the website
		logger.info("**** Starting TC_001_UpcomingBike ****");
		logger.info("clicking on  New Bikes ");
		// click on new bikes
//		Thread.sleep(10000);
		if (upcomingBike.NewBikes.isDisplayed()) {

			Assert.assertTrue(true);
		} else {
			Assert.fail();
		}
//		Assert.assertEquals(upcomingBike.NewBikes.isDisplayed(), "Element is not visible.");
		upcomingBike.HoverNewBikes();
	}

//	@Test(groups= {"smoke","regression","master"})
//	public void HoverNewBikes() throws InterruptedException, IOException {
//		logger.info("**** Starting TC_001_UpcomingBike ****");
//			logger.info("clicking on  New Bikes ");
//			Upcomingbikes upcomingBike = new Upcomingbikes(driver);
//			// click on new bikes
//			upcomingBike.HoverNewBikes();
//		}

	@When("I select upcoming bikes")
	public void i_select_upcoming_bikes() throws InterruptedException, IOException {
		// Write code here to select upcoming bikes
		logger.info("Selecting Upcoming Bikes");
//		Upcomingbikes upcomingBike = new Upcomingbikes(driver);
//		Thread.sleep(10000);
		upcomingBike.selectUpcomingBikes();

	}

	@Then("Redirected to upcoming bikes page")
	public void RedirectedOnUpcomingBike() throws InterruptedException {
//		Thread.sleep(8000);
		logger.info("checking Upcoming Bikes page is displayed or not");
		String actlink = upcomingBike.driver.getCurrentUrl();
		String explink = "https://www.zigwheels.com/upcoming-bikes";
		Assert.assertEquals(actlink, explink);
	}

	@When("Clicking on manufacturers dropdown and check for Honda")
	public void manufacturersDropDown() throws InterruptedException {
		logger.info("clicking on Manufacturers dropdown");
//		Thread.sleep(8000);
		// Click on Dropdown
		upcomingBike.clickManufacturers();
//    	Assert.assertTrue(upcomingBike.HondaOption.isDisplayed(), "Element is not visible.");
//		assertTrue("Element is not visible.", upcomingBike.HondaOption.isDisplayed());
		if (upcomingBike.HondaOption.isDisplayed()) {

			Assert.assertTrue(true);
		} else {
			Assert.fail();
		}
	}

//	@When("clicking on upcoming bikes")
//	public void clicking_on_upcoming_bikes() throws InterruptedException {
//		// Write code here to click on upcoming bikes
//		logger.info("clicking on Upcoming Bikes");
//		Upcomingbikes upcomingBike = new Upcomingbikes(driver);
//		Thread.sleep(2000);
//		// Click on Brand
//		upcomingBike.clickBrand();
//		
//		Thread.sleep(2000);
//		// View more bikes
//		upcomingBike.clickViewMoreButton();
//	}
	@When("selecting Honda brand")
	public void selectHonda() throws InterruptedException {
		logger.info("selecting Honda brand");
//		Thread.sleep(8000);
		upcomingBike.selectBrand();
//		Assert.assertTrue(upcomingBike.HondaPageTitle.isDisplayed(), "Element is not visible.");
		// View more bikes
		if (upcomingBike.HondaPageTitle.isDisplayed()) {

			Assert.assertTrue(true);
		} else {
			Assert.fail();
		}

	}

	@Then("ViewMore button is visible or not")
	public void viewMoreButton() throws InterruptedException {
		logger.info("checking ViewMore button visibility");
//		Thread.sleep(8000);
//		Assert.assertTrue(upcomingBike.viewMoreBikesButton.isDisplayed(), "Element is not visible.");
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
//		Thread.sleep(2000);
		upcomingBike.selectUpcomingBikes();
//		Thread.sleep(2000);
		upcomingBike.clickManufacturers();
//		Thread.sleep(2000);
		upcomingBike.selectBrand();
//		Thread.sleep(2000);
		upcomingBike.clickViewMoreButton();
//		Thread.sleep(2000);
		logger.info("checking Honda upcoming Bikes page is displayed or not");
		String actlink = upcomingBike.driver.getCurrentUrl();
		String explink = "https://www.zigwheels.com/upcoming-honda-bikes";
		Assert.assertEquals(actlink, explink);
	}

	@Then("I should see the names of the bikes")
	public void i_should_see_the_names_of_the_bikes() throws InterruptedException {
		logger.info("checking all honda bikes names are there or not");
//		Thread.sleep(5000);
		int expectednumber = upcomingBike.allHondaBikes.size();
		int actualNumber = upcomingBike.modelName.size();
		Assert.assertEquals(actualNumber, expectednumber);
	}

	@Then("I should see the prices of the bikes")
	public void i_should_see_the_prices_of_the_bikes() throws InterruptedException {
		logger.info("checking all honda bikes prices are there or not");
//		Thread.sleep(5000);
		int expectednumber = upcomingBike.allHondaBikes.size();
		int actualNumber = upcomingBike.bikePrice.size();
		Assert.assertEquals(actualNumber, expectednumber);
	}

	@Then("I should see the expected dates of the bikes")
	public void i_should_see_the_expected_dates_of_the_bikes() throws InterruptedException {
		logger.info("checking all honda bikes expected dates are there or not");
//		Thread.sleep(5000);
		int expectednumber = upcomingBike.allHondaBikes.size();
		int actualNumber = upcomingBike.dateOfBikes.size();
		Assert.assertEquals(actualNumber, expectednumber);
	}

	@Then("Display bike details")
	public void display_bike_details() throws IOException, InterruptedException {
		// Write code here to display bike details
		logger.info("Displaying bikes details");
//			Upcomingbikes upcomingBike = new Upcomingbikes(driver);

//		Thread.sleep(5000);
		upcomingBike.bikeDetails();
		logger.info("**** Finished TC_001_UpcomingBike ****");

	}

}
