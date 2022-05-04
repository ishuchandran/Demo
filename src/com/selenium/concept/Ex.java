package com.selenium.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex {
	public static void main(String[] args) throws Throwable {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\SeleniumPgm\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com/?hl=en");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("dsyztj@gmail.com");
	
	driver.findElement(By.name("password")).sendKeys("gdgf@123");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	}
}
