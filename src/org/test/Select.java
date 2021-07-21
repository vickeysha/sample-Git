package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Venkatesh\\Documents\\Selenium Browser Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		WebElement country = driver.findElement(By.id("multi-select"));
        org.openqa.selenium.support.ui.Select s = new org.openqa.selenium.support.ui.Select(country);
        boolean b = s.isMultiple();
        System.out.println(b);
        s.selectByVisibleText("New York");
        s.selectByValue("Washington");
		s.selectByIndex(7);
       
        
        System.out.println("all select options");
	     List<WebElement> all = s.getAllSelectedOptions();
	     for (int i = 0; i < all.size(); i++) {
	    	WebElement Element = all.get(i);
	    	String text2 = Element.getText();
	    	System.out.println(text2);
	    	
	    	
	    	
	  //  System.out.println("first selected option");
	  //  WebElement first = s.getFirstSelectedOption();
	  //  String text = first.getText();
	  //  System.out.println(text);
	    
	    s.deselectAll();
	    
		
		}
		
		
		
		
	}

}
