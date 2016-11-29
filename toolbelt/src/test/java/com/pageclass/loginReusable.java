package com.pageclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class loginReusable {
	
	@FindBy(how = How.ID , using = "edit-name-1")
	private WebElement userName;
	@FindBy(how = How.ID, using = "edit-pass-1")
	private WebElement passWord;
	@FindBy(how = How.ID, using ="edit-submit-1")
	private WebElement loginButton;
	@FindBy(how = How.LINK_TEXT, using ="Request new password")
	private WebElement requestNewPassword;
	
	WebDriver driver;
//	loadproperties data = new loadproperties();
	public loginReusable (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void login(String uname, String pword) 
	{
		userName.clear();
		userName.sendKeys(uname);
		passWord.clear();
		passWord.sendKeys(pword);
		loginButton.click(); 
	}
	public void logout()
	{
		driver.findElement(By.id("logout")).click();
		driver.findElement(By.xpath(".//*[@id='banner2-nice_menus-1']/div/div[6]/div/ul/li/a")).click();
	}
	public void waitForSometime()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
