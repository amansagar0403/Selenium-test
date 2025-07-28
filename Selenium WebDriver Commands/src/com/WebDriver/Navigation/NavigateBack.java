package com.WebDriver.Navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBack {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.selenium.dev/downloads/");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().to("https://www.google.com/maps");
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}
}

