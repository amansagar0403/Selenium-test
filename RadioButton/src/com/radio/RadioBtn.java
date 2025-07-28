package com.radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtn {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/campaign/landing.php");
		
		driver.findElement(By.xpath("//label[normalize-space()='Female']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[normalize-space()='Custom']")).click();
		Thread.sleep(5000);
		
		int radioBtnCount = driver.findElements(By.xpath("//input[@name='sex']")).size();
		System.out.println("Radio button: " + radioBtnCount);
		driver.quit();

	}

}
