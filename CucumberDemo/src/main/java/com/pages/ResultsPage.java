package com.pages;

import org.openqa.selenium.WebDriver;
import com.qa.util.Util;

public class ResultsPage {
	
private WebDriver driver;
	Util ut = new Util();
	//1. By locators:
	//private By searchBox = By.xpath("//input[@placeholder='Enter part #, keyword, etc.']");
	
	
	//2. Constructor of the page class:
	
	public ResultsPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//3. Page actions
	public String getResultsPageTitle() {
		return driver.getTitle();
	}
	
	public void selectProduct(String product) throws InterruptedException {
		
		ut.ScrolldownUntilVisibleLinkText(driver, product);
	}
	

}
