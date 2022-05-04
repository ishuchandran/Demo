package com.selenium.concept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Eg {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\SeleniumPgm\\Driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://letcode.in/dropdowns");
	
  		WebElement drop = driver.findElement(By.id("superheros"));
  		drop.click();
  		Select s = new Select(drop);
  	    boolean mul = s.isMultiple();
  		System.out.println(mul);
  		List<WebElement>sp = s.getOptions();
  		for(WebElement print:sp) {
  			System.out.println(print.getText());
  				}
  		
  		int size = sp.size();
  				System.out.println(size);
  				
  	
  		for(int i=0;i<=size;i++) {
  			if(i==1||i==5) {
  				s.selectByIndex(i);
  				
  			}
  		}
  				
  	List<WebElement> gt = s.getAllSelectedOptions()	;
  		for(WebElement we:gt) {
  			System.out.println(we.getText());
  		}
  		
  		WebElement frst = s.getFirstSelectedOption();
  		
  		String text = frst.getText();
  				System.out.println(text);
  				
  			}
  			
  			

}
