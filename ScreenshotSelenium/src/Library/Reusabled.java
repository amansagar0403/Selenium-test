package Library;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test; 

public class Reusabled {
	@Test
	public void Browser() throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://auth.hollandandbarrett.com/u/login");
		driver.manage().window().maximize();
	
		Reusability.captureScreenshot(driver, "A. Launch Application - TakeScreenShot");
		
		driver.findElement(By.id("username")).sendKeys("amansagar0403@gmail.com");		
		driver.findElement(By.name("password")).sendKeys("aman@123");		
        Thread.sleep(5000);		
		driver.findElement(By.xpath("//button[@name='action']")).click();	
		
		Reusability.captureScreenshot(driver, "B. Click Sign In Button - TakeScreenShot");	
		driver.quit();
}}
