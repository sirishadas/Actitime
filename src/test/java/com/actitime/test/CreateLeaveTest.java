package com.actitime.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import com.actitime.generics.Basetest;
import com.actitime.pom.*;

public class CreateLeaveTest extends Basetest
{
	@Test
	public void createLeave() throws InterruptedException, IOException
	{
		ActitimeLogin login=new ActitimeLogin(super.driver);
		login.loginMethod();
		
		ActitimeHome home=new ActitimeHome(super.driver);
	       home.tasksLinkMethod();
	       home.settingsLinkMethod();
	       
	       SettingsActitime settingsOfHomePage=new SettingsActitime(super.driver);
	       settingsOfHomePage.leavetypesMethod();
	       
	       LeaveTypesLinkOpened leaveTypes=new LeaveTypesLinkOpened(super.driver);
	       leaveTypes.CreateLeaveTypeLinkMethod();
	       
	       CreateLeaveTypePage createLeaveType=new CreateLeaveTypePage(super.driver);
	       createLeaveType.LeaveTypeNameMethod();
	       createLeaveType.CreateLeaveTypeButtonMethod();
	       
			home.logoutLinkMethod();

	}
	
}
