package com.WebDriver.Navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.selenium.dev/downloads/");
		System.out.print(driver.getTitle());
		driver.quit();
	}
}

