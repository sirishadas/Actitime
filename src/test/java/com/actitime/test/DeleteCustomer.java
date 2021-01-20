package com.actitime.test;

import org.testng.annotations.Test;
import java.io.IOException;
import com.actitime.generics.Basetest;
import com.actitime.pom.*;

public class DeleteCustomer extends Basetest
{
	@Test
	public void deletecustomer() throws IOException, InterruptedException
	{
		ActitimeLogin login=new ActitimeLogin(super.driver);
		login.loginMethod();
		
		ActitimeHome home=new ActitimeHome(super.driver);
		home.tasksLinkMethod();
		TasksPage tasks=new TasksPage(super.driver);
		
		tasks.serachTextFieldMethod();
		tasks.settingsButtonafterclickingoncustomercreated();

		CustomerSettingsButton customersettings=new CustomerSettingsButton(super.driver);
		customersettings.actionsDropdownButtonMEthod();
		customersettings.deleteButtonfromActionsDropdownMethod();
		customersettings.deletePermanentlyButtonMethod();
		
		home.logoutLinkMethod();
	}

}
