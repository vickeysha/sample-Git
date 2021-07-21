package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampleweb {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Venkatesh\\Documents\\Selenium Browser Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		List<WebElement> trow = driver.findElements(By.tagName("tr"));
		for (int i = 0; i < trow.size(); i++) {
		WebElement row = trow.get(i);
		List<WebElement> tdata = row.findElements(By.tagName("td"));
		for (int j = 0; j < tdata.size(); j++) {
			WebElement data = tdata.get(j);
			String text = data.getText();
			if (text.equals("Taiwan"))
			{
				System.out.println(text);
				System.out.println(i);
				System.out.println(j);
			}
			
			
			
		}
			
			
			
		
			
		}
}
}