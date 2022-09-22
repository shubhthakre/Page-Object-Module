package POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class utility
{
    public WebDriver driver;
	String browsername,applicationlink;
	public void openbrowser() throws IOException {

		FileInputStream fs = new FileInputStream("F:\\selenium\\excelfile\\xl.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sheet = wb.getSheet("Sheet3");
		XSSFRow row = sheet.getRow(1);
		browsername = row.getCell(0).getStringCellValue();
		applicationlink = row.getCell(1).getStringCellValue();
		System.out.println(browsername);
		System.out.println(applicationlink);
		if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"F:\\selenium\\setup\\chromedriver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			//Script to open firefox
		}
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.MINUTES); 
		driver.get(applicationlink);
	}
	
	public WebElement elementfinder(By obj) {

		WebElement element=driver.findElement(obj);
		return element;
	}
	
	

}
