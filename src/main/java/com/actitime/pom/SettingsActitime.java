package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingsActitime 
{
	@FindBy(xpath="//div[.='Turn Features On / Off']")
	private WebElement turnfeatureslinkforSettings;
	
	@FindBy(xpath="//div[normalize-space()='General Settings']")
	private WebElement generalsettingslink;
	
	@FindBy(xpath="//a[.='Workflow Settings']")
	private WebElement workflowsettingslink;
	
	@FindBy(xpath="//a[.='Types of Work']")
	private WebElement typesofworklink;
	
	@FindBy(xpath="//a[.='Leave Types']")
	private WebElement leavetypeslink;
	
	@FindBy(xpath="//a[.='Notifications']")
	private WebElement notificationslink;
	
	@FindBy(xpath="//a[.='Logo Settings']")
	private WebElement logosettingslink;
	
	@FindBy(xpath="//div[.='Licenses']")
	private WebElement licenseslink;
	
	public SettingsActitime(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void turnfeturesonORoffMethod()
	{
		turnfeatureslinkforSettings.click();
	}
	public void generalsettingsMethod()
	{
		generalsettingslink.click();
	}
	public void workflowsettingsMethod()
	{
		workflowsettingslink.click();
	}
	public void typesofworkMethod()
	{
		typesofworklink.click();
	}
	public void leavetypesMethod()
	{
		leavetypeslink.click();
	}
	public void notificationsMethod()
	{
		notificationslink.click();
	}
	public void logosettingsMethod()
	{
		logosettingslink.click();
	}
	public void licensesMethod()
	{
		licenseslink.click();
	}
	
	

}
