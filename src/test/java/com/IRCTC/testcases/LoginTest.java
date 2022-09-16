package com.IRCTC.testcases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.IRCTC.commons.TestBase;
import com.IRCTC.pages.LoginPage;
import com.IRCTC.utilities.TestUtil;

public class LoginTest extends TestBase{

	LoginPage loginpage;

	private String username;
	private String password;
	String wbsheet = "LoginInfo";

	public LoginTest() throws IOException
	{
		super();
	}
	@Parameters("browser")
	@BeforeMethod()
	public void setup(String browser)throws Exception
	{
		launch(browser);
		loginpage = new LoginPage();
	}	

	@DataProvider
	public Iterator<Object[]> logininfo() {
		ArrayList<Object[]> testData = TestUtil.getDataFromExcel(wbsheet);
		return testData.iterator();
	}

	@Test(dataProvider = "logininfo")
	public void logintest1(String username, String password) throws Exception
	{
		loginpage.Login(username, password);
	}

	@AfterMethod()
	public void TearDown()
	{
		driver.close();
	}
}

