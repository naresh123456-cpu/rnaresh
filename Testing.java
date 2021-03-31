import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import newone.TestUtil;

public class Testing {

	WebDriver driver;
	static String uname,pswd,location, hotels,roomtype,nofrms,chkndate,chkotdate,adlts,chlds,fstnm,lstnm,blnadd,crdno,crdtype,mnth,year,cvv;
   
	
	@DataProvider
	public Iterator<Object[]> getTestData() throws Exception {
		ArrayList<Object[]> testdata=TestUtil.getDataFromExcel();
		
	    return testdata.iterator();
	}
	@BeforeClass
	public void SetUp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win64\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://adactinhotelapp.com/HotelAppBuild2/index.php");
		 driver.manage().window().maximize();
	}
	
	@Test(priority=1,dataProvider="getTestData")
	public void Login(String uname, String pswd)
	{
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pswd);
		driver.findElement(By.id("login")).click();
	}

	@Test(priority=2)
	public void SearchHotel() throws Exception
	{
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
		Thread.sleep(3000);
	}
	@Test(priority=3)
	public void SelectHotel() throws Exception 
	{
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		Thread.sleep(3000);
		
	}
	@Test(priority=4)
	public void BookHotel() throws Exception
	{
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
	@Test(priority=5)
	public void Myitenery() throws Exception
	{
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"my_itinerary\"]")).click();
		driver.findElement(By.xpath("//*[@id=\'booked_form\']/table/tbody/tr[2]/td/table/tbody/tr[3]/td[1]/input")).click();
		driver.findElement(By.name("cancelall")).click();
		Thread.sleep(3000);
		System.out.println("Text on popup is "+driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
	}
//	@Test(dependsOnMethods="Myitenery")
//	public void ChangePassword() throws Exception
//	{
//		driver.findElement(By.linkText("Change Password")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.id("current_pass")).sendKeys("9603107203");
//		driver.findElement(By.id("new_password")).sendKeys("9603107203");
//		driver.findElement(By.id("re_password")).sendKeys("9603107203");
//		driver.findElement(By.id("Submit")).click();
//		Thread.sleep(3000);
//	    System.out.println(driver.findElement(By.xpath("//*[@id=\"change_password_form\"]/table/tbody/tr[2]/td")).getText());
//	}

	}

