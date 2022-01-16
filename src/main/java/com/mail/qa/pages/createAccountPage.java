package com.mail.qa.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mail.qa.base.BaseClass;

public class createAccountPage extends BaseClass {

	@FindBy(name="firstName")
	WebElement fname;
	
	@FindBy(name="lastName")
	WebElement lname;
	
	@FindBy(name="Username")
	WebElement user;
	
	@FindBy(name="Passwd")
	WebElement pass;
	
	@FindBy(name="ConfirmPasswd")
	WebElement confirmPass;
	
	public createAccountPage() {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	public void fillForm(String firstName,String lastName,String username,String passwd,String cpasswd){
		fname.sendKeys(firstName);
		lname.sendKeys(lastName);
		user.sendKeys(username);
		pass.sendKeys(passwd);
		confirmPass.sendKeys(cpasswd);
	}

}
