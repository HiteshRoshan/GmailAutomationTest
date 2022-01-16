package com.mail.qa.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mail.qa.base.BaseClass;

public class gmailHomePage extends BaseClass {

	
	@FindBy(linkText="For work")
	WebElement forWorkBtn;
	
	@FindBy(linkText="Sign in")
	WebElement signInBtn;
	
	@FindBy(xpath="//a[@data-action='create an account']")
	WebElement createAccountBtn;
	
	@FindBy(xpath="//div[@class='feature__chapter__title ']")
	WebElement featureTitleText;
	
	public gmailHomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public String featureTextDisplay(){
		return featureTitleText.getText();
	}
	
	public forWorkPage forWorkBtnClick(){
		forWorkBtn.click();
		
		return new forWorkPage();
	}
	
	public SignInPage signInBtnClick(){
		signInBtn.click();
		
		return new SignInPage();
	}
	
	public createAccountPage createAccountBtnClick(){
		createAccountBtn.click();
		
		return new createAccountPage();
	}

}
