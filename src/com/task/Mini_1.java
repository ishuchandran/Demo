package com.task;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Mini_1 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\SeleniumPgm\\Driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
driver.get("https://adactinhotelapp.com/index.php");
		
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("ishu12345");
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("Ishu@123");
		
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
	    s.selectByVisibleText("London");
	    
	    WebElement Hotel = driver.findElement(By.id("hotels"));
	    Select s1 = new Select(Hotel);
	    s1.selectByVisibleText("Hotel Sunshine");
	    
	    WebElement Room = driver.findElement(By.id("room_type"));
	    Select s2 = new Select(Room);
	    s2.selectByVisibleText("Deluxe");
	    
	    WebElement RoomNos = driver.findElement(By.id("room_nos"));
	    Select s3 = new Select(RoomNos);
	    s3.selectByIndex(2);
	    
	    WebElement CheckIn = driver.findElement(By.id("datepick_in"));
	    CheckIn.sendKeys("04/02/2022");
	    
	    WebElement CheckOut = driver.findElement(By.id("datepick_out"));
	    CheckOut.sendKeys("05/02/2022");
	    
	    WebElement Adult = driver.findElement(By.id("adult_room"));
	    Select s4 = new Select(Adult);
	    s4.selectByIndex(2);
	    
	    WebElement Child = driver.findElement(By.id("child_room"));
	    Select s5 = new Select(Child);
	    s5.selectByIndex(0);
	    
	    WebElement search = driver.findElement(By.id("Submit"));
	    search.click();
	    
	    WebElement button = driver.findElement(By.xpath("//input[@type='radio']"));
	    button.click();
		
	    WebElement Continue = driver.findElement(By.xpath("//input[@type='submit']"));
	    Continue.click();
		
	    WebElement Firstname = driver.findElement(By.id("first_name"));
	    Firstname.sendKeys("Iswarya");
		
	    WebElement Lastname = driver.findElement(By.id("last_name"));
	    Lastname.sendKeys("C");
	    
	    WebElement Address = driver.findElement(By.id("address"));
	    Address.sendKeys("Chennai");
	    
	    WebElement CardNo = driver.findElement(By.id("cc_num"));
	    CardNo.sendKeys("7856423589715632");
	    
	    WebElement CardType = driver.findElement(By.xpath("//select[@class='select_combobox']"));
	    Select s6 = new Select(CardType);
	    s6.selectByVisibleText("VISA");
	    
	    WebElement ExpiryMonth = driver.findElement(By.id("cc_exp_month"));
	    Select s7 = new Select(ExpiryMonth);
	    s7.selectByVisibleText("May");
	    
	    WebElement ExpiryYear= driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
	    Select s8 = new Select(ExpiryYear);
	    s8.selectByValue("2021");
	    
	    WebElement Cvv = driver.findElement(By.id("cc_cvv"));
	    Cvv.sendKeys("145");
	    
	    WebElement Book = driver.findElement(By.id("book_now"));
	    Book.click();
	    
	    WebElement Logout = driver.findElement(By.xpath("//a[text()='Logout']"));
	    Logout.click();
	    
	    TakesScreenshot ts = (TakesScreenshot)driver;
	    File src = ts.getScreenshotAs(OutputType.FILE);
	    File dest = new File("C:\\Users\\User\\Desktop\\JavaPrgm\\ScreenShot\\mini.png");
		FileHandler.copy(src, dest);
		

	}

}
