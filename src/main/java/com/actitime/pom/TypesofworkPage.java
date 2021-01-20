package com.actitime.pom;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TypesofworkPage 
{
	WebDriver driver;
	Alert alert;
	@FindBy(xpath="//span[.='Create Type of Work']")
	private WebElement createtypeofworkfromTypesofworkLink;
	
	@FindBy(xpath="//input[@type='button']")
	private WebElement showtypesofworkfromTypesofworkLink;
	
	@FindBy(xpath="//input[@id='filterStatusCriterion_All']")
	private WebElement StatusallRadiobuttonforTypesofworkLink;
	@FindBy(xpath="//input[@id='filterStatusCriterion_Active']")
	private WebElement statusactiveRadiobuttonforTypesofworkLink;
	@FindBy(xpath="//input[@id='filterStatusCriterion_Archived']")
	private WebElement statusarchivedRadiobuttonforTypesofworkLink;
	@FindBy(xpath="//input[@id='filterBillableCriterion_All']")
	private WebElement CategoryallRadiobuttonforTypesofworkLink;
	@FindBy(xpath="//input[@id='filterBillableCriterion_Billable']")
	private WebElement CategoryBillableRadiobuttonforTypesofworkLink;
	@FindBy(xpath="//input[@id='filterBillableCriterion_NonBillable']")
	private WebElement CategoryNonBillableRadiobuttonforTypesofworkLink;
	
	@FindBy(xpath="//table[@class='withRoundCorners']//tr[@class='typelisttblrow_non-billable']")
	private List<WebElement> deleteTheTypeOfWorkAdded;
	
	@FindBy(xpath="//tr[@class='typelisttblrow_non-billable']//td[@class='listtblcell lastInRow']")
	private List<WebElement> deleteWRTOtypeOfWork;
	
	@FindBy(xpath="//td[@class='listtblcell billingTypeCell']")
	private List<WebElement> typesOfWorkList;
		
	public TypesofworkPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createtypesofworkforTypesofworkLinkMethod()
	{
		createtypeofworkfromTypesofworkLink.click();
	}
	public void showtypesofworkfromTypesofworkLinkMethod()
	{
		showtypesofworkfromTypesofworkLink.click();
	}
	public void StatusAllRadioButtonforTypesofworkLinkMethod()
	{
		StatusallRadiobuttonforTypesofworkLink.click();
	}
	public void StatusActiveonlyRadioButtonforTypesofworkLinkMethod()
	{
		statusactiveRadiobuttonforTypesofworkLink.click();
	}
	public void StatusArchivedonlyRadioButtonforTypesofworkLinkMethod()
	{
		statusarchivedRadiobuttonforTypesofworkLink.click();
	}
	public void CategoryAllRadioButtonforTypesofworkLinkMethod()
	{
		CategoryallRadiobuttonforTypesofworkLink.click();
	}
	public void CategoryBillableonlyRadioButtonforTypesofworkLinkMethod()
	{
		CategoryBillableRadiobuttonforTypesofworkLink.click();
	}
	public void CategoryNonBillableonlyRadioButtonforTypesofworkLinkMethod()
	{
		CategoryNonBillableRadiobuttonforTypesofworkLink.click();
	}
	public void deleteTheTypeOfWorkAddedMethod() throws InterruptedException
	{
		for(int i=0;i<deleteTheTypeOfWorkAdded.size();i++)
		{
			System.out.println(deleteTheTypeOfWorkAdded.get(i).getText());
			Thread.sleep(1000);		
				if(deleteTheTypeOfWorkAdded.get(i).getText().contains("del"))
				{
					Thread.sleep(1000);
					deleteWRTOtypeOfWork.get(i).click();
					alert=driver.switchTo().alert();
					alert.accept();
				}
			}
		}
	
	
	public void typesofworkList()
	{
		for(int i=0;i<typesOfWorkList.size();i++)
		{
			System.out.println(typesOfWorkList.get(i).getText());
			if(typesOfWorkList.get(i).getText().equals("ActitimePOMtesting"))
			{
				typesOfWorkList.get(i).click();
				
			}
		}
	}
	

	public void cancelMethodForPopup()
	{
		alert.dismiss();
	}
	public void acceptMethodForPopup() throws InterruptedException
	{
		Thread.sleep(1000);
		alert=driver.switchTo().alert();
		alert.accept();
	}

}
