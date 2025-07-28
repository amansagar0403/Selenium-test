package com.radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EaseMyTrip {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		
		driver.findElement(By.xpath("//*[@id=\"divFamilyFare\"]/ul/li[2]/label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"divFamilyFare\"]/ul/li[3]/label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"divFamilyFare\"]/ul/li[4]/label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"divFamilyFare\"]/ul/li[5]/label")).click();
		Thread.sleep(2000);
		int radioButton = driver.findElements(By.xpath("//*[@id=\"divFamilyFare\"]/div[1]")).size();
		System.out.println("Radio button: " + radioButton);
		driver.quit();

	}

}
