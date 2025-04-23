package com.MakeMyTrip_PomFiles;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChepestBus_details {

	WebDriver driver;
	public ChepestBus_details(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class='sortViewContainer makeFlex spaceBetween hrtlCenter']//p[@class='latoBold secondaryTxt font14']")WebElement countOfBuses;
	@FindBy(xpath="//div[@class='busCardContainer ']//div//div[2]//p") List<WebElement> allBusNames;
	@FindBy(xpath="//div[@class='busCardContainer ']//div//div[@class='priceSection']//span[@id='price']")List<WebElement>all_prices;
	@FindBy(xpath="//li[text()='Cheapest']")WebElement chepest_button;
	@FindBy(xpath="//div[@class='busCardFooter makeFlex spaceBetween ']//div[@data-test-id='select-seats']")WebElement found_bus;
	@FindBy(xpath="//div[@class='makeFlex column ']//div[2]//div//div[13]//div//li//span[@data-testid='seat_horizontal_sleeper_available']")WebElement but_seat;
	@FindBy(xpath="//span[@class='makeFlex font12 column blackText busStopTextContainer']//span[text()='Sholinganallur']")WebElement p_location;
	@FindBy(xpath="//span[@class='makeFlex font12 column blackText busStopTextContainer']//span[text()='Lal Bagh']")WebElement d_location;
	@FindBy(xpath="//div[@class='cta-book-seats font16 capText makeFlex hrtlCenter vrtlCenter active']//span")WebElement continue_button;
	
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getCountOfBuses() {
		return countOfBuses;
	}
	public List<WebElement> getAllBusNames() {
		return allBusNames;
	}
	public List<WebElement> getAll_prices() {
		return all_prices;
	}
	public WebElement getChepest_button() {
		return chepest_button;
	}
	public WebElement getFound_bus() {
		return found_bus;
	}
	public WebElement getBut_seat() {
		return but_seat;
	}
	public WebElement getP_location() {
		return p_location;
	}
	public WebElement getD_location() {
		return d_location;
	}
	public WebElement getContinue_button() {
		return continue_button;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@FindBys(
//			{ 	@FindBy(xpath="//div[@class='busCardContainer '][1]//div//div[2]//p"),
//				@FindBy(xpath="//div[@class='busCardContainer '][2]//div//div[2]//p"),
//				@FindBy(xpath="//div[@class='busCardContainer '][3]//div//div[2]//p"),
//				@FindBy(xpath="//div[@class='busCardContainer '][4]//div//div[2]//p"),
//				@FindBy(xpath="//div[@class='busCardContainer '][5]//div//div[2]//p")
//			}) 
//			WebElement all_busnames;
}
