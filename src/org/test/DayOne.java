package org.test;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DayOne {

	
	public static void main(String[] args)  {
     System.setProperty("webdriver.chrome.driver","C:\\Users\\Venkatesh\\Documents\\Selenium Browser Drivers\\chromedriver.exe");
     
     WebDriver driver=new ChromeDriver();
     driver.get("http://demo.automationtesting.in/Alerts.html");
     WebElement alertbtn = driver.findElement(By.xpath("//a[taxt()='Alert with OK & cancel'] "));
     alertbtn.click();
     WebElement confirm = driver.findElement(By.xpath("//button[@onclick='confirm box()']"));
     confirm.click();
     Alert a = driver.switchTo().alert();
     a.dismiss();
  
     
	}
}