package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookItinerary {
	public static WebDriver driver;
	public BookItinerary(WebDriver bidriver ) {
		this.driver=bidriver;
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath = "//*[@id=\"my_itinerary\"]")
private WebElement BookItinerary;
	
	@FindBy(xpath = "//*[@id=\"logout\"]")
	private WebElement Logout;
	public WebElement getBookItinerary() {
		return BookItinerary;
	}

	public WebElement getLogout() {
		return Logout;
	}
	

}
