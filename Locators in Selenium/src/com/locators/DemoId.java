package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoId {
	WebDriver driver;
	
	@Test
	public void DemoTestId() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://auth.hollandandbarrett.com/u/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("amansagar0403@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Papa4112003");
		driver.findElement(By.xpath("//button[@name='action']")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}
