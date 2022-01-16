package com.mail.qa.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mail.qa.base.BaseClass;
import com.mail.qa.pages.createAccountPage;
import com.mail.qa.pages.gmailHomePage;
import com.mail.qa.util.TestUtil;

public class createAccountPageTest extends BaseClass{

	gmailHomePage homePage;
	createAccountPage createAccount;
	String sheetName="AccountDetails";
	TestUtil testUtil;
	public createAccountPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setup(){
		initialization();
		testUtil=new TestUtil();
		homePage=new gmailHomePage();
		createAccount=homePage.createAccountBtnClick();
	}
	
	@DataProvider
	public Object[][] getAccountTestData(){
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	@Test(dataProvider="getAccountTestData")
	public void fillFormTest(String first,String last,String username,String password,String confirmPass){
		createAccount.fillForm(first,last,username,username,confirmPass);
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
