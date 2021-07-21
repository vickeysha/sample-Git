package org.test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Samplewin {

	public static void main(String[] args)    {
     System.setProperty("webdriver.chrome.driver","C:\\Users\\Venkatesh\\Documents\\Selenium Browser Drivers\\chromedriver.exe");
     
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.flipkart.com/");
     driver.manage().window().maximize();
   
     WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
     close.click();
     
     WebElement search = driver.findElement(By.name("q"));
     search.sendKeys("iphone",Keys.ENTER);
     
     WebElement product = driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (Black, 64 GB)']"));
     product.click();
     
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

     
     String par = driver.getWindowHandle();
     System.out.println(par);
     Set<String> all = driver.getWindowHandles();
     System.out.println(all);
     
     for (String x : all) {
    	 if (!par.equals(x)) 
    	 {
			driver.switchTo().window(x);
		}
    	 
    	 
     }
	}
}
    	 
		


