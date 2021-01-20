package com.actitime.generics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basepage 
{
	public void selectbyvisibletext(WebElement element, String text)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	
	public void selectbyvalue(WebElement element, String value)
	{
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	
	public void selectbyindex(WebElement element, int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	
	public void movetoelement(WebDriver driver, WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	public void robotenter() throws AWTException
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void acceptalert(WebDriver driver)
	{
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
	}
	
	public void dismissalert(WebDriver driver)
	{
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.dismiss();
	}
	
	 public void explicitwait(WebDriver driver, int time,String expression)
	    {
	    	WebDriverWait wait=new WebDriverWait(driver,time);
	    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(expression)));
	    	
	    }
	    
	    public void jsexecutor(WebDriver driver,WebElement ele)
	    {
	    	JavascriptExecutor js=(JavascriptExecutor)driver;
	    	js.executeScript("arguments[0].click()", ele);
	    }


}
