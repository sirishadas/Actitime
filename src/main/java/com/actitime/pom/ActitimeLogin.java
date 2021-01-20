package com.actitime.pom;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.actitime.generics.AutoConstant;
import com.actitime.generics.ExcelLibrary;


public class ActitimeLogin extends ExcelLibrary implements AutoConstant
{
	@FindBy(id="username")
	private WebElement usernameTextfield;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordTextfield;
	
	@FindBy(xpath="//input[@name='remember']")
	private WebElement keepmeloggedincheckbox;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(xpath="//a[.='Forgot your password?']")
	private WebElement forgotyourpasswordLink;
	
	@FindBy(xpath="//a[.='actiTIME Inc.']")
	private WebElement actitimeincLink;
	
	public ActitimeLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginMethod() throws IOException
	{
		usernameTextfield.sendKeys(ExcelLibrary.getcellvalue(AutoConstant.excel_sheet, 1, 0));
		passwordTextfield.sendKeys(ExcelLibrary.getcellvalue(AutoConstant.excel_sheet, 1, 1));
		keepmeloggedincheckbox.click();
		loginButton.click();
	}
	
	public void forgotyourpasswordMethod()
	{
		forgotyourpasswordLink.click();
	}
	
	public void actitimeIncLink()
	{
		actitimeincLink.click();
	}

}
