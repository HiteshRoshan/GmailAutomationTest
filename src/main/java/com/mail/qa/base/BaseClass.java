package com.mail.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.mail.qa.util.WebEventListener;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
	public BaseClass(){
		prop=new Properties();
		FileInputStream inp;
		try {
			inp = new FileInputStream("E:\\Java Code\\POM_Gmail\\src\\main\\java\\com\\mail\\qa\\config\\config.properties");
			prop.load(inp);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void initialization(){
		if(prop.getProperty("browser").equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium Java\\chromedriver-new.exe");
			driver=new ChromeDriver();
			
		}
		else if(prop.getProperty("browser").equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "E:\\Selenium Java\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		
		e_driver=new EventFiringWebDriver(driver);
		eventListener=new WebEventListener();
		e_driver.register(eventListener);
		driver=e_driver;
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	
	}
}
