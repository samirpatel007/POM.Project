package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.pageclass.base;
import com.pageclass.loadproperties;
import com.pageclass.searchreusable;


public class loginValidation extends base {
	
//	loadproperties data = new loadproperties();
	
//	WebDriver driver;
	@Test
	public void loginWithValideDetail() 
	{
				
		testone.login(loadproperties.getProperty("uName"), loadproperties.getProperty("pWord"));	
		testone.waitForSometime();
		System.out.println("user:"+driver.findElement(By.xpath(".//*[@id='logout']/span")).getText());
		Assert.assertEquals(driver.findElement(By.xpath(".//*[@id='logout']/span")).getText(),"samir");
		testone.waitForSometime();
		testone.logout();
	}
	@Test
	public void loginWithWrongDetail() 
	{
		
		testone.login(loadproperties.getProperty("uName"), loadproperties.getProperty("pWord"));
		testone.waitForSometime();
//		driver.findElement(By.xpath(".//*[@id='footer']//div[contains(@class,'unlock')]/a")).click();
//		System.out.println(driver.findElement(By.id("edit-name-1[contains(@class, 'form-text required error')]")));
//		System.out.println(driver.findElement(By.className("form-text required error")));
//				id("edit-name-1 and contains(@calss,'form-text required error'")));
		Assert.assertEquals(driver.getTitle(),"Access Denied / User Login | tool - belt");
	}
	@Test
	public void requestForNewPasswrod()
	{
		driver.findElement(By.linkText("Request new password")).click();
		Assert.assertEquals(driver.getTitle(), "User account | tool - belt");
	}
	
	@Test
	public void searchAssetByType() 
	{
		testone.login(loadproperties.getProperty("uName"), loadproperties.getProperty("pWord"));	
		driver.findElement(By.id("tool")).click();
		driver.findElement(By.xpath(".//*[@id='asset-types']/div/div[2]/div[1]")).click();
		testone.waitForSometime();
		driver.findElement(By.id("SearchAssets")).click();
		testone.waitForSometime();
		
		Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='results']/ul/li[1]/span[1]/img")).isDisplayed());
	}
	
	
	
}
