package com.seleniumBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bing {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.bing.com");
		System.out.println(driver.getTitle());
		System.out.println();
		System.out.println(driver.getPageSource());
		System.out.println();
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
