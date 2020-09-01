package com.adactin.baseclass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver getBrowse(String browserName) {

		try {
			if (browserName.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Admin\\eclipse-workspace\\AutomationPractice\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						"C:\\Users\\Admin\\eclipse-workspace\\AutomationPractice\\Drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			} else {
				System.out.println("Invalid Browser Name");
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		return driver;

	}

	public static void getUrl(String Url) {

		try {
			driver.get(Url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void waitForElementVisibility(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	public static void inputToElement(WebElement element, String value) {
		waitForElementVisibility(element);

		try {
			element.sendKeys(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void clickOnElement(WebElement element) {
		waitForElementVisibility(element);
		try {
			element.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void moveToElement(WebElement element) {
		waitForElementVisibility(element);
		try {
			Actions ac = new Actions(driver);
			ac.moveToElement(element).perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
public static void switchToFrameUsingId(String option,int index) {
	try {
		if (option.equalsIgnoreCase("id")) {
			driver.switchTo().frame(index);
			
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static void selectDropDown(WebElement element,String value,String option) {
	waitForElementVisibility(element);
	
	Select s = new Select(element);
	if (option.equalsIgnoreCase("value")) {
s.selectByValue(value);
	}else if (option.equalsIgnoreCase("visibletext")) {
		s.selectByVisibleText(value);
	}else if (option.equalsIgnoreCase("index")) {
		s.selectByIndex(Integer.parseInt(value));
		
	}

}


public static void getScreenshot(String filename) throws IOException {
	
	TakesScreenshot ts= (TakesScreenshot) driver;
	File srcfile = ts.getScreenshotAs(OutputType.FILE);
	File desfile = new File(System.getProperty("user.dir")+"\\Screenshot\\"+filename+".png");
	FileUtils.copyFile(srcfile, desfile);
	
	
}

}
