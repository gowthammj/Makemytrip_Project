package com.MakeMyTrip_StepDefinition;


import java.io.IOException;

import org.openqa.selenium.WebElement;

import com.MakeMyTrip_PomFiles.BusDetails_Page;
import com.MakeMyTrip_PomFiles.ChepestBus_details;
import com.MakeMyTrip_PomFiles.Search_Page;
import com.MakeMyTrip_PomFiles.Traveler_details;


import io.cucumber.java.en.*;
import wrapper.Base;


public class StepDefinition_MakeMyTrip extends Base {
	
	 public static Search_Page sg;
	 public static BusDetails_Page bg;
	 public static ChepestBus_details cb;
	 public static Traveler_details td;

	@Given("user should close the popup window.")
	public void userShouldCloseThePopupWindow() {
		sg=new Search_Page(driver);
		explicitywait(sg.getClose_popup(), 10);
		clickelement(sg.getClose_popup());
	   }
	@Given("click the buses tab.")
	public void clickTheBusesTab() {
		clickelement(sg.getBus_buuton());
	   }
	@Then("user Select the location from Chennai,Tamil Nadu To Bangalore,Karnataka.")
	public void userSelectTheLocationFromChennaiTamilNaduToBangaloreKarnataka() {
		explicitywait(sg.getFrom_button(), 10);
		clickelement(sg.getFrom_button());
		explicitywait(sg.getFrom_city(), 10);
		mousehover(sg.getFrom_city());
		clickelement(sg.getFrom_city());
		
		explicitywait(sg.getTo_city(), 10);
		mousehover(sg.getTo_city());
		clickelement(sg.getTo_city());
		
	   }
	@Then("Choose Travel Date as Next date from the default date and Click the Search button.")
	public void chooseTravelDateAsNextDateFromTheDefaultDateAndClickTheSearchButton() {
		explicitywait(sg.getDate_calender(), 10);
		js_excecutor_click(sg.getDate_calender());
		//js_excecutor_click(sg.getDate());
		js_excecutor_click(sg.getTemp_bus());
		clickelement(sg.getSearch_button());
	   }
	@Then("user Choose Filters AC & Sleeper.")
	public void user_choose_filters_ac_sleeper() {
		bg=new BusDetails_Page(driver);
		clickelement(bg.getAc_button());
		clickelement(bg.getSleeper_button());
	   }

	@Then("Choose Single Checkbox.")
	public void choose_single_checkbox() {
		clickelement(bg.getCheckbox());
	   	}

	@Then("Choose Pick up point Sholinganallur and Choose Pick up time as 6PM to 11PM.")
	public void choose_pick_up_point_sholinganallur_and_choose_pick_up_time_as_6pm_to_11pm() {
		clickelement(bg.getPickup_button());
		explicitywait(bg.getShowll_button(),10);
		clickelement(bg.getShowll_button());
		explicitywait(bg.getPickup_location(), 10);
		clickelement(bg.getPickup_location());
		
		js_excecutor_scroll_specific_position(0,500);
		//clickelement(bg.getPickup_time());
		js_excecutor_click(bg.getPickup_time());
	   }
	@Then("Choose Travel Operators–IntrCity SmartBus& Parveen Travels.")
	public void choose_travel_operators_intr_city_smart_bus_parveen_travels() {
		clickelement(bg.getBus_one());
		explicitywait(bg.getTravel_operators(), 10);
		clickelement(bg.getTravel_operators());
		//sendkeysvalue(bg.getTravel_operators(), "par");
		//clickelement(bg.getBus_two());
		}
	@Then("Choose Drop point Lal Bagh and also Choose Drop time as 6AM to 11AM.")
	public void choose_drop_point_lal_bagh_and_also_choose_drop_time_as_6am_to_11am() {
		clickelement(bg.getDrop_button());
		explicitywait(bg.getShowalldown_button(),10);
		clickelement(bg.getShowalldown_button());
		explicitywait(bg.getDrop_location(), 10);
		clickelement(bg.getDrop_location());
		
		js_excecutor_scroll_down();
		js_excecutor_click(bg.getDrop_time());
	   }

	@Then("user Get all the Bus prices using getText\\() and Print them in the Console.")
	public void user_get_all_the_bus_prices_using_get_text_and_print_them_in_the_console() {
		cb=new ChepestBus_details(driver);
		js_excecutor_scroll_up();
		System.out.println("Total Number of buses available :"+cb.getCountOfBuses().getText());
		
		cb.getAllBusNames();
		for(WebElement buss:cb.getAllBusNames()) {
			System.out.println("Bus names :"+buss.getText());
		}
		
		cb.getAll_prices();
		for(WebElement prices:cb.getAll_prices()) {
			System.out.println("Price details :"+prices.getText());
			}
		
		}
	@Then("Choose the Cheapest Bus and Select any number of seat.")
	public void choose_the_cheapest_bus_and_select_any_number_of_seat() {
		clickelement(cb.getChepest_button());
		clickelement(cb.getFound_bus());
		//explicitywait(cb.getFound_bus(),10);
		//js_excecutor_click(cb.getFound_bus());
	   }

	@Then("Select Pick up point Sholinganallur & Drop point –Lal Bagh and click continue button.")
	public void select_pick_up_point_sholinganallur_drop_point_lal_bagh_and_click_continue_button() {
		//explicitywait(cb.getBut_seat(), 10);
		js_excecutor_click(cb.getBut_seat());
		clickelement(cb.getP_location());
		clickelement(cb.getD_location());
		clickelement(cb.getContinue_button());
		
	    }
	

	@When("its clicked then the user Enter Travellers Details Name,Age and Gender.")
	public void its_clicked_then_the_user_enter_travellers_details_name_age_and_gender() {
		td =new Traveler_details(driver);
		explicitywait(td.getName(),10);
		clickelement(td.getName());
		sendkeysvalue(td.getName(), "Gowtham");
		clickelement(td.getAge());
		sendkeysvalue(td.getAge(), "28");
		clickelement(td.getGender());
	
	   }

	@When("Enter Contact Details-EmailId and Mobile Number")
	public void enter_contact_details_email_id_and_mobile_number() {
		clickelement(td.getEmail());
		sendkeysvalue(td.getEmail(), "gowthammj1707@gmail.com");
		clickelement(td.getMobile_number());
		sendkeysvalue(td.getMobile_number(), "6383776703");
	  }

	@Then("Select state Tamil Nadu.")
	public void select_state_tamil_nadu() {
		td.getCheck_box();
		//clickelement(td.getCheck_box());
		//dropdpwn_selectby(td.getCheck_box(), "Tamil Nadu");
	   	}

	@Then("Select CheckBox to Confirm and save billing details to your profile.")
	public void select_check_box_to_confirm_and_save_billing_details_to_your_profile() {
		checkbox(td.getCheck_box());
	   }

	@When("its saved Select any Coupon Code Radio button if available.")
	public void its_saved_select_any_coupon_code_radio_button_if_available() {
		js_excecutor_scroll_up();
		explicitywait(td.getRadio_button(), 10);
		radio(td.getRadio_button());
	    	}

	@When("Click Continue button.")
	public void click_continue_button() {
		clickelement(td.getFinal_contine_button());
	   	}

	@Then("user Verify and Print the text Payment options.")
	public void user_verify_and_print_the_text_payment_options() {
		//explicitywait(td.getPayment_text(), 10);
		String text=td.getPayment_text().getText();
		System.out.println("Confirmation text :"+text);
	    	}

	@Then("Take Screenshot of the Payment Page & Save it.")
	public void take_screenshot_of_the_payment_page_save_it() throws IOException {
		fulpage_screensshot("C:\\Users\\gowth\\eclipse-workspace\\MakeMyTrip_Project\\target\\screenshot\\payment.png");
	   }

	

}
