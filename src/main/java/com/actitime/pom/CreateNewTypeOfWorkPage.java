package com.actitime.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.*;

public class CreateNewTypeOfWorkPage extends ExcelLibrary
{
	@FindBy(xpath="//input[@id='name']")
	private WebElement NameFieldForCreatetypeofworkPage;

	@FindBy(xpath="//select[@name='active']")
	private WebElement SelectDropdownforCreatetyprofworkPage;
	@FindBy(xpath="//input[@id='billingType_setBillable']")
	private WebElement BillableRadioButtonforCratetypeofworkPage;
	@FindBy(xpath="//input[@id='billingType_setNonBillable']")
	private WebElement NonBillableRadioButtonforCratetypeofworkPage;
	@FindBy(xpath="//input[@class='rate']")
	private WebElement BillableRateTextBoxforCratetypeofworkPage;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement CreatetypeofWorkButtonforCreatetypeofworkPage;
	@FindBy(xpath="//input[@value='      Cancel      ']")
	private WebElement CancelButtonforCratetypeofworkPage;
	
	
	public CreateNewTypeOfWorkPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void NameFieldForCreatetypeofworkPageMethod() throws IOException
	{
			NameFieldForCreatetypeofworkPage.sendKeys(ExcelLibrary.getcellvalue(excel_sheet2, 1, 0));		
	}
	public void SelectDropdownforCreatetyprofworkPageMethod()
	{
		SelectDropdownforCreatetyprofworkPage.click();
	}
	public void BillableRadioButtonforCratetypeofworkPageMethod()
	{
		BillableRadioButtonforCratetypeofworkPage.click();
	}
	public void NonBillableRadioButtonforCratetypeofworkPageMethod()
	{
		NonBillableRadioButtonforCratetypeofworkPage.click();
	}
	public void BillableRateTextBoxforCratetypeofworkPageMethod()
	{
		BillableRateTextBoxforCratetypeofworkPage.sendKeys("72");
	}
	public void CreatetypeofWorkButtonforCratetypeofworkPageMethod()
	{
		CreatetypeofWorkButtonforCreatetypeofworkPage.click();
	}
	public void CancelButtonforCratetypeofworkPageMethod()
	{
		CancelButtonforCratetypeofworkPage.click();
	}
	

}
