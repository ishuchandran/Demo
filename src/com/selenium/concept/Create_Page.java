package com.selenium.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_Page {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Desktop\\SeleniumPgm\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		WebElement a = driver.findElement(By.id("email"));
		a.sendKeys("ishu@gmail.com");

		WebElement a1 = driver.findElement(By.id("pass"));
		a1.sendKeys("ishu123");

		WebElement a2 = driver.findElement(By.name("login"));
		a2.click();

	}

}
