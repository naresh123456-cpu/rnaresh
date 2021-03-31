package newone;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard_Actions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/HotelAppBuild2/index.php");
		WebElement uname=driver.findElement(By.id("username"));
		Actions a=new Actions(driver);
		a.moveToElement(uname).perform();
		a.keyDown(uname,Keys.SHIFT);
		a.sendKeys(uname, "naresh").perform();
		a.keyDown(uname,Keys.SHIFT);
		a.sendKeys(uname, "@123").perform();
		

	}

}
