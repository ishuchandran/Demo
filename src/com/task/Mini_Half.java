package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Half {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Desktop\\SeleniumPgm\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");

		Thread.sleep(2000);

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("ishu2chandran@gmail.com");

		WebElement pswrd = driver.findElement(By.id("passwd"));
		pswrd.sendKeys("Ishu@123");

		WebElement signin = driver.findElement(By.id("SubmitLogin"));
		signin.click();

		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		women.click();

		WebElement sort = driver.findElement(By.id("selectProductSort"));
		Select s = new Select(sort);
		s.selectByVisibleText("Price: Lowest first");

		WebElement stack = driver.findElement(By.xpath("//img[@alt='Faded Short Sleeve T-shirts']"));
		stack.click();
		driver.findElement(By.xpath("//span[text()='Add to cart']")).click();

		driver.findElement(By.xpath("//a[@title='View my shopping cart']")).click();

		driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();

		driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();

		driver.findElement(By.xpath("//button[@name='processCarrier']")).click();

		driver.findElement(By.xpath("//a[@class='bankwire']")).click();

		driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")).click();

	}

}
