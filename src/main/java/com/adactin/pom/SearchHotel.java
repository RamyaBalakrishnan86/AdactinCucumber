package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
public static WebDriver driver;

public SearchHotel(WebDriver sdriver) {
	this.driver=sdriver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath = "//*[@id=\"location\"]")
private WebElement location;

@FindBy(xpath = "//*[@id=\"hotels\"]")
private WebElement hotel;

@FindBy(xpath = "//*[@id=\"room_type\"]")
private WebElement rType;

@FindBy(xpath = "//*[@id=\"room_nos\"]")
private WebElement nRooms ;

@FindBy(xpath = "//*[@id=\"datepick_in\"]")
private WebElement cInDate ;

@FindBy(xpath = "//*[@id=\"datepick_out\"]")
private WebElement cOutDate ;

@FindBy(xpath = "//*[@id=\"adult_room\"]")
private WebElement adultRoom  ;

@FindBy(xpath = "//*[@id=\"child_room\"]")
private WebElement  childRoom;

@FindBy(xpath = "//*[@id=\"Submit\"]")
private WebElement  btnSearch;

public WebElement getLocation() {
	return location;
}

public WebElement getHotel() {
	return hotel;
}

public WebElement getrType() {
	return rType;
}

public WebElement getnRooms() {
	return nRooms;
}

public WebElement getcInDate() {
	return cInDate;
}

public WebElement getcOutDate() {
	return cOutDate;
}

public WebElement getAdultRoom() {
	return adultRoom;
}

public WebElement getChildRoom() {
	return childRoom;
}

public WebElement getBtnSearch() {
	return btnSearch;
}


}
