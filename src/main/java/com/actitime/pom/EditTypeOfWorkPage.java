package com.actitime.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditTypeOfWorkPage 
{
	@FindBy(xpath="//input[@id='name']")
	private WebElement nameFieldInEditTypeOfWork;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement saveChangesbuttonIneditTypeOfWork;
	@FindBy(xpath="//input[contains(@value,'Cancel')]")
	private WebElement cancelButtonInEditTypeOfWork;
	@FindBy(xpath="//input[@value='Delete This Type of Work']")
	private WebElement deleteThisTypeOfWorkButton;
	
	public EditTypeOfWorkPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void nameFieldInEditTypeOfWorkMethod()
	{
		nameFieldInEditTypeOfWork.sendKeys(Keys.COMMAND,"a");
		nameFieldInEditTypeOfWork.sendKeys(Keys.DELETE);
		nameFieldInEditTypeOfWork.sendKeys("abcd");
	}
	
	public void saveChangesButtonMethod()
	{
		saveChangesbuttonIneditTypeOfWork.click();
	}
	
	public void deleteThisTypeOFWorkButtonMethod()
	{
		deleteThisTypeOfWorkButton.click();
	}

}
