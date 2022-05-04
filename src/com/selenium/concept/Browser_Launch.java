package com.selenium.concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {
	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\SeleniumPgm\\Driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();

    driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	
	String a = driver.getTitle();
	System.out.println(a);
	
	driver.navigate().to("https://www.instagram.com/?hl=en");
	
	driver.navigate().back();
	
	driver.navigate().forward();
	
	String a1 = driver.getCurrentUrl();
	System.out.println(a1);
	
	driver.close();
	
    
    
    
    
    
    
    
    
    
    
    
}
}