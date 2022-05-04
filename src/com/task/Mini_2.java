package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\SeleniumPgm\\Driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
	
	Thread.sleep(2000);
	WebElement email = driver.findElement(By.id("email_create"));
	email.sendKeys("ishu2chandran@gmail.com");
	Thread.sleep(2000);
	WebElement create = driver.findElement(By.id("SubmitCreate"));
	create.click();
	Thread.sleep(2000);
	WebElement title = driver.findElement(By.xpath("//label[@for='id_gender2']"));
	title.click();
	Thread.sleep(2000);
	WebElement firstname = driver.findElement(By.id("customer_firstname"));
	firstname.sendKeys("Ishu");
	
	WebElement lastname = driver.findElement(By.id("customer_lastname"));
	lastname.sendKeys("C");
	
	WebElement pswrd = driver.findElement(By.id("passwd"));
	pswrd.sendKeys("Ishu@123");
	
	WebElement first = driver.findElement(By.id("firstname"));
	first.sendKeys("Ishu");
	
	WebElement last = driver.findElement(By.id("lastname"));
	last.sendKeys("C");
	
	WebElement address = driver.findElement(By.id("address1"));
	address.sendKeys("1st Street");
	
	WebElement city= driver.findElement(By.id("city"));
	city.sendKeys("chennai");
	
	WebElement state= driver.findElement(By.id("id_state"));
	Select s = new Select(state);
	s.selectByVisibleText("Indiana");
	
	WebElement pincode= driver.findElement(By.id("postcode"));
	pincode.sendKeys("00000");
	
	WebElement number= driver.findElement(By.id("phone_mobile"));
	number.sendKeys("7856931523");
	
	WebElement add= driver.findElement(By.id("alias"));
	add.sendKeys("vellore");
	
	WebElement register = driver.findElement(By.id("submitAccount"));
	register.click();
	
	

}
}
