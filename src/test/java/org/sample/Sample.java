package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample

{
  public	WebDriver driver;
	
	@Parameters({"browser"})
	@Test
	private void tc4( String name) {
		
		
		 if (name.equals("chrome")) {
			 System.out.println("launch  chrome");
			 
			 WebDriverManager.chromedriver().setup();
			  driver = new ChromeDriver();
		}
		 else if (name.equals("ff")) {
			System.out.println("launching firefox");
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
			
			
		}
		 else {
			System.out.println("launch edge");
			WebDriverManager.edgedriver().setup();
			 driver= new EdgeDriver();
		 }			
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("greens");
		driver.findElement(By.id("pass")).sendKeys("greens@123");
		 
		 
	}
	 

}
