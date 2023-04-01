package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.factory.DriverFactory;

public class LoginPage
{
	private WebDriver driver;
	
	
	@FindBy(id = "index_input_mobile-number-webview")
	private WebElement mobile_number;
	public WebElement mobile_number() 
	{
		return mobile_number;
		
	}
	
	@FindBy(id = "index_input_agreement-webview")
	private WebElement checkBox_agreement;
	public WebElement checkBox_agreement() 
	{
		return checkBox_agreement;
		
	}
	
	@FindBy(id = "index_button_submit-webview")
	private WebElement index_button_submit_webview;
	public WebElement apply_now() 
	{
		return index_button_submit_webview;
		
	}
	
	@FindBy(id = "index_button_submit-verify-otp-webview")
	private WebElement verifyButton;
	
	public WebElement verifyButton() 
	{
		return verifyButton;
		
	}
	
	public void entermobilenumber(String int1) 
	{
	driver.findElement(By.xpath("(//input[@id='index_input_mobile-number'])[1]")).sendKeys(int1);
		
	}
	
//	public LoginPage(WebDriver driver)
//	{
//		this.driver=driver;
//	}
//	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
}
