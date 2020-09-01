package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
public static WebDriver driver;
public SelectHotel(WebDriver sldriver) {
	this.driver=sldriver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//*[@id=\"radiobutton_0\"]")
private WebElement btnRadio;

@FindBy(xpath = "//*[@id=\"continue\"]")
private WebElement btnContinue;
public WebElement getBtnRadio() {
	return btnRadio;
}

public WebElement getBtnContinue() {
	return btnContinue;
}



}
