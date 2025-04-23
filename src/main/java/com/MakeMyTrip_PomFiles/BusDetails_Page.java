package com.MakeMyTrip_PomFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusDetails_Page {

	WebDriver driver;
	public BusDetails_Page (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='makeFlex']//div//span[text()='AC']")WebElement ac_button;
	@FindBy(xpath="//div[@class='makeFlex']//div//span[text()='Sleeper']")WebElement sleeper_button;
	@FindBy(xpath="//div[@class='makeFlex column']//span")WebElement checkbox;
	@FindBy(xpath="//input[@id='Pick up point']")WebElement pickup_button;
	@FindBy(xpath="//li[4]//div[@class='appendTop10']//span[text()='Show All(45)']")WebElement showll_button;
	@FindBy(xpath="//span[text()='Sholinganallur']")WebElement pickup_location;
	@FindBy(xpath="//span[text()='Show less']")WebElement showless_button;
	@FindBy(xpath="//div[@class='filterContainer']//div[2]//ul//li[5]//div[2]//div[4]//span[text()='6 PM to 11 PM']")WebElement pickup_time;
	@FindBy(xpath="//span[text()='IntrCity SmartBus']")WebElement bus_one;
	@FindBy(xpath="//input[@id='Travel Operators']")WebElement travel_operators;
	@FindBy(xpath="//span[text()='Parveen Travels']")WebElement bus_two;
	@FindBy(xpath="//input[@id='Drop point']")WebElement drop_button;
	@FindBy(xpath="//li[7]//div[@class='appendTop10']//span[text()='Show All(45)']")WebElement showalldown_button;
	@FindBy(xpath="//span[text()='Lal Bagh']")WebElement drop_location;
	@FindBy(xpath="//li[8]/div[2]//span[text()='11 PM to 6 AM']")WebElement drop_time;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getAc_button() {
		return ac_button;
	}
	public WebElement getSleeper_button() {
		return sleeper_button;
	}
	public WebElement getCheckbox() {
		return checkbox;
	}
	public WebElement getPickup_button() {
		return pickup_button;
	}
	public WebElement getShowll_button() {
		return showll_button;
	}
	public WebElement getPickup_location() {
		return pickup_location;
	}
	public WebElement getShowless_button() {
		return showless_button;
	}
	public WebElement getPickup_time() {
		return pickup_time;
	}
	public WebElement getBus_one() {
		return bus_one;
	}
	public WebElement getTravel_operators() {
		return travel_operators;
	}
	public WebElement getBus_two() {
		return bus_two;
	}
	public WebElement getDrop_button() {
		return drop_button;
	}
	public WebElement getShowalldown_button() {
		return showalldown_button;
	}
	public WebElement getDrop_location() {
		return drop_location;
	}
	public WebElement getDrop_time() {
		return drop_time;
	}

}
