package com.MakeMyTrip_PomFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Page {
	
	WebDriver driver;
	
	public Search_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[@data-cy='closeModal']")WebElement close_popup;
	@FindBy(xpath="//span[@class='chNavIcon appendBottom2 chSprite chBuses inactive']")WebElement bus_buuton;
	@FindBy(xpath="//input[@id='fromCity']")WebElement from_button;
	@FindBy(xpath="//div[@id='react-autowhatever-1']//div//ul[1]//li[7]")WebElement from_city;
	@FindBy(xpath="//input[@id='toCity']")WebElement to_button;
	@FindBy(xpath="//div[@id='react-autowhatever-1']//div//ul//li[3]//span")WebElement to_city;
	@FindBy(xpath="//input[@data-cy='travelDateVal']")WebElement date_calender;
	//@FindBy(xpath="//div[@class='DayPicker-Day DayPicker-Day--today']//following-sibling::div[@class='DayPicker-Day DayPicker-Day--selected']")WebElement date;
	@FindBy(xpath="//div[@aria-label='Mon May 12 2025']")WebElement temp_bus;
	public WebElement getTemp_bus() {
		return temp_bus;
	}
	@FindBy(xpath="//button[text()='Search']")WebElement search_button;
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getClose_popup() {
		return close_popup;
	}
	public WebElement getBus_buuton() {
		return bus_buuton;
	}
	public WebElement getFrom_button() {
		return from_button;
	}
	public WebElement getFrom_city() {
		return from_city;
	}
	
	public WebElement getTo_button() {
		return to_button;
	}
	public WebElement getTo_city() {
		return to_city;
	}
	public WebElement getDate_calender() {
		return date_calender;
	}
	/*public WebElement getDate() {
		return date;
	}*/
	public WebElement getSearch_button() {
		return search_button;
	}

	

}
