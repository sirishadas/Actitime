package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeaveTypesLinkOpened
{
	@FindBy(xpath="//span[.='Create Leave Type']")
	private WebElement CreateLeaveTypeLink;
	
	public LeaveTypesLinkOpened(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void CreateLeaveTypeLinkMethod()
	{
		CreateLeaveTypeLink.click();
	}

}
