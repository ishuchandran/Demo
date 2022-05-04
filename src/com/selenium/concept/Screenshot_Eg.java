package com.selenium.concept;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_Eg {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\SeleniumPgm\\Driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.navigate().to("https://www.instagram.com/?hl=en");
	
	TakesScreenshot ts = (TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\User\\Desktop\\JavaPrgm\\ScreenShot\\insta.png");
	FileHandler.copy(src, dest);
	
	
}
}
