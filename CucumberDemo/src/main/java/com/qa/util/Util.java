package com.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Util {
	
	public void SearchBox(WebDriver driver, String xpath, String value)
    {
        try
        {
            Thread.sleep(2000);
            WebElement element = driver.findElement(By.xpath(xpath));
            element.sendKeys(value);
            element.sendKeys(Keys.ENTER);
            Thread.sleep(10000);
        }
        catch (Exception e)
        {
        	System.out.println("Error: " + e.getMessage());
                       
        }
        
    }
	
	public void ScrolldownUntilVisibleLinkText(WebDriver driver, String LinkText) throws InterruptedException
    {
        
            WebElement element = driver.findElement(By.linkText(LinkText)); ;
            JavascriptExecutor je = (JavascriptExecutor)driver;
            je.executeScript("arguments[0].scrollIntoView(true);", element);
            element.click();
            Thread.sleep(2000);
        
       
    }

}
