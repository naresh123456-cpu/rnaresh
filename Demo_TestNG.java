import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo_TestNG {
	
WebDriver driver;

@BeforeClass
public void LaunchBrowser()
{
	System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win64\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://adactinhotelapp.com/HotelAppBuild2/index.php");
}

/*@AfterClass
public void CloseApp()
{
	driver.close();
}

/*@BeforeMethod
public void OpenApp()
{
	System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win64\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://adactinhotelapp.com/HotelAppBuild2/index.php");
	
}
@AfterMethod
public void Logout()
{
	driver.findElement(By.linkText("Logout")).click();
}*/

@Test
public void Login()
{
	driver.findElement(By.id("username")).sendKeys("motivity");
	driver.findElement(By.id("password")).sendKeys("9603107203");
	driver.findElement(By.id("login")).click();
}

@Test(priority=1)
public void SearchHotel() throws Exception
{
	new Select(driver.findElement(By.id("location"))).selectByIndex(1);
	new Select(driver.findElement(By.id("hotels"))).selectByIndex(1);
    new Select(driver.findElement(By.id("room_type"))).selectByIndex(1);
	new Select(driver.findElement(By.id("room_nos"))).selectByIndex(1);
    driver.findElement(By.id("datepick_in")).clear();
	driver.findElement(By.id("datepick_in")).sendKeys("10/02/2021");
	driver.findElement(By.id("datepick_out")).clear();
	driver.findElement(By.id("datepick_out")).sendKeys("12/02/2021");
	new Select(driver.findElement(By.id("adult_room"))).selectByIndex(1);
	new Select(driver.findElement(By.id("child_room"))).selectByIndex(2);
	driver.findElement(By.id("Submit")).click();
	Thread.sleep(3000);
}
@Test(priority=2)
public void SelectHotel() throws Exception 
{
	driver.findElement(By.id("radiobutton_0")).click();
	driver.findElement(By.id("continue")).click();
	Thread.sleep(3000);
	
}
@Test(priority=3)
public void BookHotel() throws Exception
{
	driver.findElement(By.id("first_name")).sendKeys("Naresh");
	driver.findElement(By.id("last_name")).sendKeys("Ragula");
	driver.findElement(By.id("address")).sendKeys("Bachupally");
	driver.findElement(By.id("cc_num")).sendKeys("1234567812345678");
	new Select(driver.findElement(By.id("cc_type"))).selectByIndex(2);
	new Select(driver.findElement(By.id("cc_exp_month"))).selectByIndex(2);
	new Select(driver.findElement(By.id("cc_exp_year"))).selectByIndex(4);
	driver.findElement(By.id("cc_cvv")).sendKeys("402");
	driver.findElement(By.id("book_now")).click();
	Thread.sleep(5000);
}
@Test(priority=4)
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
@Test(dependsOnMethods="Myitenery")
public void ChangePassword() throws Exception
{
	driver.findElement(By.linkText("Change Password")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("current_pass")).sendKeys("9603107203");
	driver.findElement(By.id("new_password")).sendKeys("9603107203");
	driver.findElement(By.id("re_password")).sendKeys("9603107203");
	driver.findElement(By.id("Submit")).click();
	Thread.sleep(3000);
    System.out.println(driver.findElement(By.xpath("//*[@id=\"change_password_form\"]/table/tbody/tr[2]/td")).getText());
}

}







 
