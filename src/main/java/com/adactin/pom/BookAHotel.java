package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotel {
	public static WebDriver driver;
	
	public BookAHotel(WebDriver bdriver) {
		this.driver=bdriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id=\"first_name\"]")
	private WebElement fName;
	
	@FindBy(xpath = "//*[@id=\"last_name\"]")
	private WebElement lName;
	
	@FindBy(xpath = "//*[@id=\"address\"]")
	private WebElement bAddress;
	
	@FindBy(xpath = "//*[@id=\"cc_num\"]")
	private WebElement cCardNumber ;
	
	@FindBy(xpath = "//*[@id=\"cc_type\"]")
	private WebElement cCardType;
	
	@FindBy(xpath = "//*[@id=\"cc_exp_month\"]")
	private WebElement ccExpMonth ;
	
	@FindBy(xpath = "//*[@id=\"cc_exp_year\"]")
	private WebElement ccExpYear ;
	
	@FindBy(xpath = "//*[@id=\"cc_cvv\"]")
	private WebElement cvvNumber ;
	
	@FindBy(xpath = "//*[@id=\"book_now\"]")
	private WebElement bookNow ;

	public WebElement getfName() {
		return fName;
	}

	public WebElement getlName() {
		return lName;
	}

	public WebElement getbAddress() {
		return bAddress;
	}

	public WebElement getcCardNumber() {
		return cCardNumber;
	}

	public WebElement getcCardType() {
		return cCardType;
	}

	public WebElement getCcExpMonth() {
		return ccExpMonth;
	}

	public WebElement getCcExpYear() {
		return ccExpYear;
	}

	public WebElement getCvvNumber() {
		return cvvNumber;
	}

	public WebElement getBookNow() {
		return bookNow;
	}
	

}
