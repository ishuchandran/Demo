package com.selenium.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_eg {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\SeleniumPgm\\Driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scroll(0,2000)","");
		Thread.sleep(4000);
		js.executeScript("window.scroll(0,-2000)","");
		
		//to scroll down untill canada
		
		WebElement button = driver.findElement(By.xpath("//a[text()='China']"));
		button.click();
		JavascriptExecutor amaz = (JavascriptExecutor)driver;
		amaz.executeScript("argument[0].scrollIntoView(true)",button);
		amaz.executeScript("arguments[0].click()",button);
		amaz.executeScript("location.reload();");
	}

}
