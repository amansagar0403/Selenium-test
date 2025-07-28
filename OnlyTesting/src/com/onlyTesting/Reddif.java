package com.onlyTesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reddif {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//button[@name='proceed']")).click();
		Alert alert = driver.switchTo().alert();

		
		String text = alert.getText();
		
		if(text.equals("Please enter a valid user name")) {
			System.out.println("correct error message");
		}else {
			System.out.print("in-correct message");
		}
		alert.accept();

	}

}
