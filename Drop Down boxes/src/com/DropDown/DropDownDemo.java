package com.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?");
		driver.manage().window().maximize();
		
		WebElement month_Dropdown = driver.findElement(By.id("month"));
		Select month_dd = new Select(month_Dropdown);
		
		List<WebElement> month_list = month_dd.getOptions();
		System.out.println(month_list.size());
		
		for(WebElement ele : month_list) {
			String month_name = ele.getText();
			System.out.println(month_name);
		}
				
		month_dd.selectByIndex(9);
		Thread.sleep(5000);
		
		month_dd.selectByValue("9");
		Thread.sleep(5000);
		
		month_dd.selectByVisibleText("Dec");
		Thread.sleep(5000);
		
		driver.quit();

	}

}
