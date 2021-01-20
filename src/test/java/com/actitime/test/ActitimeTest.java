package com.actitime.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import com.actitime.generics.Basetest;
import com.actitime.pom.ActitimeHome;
import com.actitime.pom.ActitimeLogin;

public class ActitimeTest extends Basetest
{
	@Test
	public void logginin() throws IOException
	{
		ActitimeLogin login=new ActitimeLogin(driver);
		login.loginMethod();
		
		ActitimeHome home=new ActitimeHome(super.driver);		
		home.logoutLinkMethod();

		
	}
	

}
