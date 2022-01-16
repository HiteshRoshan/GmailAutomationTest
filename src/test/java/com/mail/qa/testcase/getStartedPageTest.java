package com.mail.qa.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mail.qa.base.BaseClass;
import com.mail.qa.pages.forWorkPage;
import com.mail.qa.pages.getStartedPage;
import com.mail.qa.pages.gmailHomePage;

public class getStartedPageTest extends BaseClass {
	
	gmailHomePage homePage;
	forWorkPage forWork;
	getStartedPage getStarted;
	
	public getStartedPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setup(){
		initialization();
		homePage=new gmailHomePage();
		forWork=homePage.forWorkBtnClick();
		getStarted=forWork.getStartedClick();
	}
	
	@Test(priority=2)
	public void fillForm(){
		getStarted.businessName("Tata");
		getStarted.noOfEmployeesRadio();
		getStarted.submitBtnClick();
	}
	
	@Test(priority=1)
	public void regionTextTest(){
		String region=getStarted.regionTextDisplay();
		Assert.assertEquals(region, "India");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
