package com.pageclass;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class base {
	
	public loginReusable testone;
	public searchreusable objsearch;
	public WebDriver driver;
//    loadproperties data = new loadproperties();
	
	@BeforeSuite
	public void load(){
     new loadproperties();
	}
    
	@BeforeMethod(alwaysRun=true)
	public void setup () throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", loadproperties.getProperty("chromepath"));
		driver = new ChromeDriver();
		driver.get(loadproperties.getProperty("url"));
		driver.manage().window().maximize();
		testone=PageFactory.initElements(driver,loginReusable.class);
		objsearch=PageFactory.initElements(driver, searchreusable.class);
		System.out.println("driver started!!");
	}
	
	@AfterMethod(alwaysRun=true)
	public void after(){
		
		driver.close();
		driver.quit();
		System.out.println("driver closed !!!");
	}
	

}
