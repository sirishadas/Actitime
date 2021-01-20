package com.actitime.pom;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.actitime.generics.*;

public class CreateNewCustomerPage extends ExcelLibrary

{	
	WebDriver driver;

		@FindBy(xpath="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
		private WebElement entercustomernameTextfieldforCreatenewcustomerPage;
		
		@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
		private WebElement descriptionTextfield;
		
		@FindBy(xpath="//div[.='Create Customer']")
		private WebElement createCustomerButtonforCreatenewcustomerpage;
		
		@FindBy(xpath="//div[@class='greyButton cancelBtn']")
		private WebElement cancelButtonforCreatenewcustomerpage;
		
		@FindBy(xpath="//div[@class='nameDuplicateError inlineErrorMessage leftInlineErrorMessage']")
		private WebElement errorMessage;
	
public CreateNewCustomerPage(WebDriver driver)		
{
	this.driver=driver;
	PageFactory.initElements(driver, this);

}
		
public void enternewcustomerMethod() throws InterruptedException, IOException
{
	Thread.sleep(200);
	entercustomernameTextfieldforCreatenewcustomerPage.sendKeys(ExcelLibrary.getcellvalue(excel_sheet1, 1, 0));
}

public void cancelButtonforCreatenewcustomerpageMethod()
{
	cancelButtonforCreatenewcustomerpage.click();	
}

//public void alertMethod()
//{
//	alt=driver.switchTo().alert();
//	alt.accept();
//}
	
public void createbuttonMethod() throws InterruptedException
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()", createCustomerButtonforCreatenewcustomerpage);
   
	Thread.sleep(3000);
	String actual= errorMessage.getText();
	System.out.println("error message is " +actual);
	
	String desired="Customer with the specified name already exists";
	//driver.navigate().refresh();
	if(actual.equalsIgnoreCase(desired))
	{
		System.out.println("error message displayed is correct");	
		cancelButtonforCreatenewcustomerpage.click();
         Thread.sleep(200);
		 Alert alt=driver.switchTo().alert();
		alt.accept();
	}
	else
	{
		System.out.println("error message displayed is not correct");

	}
	
}
}
