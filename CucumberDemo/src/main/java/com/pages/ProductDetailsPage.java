package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage {
	
	private WebDriver driver;
	
	//1. By locators:
	
	@FindBy(xpath = "//button[contains(text(),'Login to view your customer price')]")
	private WebElement loginToViewPrice;
	
	
	@FindBy(xpath = "//button[contains(text(),'Warranty Information')]")
	private WebElement warrentyInfoLink;
	
	@FindBy(xpath = "//button[contains(text(),'Return Policy')]")
	private WebElement viewReturnPolicyLink;	
	
				
	//2. Constructor of the page class:
		
		public ProductDetailsPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
	//3. Page actions
		
		
		public boolean validateLoginToViewPriceDiplayed() {
			return loginToViewPrice.isDisplayed();
				
		}
		public boolean validateWarrantyInformationDiplayed() {
			return warrentyInfoLink.isDisplayed();
				
		}
		public boolean validateViewReturnPolicyDiplayed() {
			return viewReturnPolicyLink.isDisplayed();
				
		}

}
