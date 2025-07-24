package com.seleniumBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCart {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		System.out.println(driver.getTitle());
		System.out.println();
		System.out.println(driver.getPageSource());
		System.out.println();
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
