package newone;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;

public class Dataprovider_Excel {
	@DataProvider(name="Authentication")
	public Object[][] loginData() throws Exception, JXLException {
		Object[][] arrayObject = getExcelData("E:\\Tasks\\datadriven1.xls","data");
		return arrayObject;
	}
		
		
	
		public static String[][] getExcelData(String fileName, String sheetName) throws IOException, JXLException {
			String[][] arrayExcelData = null;
			
				FileInputStream fs = new FileInputStream(fileName);
				Workbook wb = Workbook.getWorkbook(fs);
				Sheet sh = wb.getSheet(sheetName);

				int totalNoOfCols = sh.getColumns();
				int totalNoOfRows = sh.getRows();
				
				arrayExcelData = new String[totalNoOfRows-1][totalNoOfCols];
				//arrayExcelData = new String[7][2];
				
				
				for (int i= 1 ; i < totalNoOfRows; i++) {

					for (int j=0; j < totalNoOfCols; j++) {
						arrayExcelData[i-1][j] = sh.getCell(j, i).getContents();
						
						
					}

				}
				return arrayExcelData;
		}
		
		/*public static void main(String[] args) throws Exception, JXLException {
			System.out.println(getExcelData("E:\\Selenium\\Book1.xls","Data"));*/
		@Test (dataProvider ="Authentication")
		void UserLogin(String un,String pwd) throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win64\\chromedriver.exe");
			WebDriver wd=new ChromeDriver();
			wd.get("http://adactin.com/HotelAppBuild2/");
			wd.findElement(By.id("username")).sendKeys(un);
			wd.findElement(By.id("password")).sendKeys(pwd);
			wd.findElement(By.id("login")).click();
			Thread.sleep(2000);
			wd.findElement(By.linkText("Logout")).click();
			wd.close();
		}

}





