package com.stepdefiniton.ste;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.Everlane.baseclass.BaseClass1;
import com.everlane.pom.LoginEverlane;
import com.everlane.runner.Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef extends BaseClass1 {
	public static WebDriver driver = Runner.driver;
	LoginEverlane lo = new LoginEverlane(driver);

	@Given("^User enter in the suitable everlane url$")
	public void user_enter_in_the_suitable_everlane_url() throws Throwable {
		geturl("https://www.everlane.com/");
	}

	@When("^user click the offer popup ntification$")
	public void user_click_the_offer_popup_ntification() throws Throwable {
		Thread.sleep(3000);
		clickElement(lo.getPopup());
	}

	@When("^User click the login function application$")
	public void user_click_the_login_function_application() throws Throwable {
		clickElement(lo.getLogin());
	}

	@When("^user enter the valid email in the box emailbox$")
	public void user_enter_the_valid_email_in_the_box_emailbox() throws Throwable {
		sendKeys(lo.getEmail(), "ananthamech003@gmail.com");
	}

	@When("^user click the continue function button$")
	public void user_click_the_continue_function_button() throws Throwable {
		Thread.sleep(3000);
		clickElement(lo.getSubmit());
		driver.navigate().refresh();
	}

	@Then("^User will choose and click the men option$")
	public void user_will_choose_and_click_the_men_option() throws Throwable {
		actions(lo.getMen());
		clickElement(lo.getMen());
	}

}