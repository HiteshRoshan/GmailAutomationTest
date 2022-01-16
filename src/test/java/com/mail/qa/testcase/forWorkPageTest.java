package com.mail.qa.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mail.qa.base.BaseClass;
import com.mail.qa.pages.forWorkPage;
import com.mail.qa.pages.getStartedPage;
import com.mail.qa.pages.gmailHomePage;


public class forWorkPageTest extends BaseClass {

	gmailHomePage homePage;
	forWorkPage forWork;
	getStartedPage getStarted;
	public forWorkPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setup(){
		initialization();
		homePage=new gmailHomePage();
		forWork=homePage.forWorkBtnClick();
	}
	
	@Test
	public void adminTextTest(){
		String adminConsole=forWork.adminTextDisplay();
		Assert.assertEquals(adminConsole, "Admin console");
	}
	
	@Test
	public void getStartedClickTest(){
		getStarted=forWork.getStartedClick();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
