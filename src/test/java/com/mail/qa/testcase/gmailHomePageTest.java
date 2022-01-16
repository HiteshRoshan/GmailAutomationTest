package com.mail.qa.testcase;





import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mail.qa.base.BaseClass;
import com.mail.qa.pages.SignInPage;
import com.mail.qa.pages.createAccountPage;
import com.mail.qa.pages.forWorkPage;
import com.mail.qa.pages.gmailHomePage;



public class gmailHomePageTest extends BaseClass{

	
	gmailHomePage homePage;
	forWorkPage forWork;
	SignInPage signIn;
	createAccountPage createAccount;
	public gmailHomePageTest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setup(){
		initialization();
		homePage=new gmailHomePage();
	}
	
	@Test
	public void featureTitleTextTest(){
		String feature=homePage.featureTextDisplay();
		Assert.assertEquals(feature, "Secure, smart, and easy to use email");
	}
	
	@Test
	public void forWorkBtnClickTest(){
		forWork=homePage.forWorkBtnClick();
	}
	
	@Test
	public void signInBtnClickTest(){
		signIn=homePage.signInBtnClick();
	}
	
	@Test
	public void createAccountBtnClick(){
		createAccount=homePage.createAccountBtnClick();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
