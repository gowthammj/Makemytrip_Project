Feature: To Automate MakeMyTrip Webapplication Sucessfully.

  #Background:
  #browseroptions();
  #launch_browser();
  #url(url);
  #maximize();
  #implicitywait();
  

  Scenario:  To Automate choose locations.
    Given user should close the popup window.
    And click the buses tab.
    Then user Select the location from Chennai,Tamil Nadu To Bangalore,Karnataka.
    And Choose Travel Date as Next date from the default date and Click the Search button.
		Then user Choose Filters AC & Sleeper.
    And Choose Single Checkbox.
    Then Choose Pick up point Sholinganallur and Choose Pick up time as 6PM to 11PM.
    Then Choose Travel Operators–IntrCity SmartBus& Parveen Travels.
    And Choose Drop point Lal Bagh and also Choose Drop time as 6AM to 11AM.
		Then user Get all the Bus prices using getText() and Print them in the Console.
    Then Choose the Cheapest Bus and Select any number of seat.
    And Select Pick up point Sholinganallur & Drop point –Lal Bagh and click continue button.
		When its clicked then the user Enter Travellers Details Name,Age and Gender.
    And Enter Contact Details-EmailId and Mobile Number
    Then Select state Tamil Nadu.
    And Select CheckBox to Confirm and save billing details to your profile.
    When its saved Select any Coupon Code Radio button if available.
    And Click Continue button.
		Then user Verify and Print the text Payment options.
    And Take Screenshot of the Payment Page & Save it.
