package POM;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fb_logim extends utility{
	@BeforeTest
	public void browseropen() throws IOException {
		openbrowser();
	}
	
	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("Shubham");
		driver.findElement(By.id("pass")).sendKeys("123456789");
		driver.findElement(By.name("login")).click();
		Thread.sleep(50000);
		driver.close();
		
	}

}
