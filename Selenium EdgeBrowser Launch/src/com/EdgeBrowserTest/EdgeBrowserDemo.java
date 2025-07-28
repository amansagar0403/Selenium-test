package com.EdgeBrowserTest;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\amansag\\eclipse-workspace\\Selenium EdgeBrowser Launch\\EdgeBrowserJars\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().window().minimize();
		
	}

}
