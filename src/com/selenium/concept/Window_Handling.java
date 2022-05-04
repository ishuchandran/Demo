package com.selenium.concept;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handling {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\SeleniumPgm\\Driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.amazon.in/");

	WebElement best = driver.findElement(By.xpath("//a[text()='Best Sellers']"));

	Actions a = new Actions(driver);

	a.contextClick(best).build().perform();

	Robot r = new Robot();

	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);

	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
	
	Actions a1 = new Actions(driver);
	
	a1.contextClick(mobile).build().perform();
	
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);

	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	WebElement service  = driver.findElement(By.xpath("//a[text()='Customer Service']"));
	
	Actions a2 = new Actions(driver);
	
	a2.contextClick(service).build().perform();
	
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);

	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	int Size = driver.getWindowHandles().size();
	System.out.println(Size);
	
	String pw = driver.getWindowHandle();
	System.out.println(pw);
	
	Set<String> ids = driver.getWindowHandles();
	System.out.println(ids);
	
	
	

}
}
