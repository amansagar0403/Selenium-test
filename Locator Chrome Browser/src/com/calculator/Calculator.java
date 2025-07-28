package com.calculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Calculator {
	WebDriver driver;
	
	@Test
	public void CalculatorDemo() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://www.bing.com/hp?mobref=0&setmkt=en-in&setlang=en-in");
		driver.manage().window().maximize();
		driver.findElement(By.id("sb_form_q")).sendKeys("easy calculation");
		driver.findElement(By.xpath("//input[@id='sb_form_go']")).click();
		driver.findElement(By.xpath("//div[normalize-space()='Easy Calculation']")).click();
		driver.findElement(By.id("googleSearchId")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//button[@class='search_button']")).click();
		driver.findElement(By.xpath("This element is in iframe - //body/div[@id='inner-sbox']/div[@class='gsc-control-cse gsc-control-cse-en']/div[@class='gsc-control-wrapper-cse']/div[@class='gsc-results-wrapper-nooverlay gsc-results-wrapper-visible']/div[@class='gsc-wrapper']/div[@class='gsc-resultsbox-visible']/div[@class='gsc-resultsRoot gsc-tabData gsc-tabdActive']/div[@class='gsc-results gsc-webResult']/div[@class='gsc-expansionArea']/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}
