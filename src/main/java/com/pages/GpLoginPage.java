package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GpLoginPage
{
	
	@FindBy(id = "mobile_number")
	private WebElement mobileNUmberField;
	
	public WebElement mobileNUmberField() 
	{
		return mobileNUmberField;
		
	}
	

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement getOTP_continue;
	public WebElement getOTP_continue() {
		return getOTP_continue;
	}
	
	@FindBy(id = "first_name")
	private WebElement OTPfield;
	public WebElement OTPfield() 
	{
		return OTPfield;
		
	}
	
	@FindBy(name = "pan1")
	private WebElement panfield;
	public WebElement panfield()
	{
		return panfield;
		
	}
	
	public GpLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
