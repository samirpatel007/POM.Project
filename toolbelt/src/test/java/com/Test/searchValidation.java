package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.pageclass.base;
import com.pageclass.loadproperties;
import com.pageclass.searchreusable;

import junit.framework.Assert;

public class searchValidation extends base{
	
//	loadproperties data = new loadproperties();
	WebDriver driver;
	
//	searchreusable objsearch = new searchreusable(driver);
	
	@Test
	public void searchassetbytype() 
	{
		testone.login(loadproperties.getProperty("uName"), loadproperties.getProperty("pWord"));
		objsearch.assetsearchbytype();
		testone.waitForSometime();
		Assert.assertTrue(objsearch.newsstory.isDisplayed());
		testone.logout();
		
//		System.out.println("DDDDDDDDDD ===="+driver.findElement(By.xpath(".//*[@id='results']/ul/li[1]/span[1]/img")));
//		Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='results']/ul/li[1]/span[1]/img")).isDisplayed());
//		testone.waitForSometime();
	}

	@Test
	public void searchassetbyflag()
	{
		testone.login(loadproperties.getProperty("uName"), loadproperties.getProperty("pWord"));
		objsearch.assetsearchbyflag();
		testone.waitForSometime();
		Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='results']/ul/li[1]")).isDisplayed());
		testone.logout();
		
		
	}
	@Test
	public void searchassetbykeyword()
	{
		testone.login(loadproperties.getProperty("uName"), loadproperties.getProperty("pWord"));
		objsearch.assetsearchbykeyword("slack notification test");
		Assert.assertEquals(driver.findElement(By.xpath(".//*[@id='results']/ul/li/span[1]/span")).getText(), "slack notification test");
		testone.logout();
	}
	@Test
	public void searchassetbystatus()
	{
		testone.login(loadproperties.getProperty("uName"), loadproperties.getProperty("pWord"));
		objsearch.assetsearchbystatus();
		testone.waitForSometime();
		Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='results']/ul/li/img")).isDisplayed());
		testone.logout();
	}
//	@Test
//	public void searchassetbydate()
//	{
//		testone.login(data.getUsername(), data.getPassword());
//		
//		//click on search button and verify
//		
//	}
}
