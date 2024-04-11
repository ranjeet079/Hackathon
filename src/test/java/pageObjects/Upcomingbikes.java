package pageObjects;


import java.io.IOException;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import utilities.ExcelUtils;
import factory.BaseClass;

public class Upcomingbikes extends BasePage {
	ExcelUtils Eu=new ExcelUtils();
	
	
	
	public Upcomingbikes(WebDriver driver) {
		super(driver);
		
	}
	
	
	
	
	@FindBy(xpath = "//a[normalize-space()='New Bikes']")
	public WebElement NewBikes;
	
	@FindBy(xpath = "//span[normalize-space()='Upcoming Bikes']")
	public WebElement upcomingBikes;
	
	@FindBy(id = "makeId")
	public WebElement Brand;
	
	@FindBy(xpath = "//option[text()='Honda']")
	public WebElement HondaOption;
	
	@FindBy(xpath="//h1[normalize-space()='Honda Upcoming Bikes in India' ]")
	public WebElement HondaPageTitle;
	
    @FindBy(xpath = "//span[@class='zw-cmn-loadMore']")
	public WebElement viewMoreBikesButton;
	
	
	@FindBy(xpath="//li/div[@class='zw-con p-0 sl-card']")
    public List<WebElement> allHondaBikes;
    
    @FindBy(css = ".lnk-hvr.block.of-hid.h-height")
    public List<WebElement> modelName;
	
    @FindBy(xpath = "//li[contains(@class,'modelItem')]")
    public List<WebElement> bikePrice;
	
    @FindBy(css = ".clr-try.fnt-14")
	public List<WebElement> dateOfBikes;
	
	
	//click new bikes
	public void HoverNewBikes() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(NewBikes).perform();

	}
	
	//click upcoming bikes
	public void selectUpcomingBikes() throws IOException{
		
		Actions actions = new Actions(driver);
		actions.moveToElement(upcomingBikes).perform();
		
		new BaseClass().screenshot("UpcomingBike");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", upcomingBikes);
	}
	
	public void clickManufacturers() {
		Brand.click();
	}
	
	//Handling Dropdown
	public void selectBrand() {
		Select s=new Select(Brand);
		s.selectByVisibleText("Honda");
	}
	
	//Go to view more bikes and click
	public void clickViewMoreButton() throws InterruptedException {

		try {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", viewMoreBikesButton);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void bikeDetails() throws IOException, InterruptedException {
		
		new BaseClass().screenshot("All_Bikes");
		Eu.setCellData("UpcomingBike", 0, 0, "BikeName");
		Eu.setCellData("UpcomingBike", 0, 1, "Price");
		Eu.setCellData("=U        pcomingBike", 0, 2, "LaunchDate");
		int row=1;
		for (int i = 0; i < modelName.size(); i++) {
          String  bikeName = modelName.get(i).getText();
			String launchDate = dateOfBikes.get(i).getText();
			int price = Integer.parseInt(bikePrice.get(i).getAttribute("data-price"));
			if (price < 400000) {
				System.out.println(bikeName + "\n" + price + "\n" + launchDate);
				System.out.println("---------------------------");
			Eu.setCellData("UpcomingBike", row, 0, bikeName);
			Eu.setCellData("UpcomingBike", row, 1, price + "");
			Eu.setCellData("UpcomingBike", row, 2, launchDate);
				row++;
			}
		}
		
		
	}
}
