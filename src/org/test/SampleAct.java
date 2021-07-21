package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SampleAct {

	public static void main(String[] args) throws AWTException   {
     System.setProperty("webdriver.chrome.driver","C:\\Users\\Venkatesh\\Documents\\Selenium Browser Drivers\\chromedriver.exe");
     
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.google.com/");
     driver.manage().window().maximize();
     WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
     Actions a= new Actions(driver);
     a.contextClick(gmail).perform();
     Robot r=new Robot();
     for (int i = 0; i < 6; i++) {
    	 r.keyPress(KeyEvent.VK_DOWN);
         r.keyRelease(KeyEvent.VK_DOWN);
         }
    
     r.keyPress(KeyEvent.VK_ENTER);
     r.keyRelease(KeyEvent.VK_ENTER);
    
}
}


