package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimetrackPage 
{
	@FindBy(xpath="//a[.='Enter Time-Track']")
	private WebElement entertimetrackpage;
	
	@FindBy(xpath="//a[.='View Time-Track']")
	private WebElement viewtimetrackPage;
	
	@FindBy(xpath="//a[.='Lock Time-Track']")
	private WebElement locktimetrackPage;
	
	@FindBy(xpath="//a[.='Approve Time-Track']")
	private WebElement approvetimetrackPage;
	
	public TimetrackPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void entertimetrackpageMethod()
	{
		entertimetrackpage.click();
	}
	
	public void viewtimetrackpageMethod()
	{
		viewtimetrackPage.click();
	}
	
	public void locktimetrackpageMethod()
	{
		locktimetrackPage.click();
	}
	
	public void approvetimetrackpageMethod()
	{
		approvetimetrackPage.click();
	}

}
