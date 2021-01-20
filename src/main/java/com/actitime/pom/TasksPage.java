package com.actitime.pom;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.actitime.generics.*;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class TasksPage extends Basepage implements AutoConstant
{
	
	WebDriver driver;	

	@FindBy(xpath="//div[.='Add New']")
	private WebElement addnewLink;
	
	@FindBy(xpath="(//input[@placeholder='Start typing name ...'])[1]")
	private WebElement searchTextfield;
	
	@FindBy(xpath="(//div[@class='collapseAllButton'])[1]")
	private WebElement collapseallButton;
	
    @FindBy(xpath="(//span[.='Customer'])[1]")
    private WebElement customerButtonforAllcustomersandprojects;
    
    @FindBy(xpath="//span[.='All projects of all customers (active and archived)']")
    private WebElement allprojectofallcustomersDropdown;
    
    @FindBy(xpath="(//div[@class='searchField'])[2]")
    private WebElement serachTextfieldforAllcustomers;
    
    @FindBy(xpath="//div[.='Export list to CSV']")
    private WebElement exportlisttocsvLink;
    
    @FindBy(xpath="//div[.='Configure columns']")
    private WebElement configurecloumnsButton;
    
    @FindBy(xpath="//div[@class='modeButton table active']")
    private WebElement viewlistmodeButton;
    
    @FindBy(xpath="//div[@class='modeButton kanban']")
    private WebElement viewiconmodeButton;
    
    @FindBy(xpath="(//div[contains(@class,'img')])[1]")
    private WebElement checkboxforAllcustomers;
    
    @FindBy(xpath="(//span[.='Customer'])[2]")
    private WebElement customerButtonforAllcustomers;
    
    @FindBy(xpath="//span[text()='Project']")
    private WebElement projectButtonforAllcustomers;
    
    @FindBy(xpath="//span[.='Task']")
    private WebElement taskButtonforAllcustomers;
    
    @FindBy(xpath="(//span[.='Status'])[1]")
    private WebElement statusButtonforAllcustomers;
    
    @FindBy(xpath="(//div[@class='label ellipsis'])[2]")
    private WebElement allDropdown;
    
    @FindBy(xpath="//div[.='All statuses']")
    private WebElement allstatusesRadiobuttonofAllDropdown;
    
    @FindBy(xpath="//div[.='Selected statuses:']")
    private WebElement selectedstatusesRadiobuttonfromAllDropdown;
    
    @FindBy(xpath="(//span[@class='checkmark '])[1]")
    private WebElement opentasksCheckboxfromSelectedStatuses;
    
    @FindBy(xpath="(//span[@class='checkmark workflowStatusNode_checkmark'])[1]")
    private WebElement newCheckboxfromOpentasks;
    
    @FindBy(xpath="(//span[@class='checkmark workflowStatusNode_checkmark'])[2]")
    private WebElement planningCheckboxfromOpentasks;
    
    @FindBy(xpath="(//span[@class='checkmark workflowStatusNode_checkmark'])[3]")
    private WebElement inprogressCheckboxfromOpentasks;
    
    @FindBy(xpath="(//span[@class='checkmark workflowStatusNode_checkmark'])[4]")
    private WebElement reviewCheckbocfromOpentasks;
    
    @FindBy(xpath="(//span[@class='checkmark '])[2]")
    private WebElement completedtasksCheckboxforselectedStatuses;
    
    @FindBy(xpath="(//span[@class='checkmark workflowStatusNode_checkmark'])[5]")
    private WebElement doneCheckboxofCompletedtasks;
    
    @FindBy(xpath="(//span[@class='checkmark workflowStatusNode_checkmark'])[6]")
    private WebElement wontdocheckboxofCompletedtasks;
    
    @FindBy(xpath="//div[@class='apply components_button']")
    private WebElement applyButtonforAllDropdown;
    
    @FindBy(xpath="//div[@class='cancel components_button']")
    private WebElement cancelButtonforAllDropdown;
    
    @FindBy(xpath="//span[.='Spent Time']")
    private WebElement spenttimeButton;
    
    @FindBy(xpath="(//span[.='Estimate'])[1]")
    private WebElement estimateButton;
    
    @FindBy(xpath="(//span[.='Deadline'])[1]")
    private WebElement deadlineButton;
    
    @FindBy(xpath="//div[.='+ New Customer']")
    private WebElement newcustomerLink;
    
    @FindBy(xpath="//div[.='+ New Project']")
    private WebElement newprojectLink;
    
    @FindBy(xpath="//div[.='+ New Tasks']")
    private WebElement newtasksLink;
    
    @FindBy(xpath="//div[.='Import Tasks from CSV']")
    private WebElement importtasksfromCSVLink;
    
    @FindBy(xpath="//label[@id='ext-gen68']")
    private WebElement allprojectofallcustomersRadioButton;
    
    @FindBy(xpath="//label[@id='ext-gen83']")
    private WebElement allactiveprojectsofallcustomersRadioButton;
    
    @FindBy(xpath="//label[@id='ext-gen98']")
    private WebElement selectedcustomersandprojectsRadioButton;
    
    @FindBy(xpath="//span[.='reset filter']")
    private WebElement resetfilterButton;
    
    @FindBy(xpath="//span[@id='ext-gen158']")
    private WebElement closeButtonforAllprojectsofallcustomers;
    
    @FindBy(xpath="(//div[@class='itemsContainer'])[1]//div[contains(@class,'customerNode')]")
    private List<WebElement> customersListInTasksLink;
    @FindBy(xpath="(//div[@class='itemsContainer'])[1]//div[contains(@class,'customerNode')]//div[@class='editButton']")
    private List<WebElement> settingsForCustomersListInTasksLink;
    @FindBy(xpath="(//div[@class='itemsContainer'])[1]//div[contains(@class,'projectNode')]")
    private List<WebElement> ListForProjects;
    
    @FindBy(xpath="//div[@class='titleEditButtonContainer']//div[@class='editButton']")
    private WebElement settingsButtonAfterClickingOnCustomerCreated;
    
    @FindBy(xpath="//span[@class='highlightToken']")
    private List<WebElement> highlightedCustomerNames;

    
    public TasksPage(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    
    public void addnewMethod()
    {
    	   //addnewLink.click();
    	JavascriptExecutor js=(JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click()", addnewLink);	

    }
    
    public void newcustomerMethod()
    {
    	   newcustomerLink.click();
    }
    
    public void newprojectMethod()
    {
    	  newprojectLink.click();
    }
    
    public void newtasksMethod()
    {
    	newtasksLink.click();
    }
    
    public void importtasksfromCRVmethod()
    {
    	importtasksfromCSVLink.click();
    }
    
    public void allprojectsofallcustomersdropdownMethod()
    {
    	allprojectofallcustomersDropdown.click();
    }
    
    public void allprojectsofallcustomersradiobuttonMethod()
    {
    	allprojectofallcustomersRadioButton.click();
    }
    
    public void allactiveprojectsofallcustomersradiobuttonMethod()
    {
    	allactiveprojectsofallcustomersRadioButton.click();
    }
    
    public void selectedcustomersandprojectsradiobuttonMethod()
    {
    	selectedcustomersandprojectsRadioButton.click();
    }
    
    public void resetfilterMethod()
    {
    	resetfilterButton.click();
    }
    
    public void closebuttonforallprojectsofallcustomersMethod()
    {
    	closeButtonforAllprojectsofallcustomers.click();
    }
    
    
    public void customersListInTasksLinkMEthod() throws InterruptedException, IOException
        {
    	for(int i=0; i<customersListInTasksLink.size(); i++)
    	{
    		 WebDriverWait wait=new WebDriverWait(driver, 30);
    		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));    		
    	     WebElement webElement = customersListInTasksLink.get(i);
    	     Thread.sleep(2000);
			 System.out.println(webElement.getText());
			 if(webElement.getText().equals(ExcelLibrary.getcellvalue(excel_sheet1, 1, 0)))
			 {
				Thread.sleep(2000);
				settingsForCustomersListInTasksLink.get(i).click();
			 }
        }
        }
    
    public void serachTextFieldMethod() throws InterruptedException, IOException
    {
    	searchTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_sheet1, 1, 0));
        
    	explicitwait(driver, 30, "//a[@class='logout']");
    	
       // Thread.sleep(1000);
        
    	int actualsize=highlightedCustomerNames.size();
    	System.out.println(actualsize + "is the customers list");
    	int expectedsize=1;
    	for(int i=0;i<highlightedCustomerNames.size();i++)
    	{ 	
    		System.out.println(highlightedCustomerNames.get(i).getText());
    	if(actualsize==expectedsize)
    	{
    		System.out.println("duplicates are not allowed");
    	}
    	else
    	{
    		System.out.println("duplicates are allowed");
    	}
         	
    	highlightedCustomerNames.get(i).click();
       }
    	
    }
    
    public void settingsButtonafterclickingoncustomercreated()
    {
    	jsexecutor(driver, settingsButtonAfterClickingOnCustomerCreated);
    }
    
   
}
