import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demon {
	WebDriver driver;
      @BeforeMethod
	public void EnterUrl()
	{
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/HotelAppBuild2/index.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test(priority=1,groups="Login")
	public void Login() 
	{
		driver.findElement(By.id("username")).sendKeys("motivity");
		driver.findElement(By.id("password")).sendKeys("9603107203");
		driver.findElement(By.id("login")).click();
	}
	@Test(priority=2,groups="Test")
	public void GetTitle()
	{
		System.out.println(driver.getTitle());
		
	}
	
	@Test(priority=3,groups="Test")
	public void LogoTest()
	{
		boolean b=driver.findElement(By.xpath("/html/body/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
	    System.out.println(b);
	}
	@AfterMethod
	public void Close()
	{
		driver.close();
	}
	
}
