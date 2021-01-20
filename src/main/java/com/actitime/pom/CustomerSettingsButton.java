package com.actitime.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.*;

public class CustomerSettingsButton extends Basepage
{
	WebDriver driver;
	@FindBy(xpath="//div[@class='editCustomerPanelHeader']//div[@class='nameLabel']")
	private WebElement editCustomerNameField;
	
	@FindBy(xpath="(//div[contains(text(),'ACTIONS')])[1]")
	private WebElement actionsDropdownButton;
	
	@FindBy(xpath="(//div[.='Delete'])[2]")
	private WebElement deleteButtonfromActionsDropdown;
	
	@FindBy(xpath="//span[.='Delete permanently']")
	private WebElement deletePermanentlyButton;
	
	public CustomerSettingsButton(WebDriver driver)
    {
		this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
	
	public void editCustomerNameFieldMethod() throws InterruptedException
	{
		explicitwait(driver, 20, "//div[@class='editCustomerPanelHeader']//div[@class='nameLabel']" );
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", editCustomerNameField);
		//String s=editCustomerNameField.getAttribute("value");
		String s=editCustomerNameField.getText();
		System.out.println("customer name is "+s);
		editCustomerNameField.sendKeys(Keys.COMMAND,"a");
		editCustomerNameField.sendKeys(Keys.DELETE);
		editCustomerNameField.sendKeys("seleniumtesting.");
	}
	
	public void actionsDropdownButtonMEthod()
	{
		jsexecutor(driver, actionsDropdownButton);
	}
	
	public void deleteButtonfromActionsDropdownMethod()
	{
		jsexecutor(driver, deleteButtonfromActionsDropdown);
	}
	
	public void deletePermanentlyButtonMethod()
	{
		jsexecutor(driver,deletePermanentlyButton);
	}

}
