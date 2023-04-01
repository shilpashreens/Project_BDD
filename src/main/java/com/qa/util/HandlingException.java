package com.qa.util;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qa.factory.DriverFactory;

public class HandlingException 
{
	DriverFactory driver=new DriverFactory();
	public void handleClick(WebElement element ,String string) 
	{
//		JavascriptExecutor executor = (JavascriptExecutor)driverWeb;
//		executor.executeScript("arguments[0].click();", element);	
		
		try
		{
		    element.click();
		 
		}
		catch (ElementNotInteractableException e)
		{
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);	
			element.sendKeys(string);
		}
		
		catch (NoSuchElementException e)
		{
			System.out.println("Element not present continue the execution of program");
		}
		catch (Exception e)
		{
//			JavascriptExecutor executor = (JavascriptExecutor)driverWeb;
//			executor.executeScript("arguments[0].click();", element);	
			Actions actions=new Actions((WebDriver) driver); 
		    actions.click(element).perform();
		}
	}
	
//	public void staleElemetReferException_mob(WebElement element)
//	{
//		try {
//			
//			element.click();
//			
//		} catch (Exception e) 
//		{
//			AndroidDriver driverMob = (AndroidDriver)driverWeb;
//			(new WebDriverWait(driverMob,Duration.ofSeconds(30))).until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(element)));
//			element.click();
//		}
//		
//		
//	}
	
	public void nosuchelementException(WebElement element)
	{
		try {
			
			
		} 
		catch (NoSuchElementException e)
		{
			System.out.println("Element not present continue the execution of program");
		}
		
	}

}
