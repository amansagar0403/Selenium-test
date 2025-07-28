package com.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextandPartialLink {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hollandandbarrett.com/");
		driver.manage().window().maximize();
		
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		for(int i = 0; i < allLinks.size() ; i++) {
			String str = allLinks.get(i).getText();
			
			String str1 = "Vitamins";
			
			if(str == str1) {
				driver.findElement(By.linkText("Vitamins")).click();
				driver.findElement(By.xpath("(//a[contains(@type,'button')])[4]")).click();
			}
		}
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
		

	}

}
