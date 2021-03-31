import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import jxl.JXLException;
	import jxl.Sheet;
	import jxl.Workbook;
	import jxl.read.biff.BiffException;
public class DataDriven {
	
	
	public static void main(String[] args) throws JXLException, IOException ,Exception
		{
			FileInputStream f=new FileInputStream("E:\\Tasks\\datadriven1.xls");
			Workbook w= Workbook.getWorkbook(f);
			Sheet sh=w.getSheet("data");
			int rc=sh.getRows();
			int cc=sh.getColumns();
			System.out.println(rc);
			System.out.println(cc);
			System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			for(int i=1;i<rc-1;i++)
			{
				String uname=sh.getCell(0,i).getContents();
				String pswd=sh.getCell(1,i).getContents();
				String location=sh.getCell(2,i).getContents();
				String hotels=sh.getCell(3,i).getContents();
				String roomtype=sh.getCell(4,i).getContents();
				String nofrms=sh.getCell(5,i).getContents();
				String chkndate=sh.getCell(6,i).getContents();
				String chkotdate=sh.getCell(7,i).getContents();
				String adlts=sh.getCell(8,i).getContents();
				String chlds=sh.getCell(9,i).getContents();
				String fstnm=sh.getCell(10,i).getContents();
				String lstnm=sh.getCell(11,i).getContents();
				String blnadd=sh.getCell(12,i).getContents();
				String crdno=sh.getCell(13,i).getContents();
				String crdtype=sh.getCell(14,i).getContents();
				String mnth=sh.getCell(15,i).getContents();
				String year=sh.getCell(16,i).getContents();
				String cvv=sh.getCell(17,i).getContents();
	            System.out.println(uname+" "+pswd+" "+location+" "+hotels+" "+roomtype+" "+nofrms+" "+chkndate+" "+chkotdate+" "+adlts+" "+chlds+" "+fstnm+" "+lstnm+" "+blnadd+" "+crdno+" "+crdtype+" "+mnth+" "+year+"  "+cvv);
	            driver.get("http://adactinhotelapp.com/HotelAppBuild2/index.php");
	    		Thread.sleep(3000);
	    		driver.findElement(By.id("username")).sendKeys(uname);
	    		driver.findElement(By.id("password")).sendKeys(pswd);
	    		driver.findElement(By.id("login")).click();
	    		new Select(driver.findElement(By.id("location"))).selectByVisibleText(location);
	    		new Select(driver.findElement(By.id("hotels"))).selectByVisibleText(hotels);
	    	    new Select(driver.findElement(By.id("room_type"))).selectByVisibleText(roomtype);
	    		new Select(driver.findElement(By.id("room_nos"))).selectByVisibleText(nofrms);
	    	    driver.findElement(By.id("datepick_in")).clear();
	    		driver.findElement(By.id("datepick_in")).sendKeys(chkndate);
	    		driver.findElement(By.id("datepick_out")).clear();
	    		driver.findElement(By.id("datepick_out")).sendKeys(chkotdate);
	    		new Select(driver.findElement(By.id("adult_room"))).selectByVisibleText(adlts);
	    		new Select(driver.findElement(By.id("child_room"))).selectByVisibleText(chlds);
	    		driver.findElement(By.id("Submit")).click();
	    		driver.findElement(By.id("radiobutton_0")).click();
	    		driver.findElement(By.id("continue")).click();
	    		driver.findElement(By.id("first_name")).sendKeys(fstnm);
	    		driver.findElement(By.id("last_name")).sendKeys(lstnm);
	    		driver.findElement(By.id("address")).sendKeys(blnadd);
	    		driver.findElement(By.id("cc_num")).sendKeys(crdno);
	    		new Select(driver.findElement(By.id("cc_type"))).selectByVisibleText(crdtype);
	    		new Select(driver.findElement(By.id("cc_exp_month"))).selectByVisibleText(mnth);
	    		new Select(driver.findElement(By.id("cc_exp_year"))).selectByVisibleText(year);
	    		driver.findElement(By.id("cc_cvv")).sendKeys(cvv);
	    		driver.findElement(By.id("book_now")).click();
	    		Thread.sleep(5000);
			
			
			}
			driver.close();
			
			

		}

	}



