package com.onlyTesting;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class OnlyTesting {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://only-testing-blog.blogspot.com/2014/05/form.html");
		driver.findElement(By.name("FirstName")).sendKeys("Aman");
		driver.findElement(By.name("LastName")).sendKeys("Sagar");
		driver.findElement(By.name("EmailID")).sendKeys("amansagar@gmail.com");
		driver.findElement(By.name("MobNo")).sendKeys("9384958282");
		driver.findElement(By.name("Company")).sendKeys("Oracle");
		
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		String result = driver.findElement(By.xpath("//*[@id=\"header-inner\"]/div[1]/h1/a")).getText();
		System.out.print(result);
		Assert.assertEquals("Only Testing", result);

	}

}