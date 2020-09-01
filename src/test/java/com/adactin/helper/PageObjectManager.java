package com.adactin.helper;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.BookAHotel;
import com.adactin.pom.BookItinerary;
import com.adactin.pom.HomePage;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;

public class PageObjectManager {
	
	public static WebDriver driver;
	
	private HomePage hp;
	private SearchHotel sh;
	private SelectHotel s1;
	private BookAHotel bh;
	private BookItinerary bi;
	
	public PageObjectManager(WebDriver ldriver) {
		this.driver=ldriver;
		
	}
	
	public HomePage getHp() {
		
		hp=new HomePage(driver);
		return hp;
	}
	public SearchHotel getSh() {
		sh=new SearchHotel(driver);
		
		return sh;
	}
	public SelectHotel getS1() {
		s1=new SelectHotel(driver);
		return s1;
	}
	public BookAHotel getBh() {
		bh=new BookAHotel(driver);
		return bh;
	}
	public BookItinerary getBi() {
		bi=new BookItinerary(driver);
		return bi;
	}
	

}
