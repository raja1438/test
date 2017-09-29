package com.tfl.test.steps.jp;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import com.tfl.test.pages.jp.PlanAJourneyPage;
import com.tfl.test.steps.CommonSteps;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * TASK: Write all the steps necessary to drive your test scenarios to
 * completion 
 * 
 * Note: Please make use of page objects 
 * 
 */
public class JourneyPlannerSteps extends CommonSteps{

	public static final String PLAN_A_JOURNEY = "plan-a-journey/";

	@Before
	public void initialise() {
		driver.get(url + PLAN_A_JOURNEY);
		journeyPage = PageFactory.initElements(driver, PlanAJourneyPage.class);
	}
	
	@Given("^I am on Plan A Journey page$")
	public void i_am_on_Plan_A_Journey_page() throws Throwable {
		//journeyPage.
	    throw new PendingException();
	}

	@When("^I enter From \"(.*?)\" and To \"(.*?)\" and click on Plan A Journey button$")
	public void i_enter_From_and_To_and_click_on_Plan_A_Journey_button(String arg1, String arg2) throws Throwable {	    // Write code here that turns the phrase above into concrete actions
	    journeyPage.enterFromStation(arg1);
	    journeyPage.enterToStation(arg2);
		//throw new PendingException();
	}

	@Then("^I should see the journey planner results page$")
	public void i_should_see_the_journey_planner_results_page() throws Throwable {
	    journeyPage.checkWeAreInJourneyPage();
	    //throw new PendingException();
	}
	}
	


