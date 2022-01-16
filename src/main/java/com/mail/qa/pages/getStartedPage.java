package com.mail.qa.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mail.qa.base.BaseClass;

public class getStartedPage extends BaseClass{

	@FindBy(xpath="//input[@type='text']")
	WebElement BusinessName;
	
	@FindBy(xpath="//input[@value='10-99']")
	WebElement noOfEmployees;
	
	@FindBy(xpath="//span[contains(text(),'India')]")
	WebElement RegionText;
	
	@FindBy(xpath="//div[contains(text(),'Next')]")
	WebElement NextBtn;
	
	
	public getStartedPage() {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	public void businessName(String bussname){
		BusinessName.sendKeys(bussname);
	}
	
	public void noOfEmployeesRadio(){
		noOfEmployees.click();
	}
	
	public String regionTextDisplay(){
		return RegionText.getText();
	}
	
	public void submitBtnClick(){
		NextBtn.click();
	}

}
