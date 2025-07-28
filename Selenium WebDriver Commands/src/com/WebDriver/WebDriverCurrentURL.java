package com.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCurrentURL {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		System.out.print(driver.getCurrentUrl());
		driver.quit();
	}

}
