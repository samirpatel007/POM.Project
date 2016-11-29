package com.pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class searchreusable extends base{
	
	@FindBy(how = How.ID , using = "tool")
	WebElement filterButton;
	@FindBy(how=How.XPATH, using = ".//*[@id='asset-types']/div/div[2]/div[1]")
	WebElement newsstoryassettype;
	@FindBy(how=How.XPATH, using = ".//*[@id='asset-states']/span[2]")
	WebElement publishstatus;
	@FindBy(how=How.XPATH, using = ".//*[@id='asset-flags']/span[3]")
	WebElement premiumflag;
	@FindBy(how=How.ID, using ="SearchAssets")
	WebElement searchbutton;
	@FindBy(how=How.ID, using = "keyword")
	WebElement searchbox;
	@FindBy(how=How.ID, using = "daterange")
	WebElement datebox;
	@FindBy(how=How.LINK_TEXT, using = "Specific Date")
	WebElement specificdate;
	@FindBy(how=How.XPATH, using = ".//*[@id='results']/ul/li[1]/span[1]/img")
	public WebElement newsstory;
	WebDriver driver;
	
//	public searchreusable(WebDriver driver)
//	{
//		this.driver = driver;
//		PageFactory.initElements(driver, searchreusable.class);
//	}
	public void assetsearchbytype() 
	{ 
		filterButton.click();
		newsstoryassettype.click();
		searchbutton.click();
		}
	public void assetsearchbystatus()
	{
		filterButton.click();
		newsstoryassettype.click();
		publishstatus.click();
		searchbutton.click();
	}
	public void assetsearchbyflag()
	{
		filterButton.click();
		newsstoryassettype.click();
		premiumflag.click();
		searchbutton.click();
	}
	public void assetsearchbykeyword(String keyword)
	{
		filterButton.click();
		newsstoryassettype.click();
		searchbox.clear();
		searchbox.sendKeys(keyword);
		searchbutton.click();
	}
	
}
