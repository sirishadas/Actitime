package com.actitime.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;
import com.actitime.generics.Basetest;
import com.actitime.pom.*;

public class CreateCustomerTest extends Basetest 
{
	@Test
	public void createCustomer() throws IOException, InterruptedException
	{
		ActitimeLogin login=new ActitimeLogin(super.driver);
		login.loginMethod();
		
		ActitimeHome home=new ActitimeHome(super.driver);
		home.tasksLinkMethod();
		TasksPage tasks=new TasksPage(super.driver);
		tasks.addnewMethod();
		tasks.newcustomerMethod();
		
		CreateNewCustomerPage newcustomer=new CreateNewCustomerPage(super.driver);
		newcustomer.enternewcustomerMethod();
		newcustomer.createbuttonMethod();
		
		home.logoutLinkMethod();
	}

}
