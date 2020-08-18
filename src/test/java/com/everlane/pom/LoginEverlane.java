package com.everlane.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginEverlane {
	public WebDriver driver;

	public LoginEverlane(WebDriver pdriver) {
		this.driver = pdriver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@class='new-user-modal__close-button']")
	private WebElement popup;

	@FindBy(xpath = "//button[text()=\"Log In\"]")
	private WebElement login;

	@FindBy(id = "emailaddress")
	private WebElement email;

	@FindBy(xpath = "//*[@type=\"submit\"]")
	private WebElement submit;

	@FindBy(xpath = "//*[@id=\"page\"]/div[4]/div/header/div[1]/div[2]/a/div")
	private WebElement menoption;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getPopup() {
		return popup;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getMen() {
		return menoption;
	}
}
