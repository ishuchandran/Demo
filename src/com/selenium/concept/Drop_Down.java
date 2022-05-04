package com.selenium.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\SeleniumPgm\\Driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("firstname")).sendKeys("Jaya");
		Thread.sleep(4000);
		driver.findElement(By.name("lastname")).sendKeys("C");
		Thread.sleep(4000);
		driver.findElement(By.name("reg_email__")).sendKeys("7856123489");
		Thread.sleep(4000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("ishu234");
		
		WebElement day = driver.findElement(By.id("day"));
		Select s1 = new Select(day);
		s1.selectByValue("3");

		WebElement month =driver.findElement(By.id("month"));
		Select s2 = new Select(month);
		s2.selectByVisibleText("Sep");

		WebElement year = driver.findElement(By.id("year"));
		Select s3 = new Select(year);
		s3.selectByValue("1973");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		
		
		
		
	}

}
