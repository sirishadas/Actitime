package com.actitime.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.AutoConstant;
import com.actitime.generics.ExcelLibrary;

public class CreateLeaveTypePage implements AutoConstant
{
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder']")
	private WebElement LeaveTypeName;
	
	@FindBy(xpath="//em[.='active']")
	private WebElement StatusoftheLeaveDropdown;
	
	@FindBy(xpath="//input[@id='leaveTypeLightBox_rateCoefficient']")
	private WebElement LeaveHourRateTextField;
	
	@FindBy(xpath="//input[@id='leaveTypeLightBox_rateCoefficient']")
	private WebElement ProcessLEaveTimeCheckbox;
	
	@FindBy(xpath="//input[@id='asPtoRadioButton_createPopup']")
	private WebElement asPTORadioButton;
	
	@FindBy(xpath="//input[@id='ptoCoefficientInput_createPopup']")
	private WebElement asPTORadioButtonTextField;

	@FindBy(xpath="//input[@id='asSickDaysRadioButton_createPopup']")
	private WebElement asSickDaysRadioButton;
	
	@FindBy(xpath="//div[@class='buttonIcon']")
	private WebElement CreateLeaveTypeButton;
	
	@FindBy(xpath="//div[@id='leaveTypeLightBox_cancelBtn']")
	private WebElement CancelButtonForCreateLeaveTypePage;
	
	public CreateLeaveTypePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void LeaveTypeNameMethod() throws IOException
	{
		LeaveTypeName.sendKeys(ExcelLibrary.getcellvalue(excel_sheet3,1,0));
	}
	public void StatusoftheLeaveDropdownMEthod()
	{
		StatusoftheLeaveDropdown.click();
	}
	public void LeaveHourRateTextFieldMethod()
	{
		LeaveHourRateTextField.sendKeys("60");
	}
	public void ProcessLEaveTimeCheckboxMethod()
	{
		ProcessLEaveTimeCheckbox.click();
	}
	public void asPTORadioButtonMethod()
	{
		asPTORadioButton.click();
	}
	public void asPTORadioButtonTextFieldMethod()
	{
		asPTORadioButtonTextField.sendKeys("4");
	}
	public void asSickDaysRadioButtonMethod()
	{
		asSickDaysRadioButton.click();
	}
	public void CreateLeaveTypeButtonMethod()
	{
		CreateLeaveTypeButton.click();
	}
	public void CancelButtonForCreateLeaveTypePageMethod()
	{
		CancelButtonForCreateLeaveTypePage.click();
	}

}
