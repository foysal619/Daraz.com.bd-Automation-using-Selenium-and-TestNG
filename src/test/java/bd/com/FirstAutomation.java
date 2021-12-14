package bd.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstAutomation extends DriverSetUp {
	
	 public static String baseUrl="https://www.daraz.com.bd/";
	 @Test
	 public static void Daraz() throws InterruptedException {
		 
		 driver.get(baseUrl);
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		 
		//Home Page Title Verify
			String expectedTitle = "Online Shopping in Bangladesh: Order Now from Daraz.com.bd";
			String actualTitle = driver.getTitle();
			Assert.assertEquals(expectedTitle, actualTitle);
			System.out.println("Home Page Title Print: "+actualTitle);
			
			
			
		//Products Open
			driver.findElement(By.xpath("//span[normalize-space()='Electronic Accessories']")).click();
			Thread.sleep(5000);
			String text = driver.findElement(By.xpath("//span[normalize-space()='Electronic Accessories']")).getText();
			System.out.println("Product Category Name: "+text);
			Thread.sleep(2000);	
			
			//Hover
			WebElement hover = driver.findElement(By.xpath("//span[normalize-space()='Computer Accessories']"));
			 
			Actions action = new Actions(driver);
			action.clickAndHold(hover).build().perform();
			 
			driver.findElement(By.xpath("//span[normalize-space()='Power Cord & Adaptors']")).click();
			
			//checkbox
			driver.findElement(By.xpath("//span[contains(text(),'D-Link']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//a[@title='CAT6 Cable D-Link.internet LAN Cable 100(Feet)']")).click();
			driver.findElement(By.xpath("//span[contains(text(),'Add to Cart')]")).click();
			Thread.sleep(5000);	
			
			
					
		//iFrame
			WebElement loginFrame = driver.findElement(By.xpath("//iFrame[@class='login-iframe']"));
			driver.switchTo().frame(loginFrame);
			
		 
			driver.findElement(By.xpath("//input[@placeholder='Please enter your Phone Number or Email']")).sendKeys("01837722931");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='Please enter your password']")).sendKeys("foysal123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(2000);
			
			driver.switchTo().parentFrame();
		 
			driver.findElement(By.xpath("//button[contains(text(),'CHECK OUT')]")).click();
		 
			
			
			//DATA INPUT
			driver.findElement(By.xpath("//input[@placeholder='Enter your first and last name']")).sendKeys("Md. Musfiqur Rahman Foysal");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='Please enter your phone number']")).sendKeys("01837722931");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='Please enter your email']")).sendKeys("fysl2u@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='For Example: House# 123, Street# 123, ABC Road']")).sendKeys("South Kacharipara, Fakirbari Road");
			Thread.sleep(2000);
			
			//Dropdown
			driver.findElement(By.xpath("//span[contains(text(),'Please choose your region')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//li[contains(text(),'Mymensingh')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(text(),'Please choose your city')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//li[contains(text(),'Jamalpur - Town')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(text(),'Please choose your area')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//li[contains(text(),'Jamalpur Sadar')]")).click();
			Thread.sleep(2000);  
			
			
			driver.findElement(By.xpath("//span[contains(text(),'HOME')]")).click();
			Thread.sleep(2000);
			
			
			//logout	
			driver.findElement(By.xpath("//span[@id='myAccountTrigger']")).click();
			Thread.sleep(2000);
		 
			driver.findElement(By.xpath("//span[@class='account-icon test logout']")).click();
			Thread.sleep(8000);
	 }
}
