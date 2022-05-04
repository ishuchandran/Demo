package com.selenium.concept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Ex {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\SeleniumPgm\\Driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Alerts.html");
        
        driver.manage().deleteAllCookies();
		
		WebElement a = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		a.click();
		Alert s =driver.switchTo().alert();
		s.accept();
		
		WebElement a1 = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		a1.click();
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		
		Alert s1= driver.switchTo().alert();
		s1.accept();
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		Alert s2 = driver.switchTo().alert();
		s2.sendKeys("ishu");
		String text = s2.getText();
		System.out.println(text);
		s2.accept();
		
	}
	
}
