package POM;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fb_login2 extends utility {
	
	repository obj = new repository();
	
	@BeforeTest
	public void browseropen() throws IOException {
		openbrowser();
	}
	
	@Test
	public void login() throws InterruptedException {
		elementfinder(obj.email).sendKeys("shubham");
		elementfinder(obj.pass).sendKeys("123456789");
		elementfinder(obj.click).click();
		Thread.sleep(5000);
		driver.close();
		
	}

}
