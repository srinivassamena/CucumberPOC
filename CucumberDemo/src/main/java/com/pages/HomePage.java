package com.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
	
	private WebDriver driver;
	
	//1. By locators:
		
	@FindBy(xpath = "//input[@placeholder='Enter part #, keyword, etc.']")
	private WebElement searchBox;
	//2. Constructor of the page class:
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//3. Page actions
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	public void searchCatPart(String partsCategory) {
		searchBox.sendKeys(partsCategory);
		
		
	}
	
	public void clickEnterButton() {
		searchBox.sendKeys(Keys.ENTER);
	}
	

}
