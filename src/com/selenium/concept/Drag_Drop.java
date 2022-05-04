package com.selenium.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\SeleniumPgm\\Driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
	driver.get("http://leafground.com/pages/drop.html");
	
	WebElement drag =driver.findElement(By.id("draggable"));
	drag.click();
	WebElement drop =driver.findElement(By.id("droppable"));
	drop.click();

	Actions act = new Actions(driver);
	act.clickAndHold(drag).moveToElement(drop).release().build().perform();
    
	
}
}
