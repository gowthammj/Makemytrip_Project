package com.MakeMyTrip_HooksFile;

import org.openqa.selenium.WebDriver;
import wrapper.Base;



import io.cucumber.java.Before;

public class Hooks_MakeMyTrip  {
	
	WebDriver driver;
	
	@Before()
	public void setup() {
		Base.launch_browser();
		Base.url("https://www.makemytrip.com/");
		Base.maximize();
		Base.implicitywait(10);
	}
	/*@After
	public void tearDcwn() {
		Base.close_brwoser();
	}*/

}
