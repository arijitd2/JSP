package net.arijitdey.to;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.*;		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class TestNG {		
	    private WebDriver driver;		
		@Test				
		public void testEasy() {	
			driver.get("http://localhost/HelloWorldJavaEE");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Hello World Java EE")); 		
		}	
		@BeforeTest
		public void beforeTest() {	
		    driver = new ChromeDriver();  
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}