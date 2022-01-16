package com.mail.qa.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mail.qa.base.BaseClass;

public class forWorkPage extends BaseClass {

	@FindBy(linkText="Admin console")
	WebElement adminText;
	
	@FindBy(linkText="Get started")
	WebElement getStartedLink;
	
	public forWorkPage() {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	public String adminTextDisplay(){
		return adminText.getText();
	}
	
	public getStartedPage getStartedClick(){
		getStartedLink.click();
		
		return new getStartedPage();
	}

}
