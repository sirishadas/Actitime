package com.actitime.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.actitime.generics.Basepage;

public class ActitimeHome extends Basepage
{
	WebDriver driver;
	
	@FindBy(xpath="//div[@class='logoSwitcherText']")
	private WebElement actiplansLink;
	
	@FindBy(xpath="//div[@id='container_tt']")
	private WebElement timetrackLink;
	
	@FindBy(xpath="//div[@id='container_tasks']")
	private WebElement tasksLink;
	
	@FindBy(xpath="//div[@id='container_reports']")
	private WebElement reportsLink;
	
	@FindBy(xpath="//div[@id='container_users']")
	private WebElement usersLink;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[1]")
	private WebElement calendarsLink;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[2]")
	private WebElement settingsLink;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[3]")
	private WebElement integrationsLink;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[4]")
	private WebElement helpandsupportLink;
	
	@FindBy(xpath="//a[@class='logout']")
	private WebElement logoutLink;
	
	@FindBy(xpath="//a[@class='userProfileLink username ']")
	private WebElement userprofileLink;
	
	public ActitimeHome(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void actiplansLinkMethod()
	{
		actiplansLink.click();
	}
	
	public void timetrackLinkMethod()
	{
		timetrackLink.click();
	}
	
	public void tasksLinkMethod()
	{
		explicitwait(driver, 20, "//a[@class='logout']" );
		tasksLink.click();
	}
	
	public void reportLinkMethod()
	{
		reportsLink.click();
	}
	
	public void usersLinkMethod()
	{
		usersLink.click();
	}
	
	public void calendarsLinkMethod()
	{
		calendarsLink.click();
	}
	
	public void settingsLinkMethod() throws InterruptedException
	{
//		Thread.sleep(3000);
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click()", settingsLink);
		explicitwait(driver, 20, "//a[@class='logout']");
		jsexecutor(driver, settingsLink);
		
	}
	
	public void integrationsLinkMethod()
	{
		integrationsLink.click();
	}
	
	public void helpandsupportLinkMethod()
	{
		helpandsupportLink.click();
	}
	
	public void logoutLinkMethod()
	{
		explicitwait(driver, 20, "//a[@class='logout']");
		logoutLink.click();
	}
	
	public void userprofileLinkMethod()
	{
		userprofileLink.click();
	}

}
