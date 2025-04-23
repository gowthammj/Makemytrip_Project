package com.MakeMyTrip_PomFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Traveler_details {

	WebDriver driver;
	public Traveler_details(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='fname']")WebElement name;
	@FindBy(xpath="//input[@id='age']")WebElement age;
	@FindBy(xpath="//div[@class='genderTab makeFlex']//div[1]")WebElement gender;
	@FindBy(xpath="//input[@id='contactEmail']")WebElement email;
	@FindBy(xpath="//input[@id='mobileNumber']")WebElement mobile_number;
	@FindBy(xpath="//input[@id='dt_state_gst_info']") WebElement state;
	@FindBy(xpath="//p[@for='cb_gst_info']")WebElement check_box;
	@FindBy(xpath="//span[@class='sc-lhVmIH gLODGR']")WebElement radio_button;
	@FindBy(xpath="//div[@class='paymentBtn whiteText latoBold font16 capText']//span")WebElement final_contine_button;
	@FindBy(xpath="//div[@class='payment__options__tab']//span[text()='Payment options']")WebElement payment_text;
	
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getName() {
		return name;
	}
	public WebElement getAge() {
		return age;
	}
	public WebElement getGender() {
		return gender;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getMobile_number() {
		return mobile_number;
	}
	public WebElement getState() {
		return state;
	}
	public WebElement getCheck_box() {
		return check_box;
	}
	public WebElement getRadio_button() {
		return radio_button;
	}
	public WebElement getFinal_contine_button() {
		return final_contine_button;
	}
	public WebElement getPayment_text() {
		return payment_text;
	}
}
