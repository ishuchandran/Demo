package com.selenium.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Selector {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Desktop\\SeleniumPgm\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("#email")).sendKeys("idh122@email.com");
		
		
		driver.findElement(By.cssSelector(".inputtext _55r1 _6luy _9npi")).sendKeys("ishu@123");
		
		driver.findElement(By.cssSelector("type = submit")).click();
	}

}
