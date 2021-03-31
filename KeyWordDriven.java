
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class KeyWordDriven {
	WebDriver driver;
	

	public static void main(String[] args) throws BiffException, IOException
	{
    
		FileInputStream file= new FileInputStream("E:\\Tasks\\keyworddriven.xls");
		Workbook wb= Workbook.getWorkbook(file);
		Sheet sh=wb.getSheet("data");
		int rc=sh.getRows();
		int cc=sh.getColumns();
		System.out.println(rc);
		System.out.println(cc);
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		
		
		for(int i=1;i<rc;i++)
		{
			String action=sh.getCell(0,i).getContents();
			String locator=sh.getCell(1, i).getContents();
			String input=sh.getCell(2, i).getContents();
			System.out.println(action +" "+ locator +" "+ input);
			switch(action)
			{
			
			 case "Open":driver.get(input);
			 break;
			 case "Enter":driver.findElement(By.xpath(locator)).sendKeys(input);
			 break;
			 case "Select": new Select(driver.findElement(By.xpath(locator))).selectByVisibleText(input);
			 break;
			 case "Click":driver.findElement(By.xpath(locator)).click();
			  break;
			 case "Close": driver.close();
			 break;
			
			}
			
		}
		

	}

}
