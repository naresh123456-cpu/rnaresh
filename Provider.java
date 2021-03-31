package practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Provider {

	WebDriver driver;
	@BeforeMethod
	public void OpenApp() {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/HotelAppBuild2/index.php");
	}

	@DataProvider(name = "TestData")
	public Object[][] getData() {
		Object[][] data = new Object[1][2];
		data[0][0] = "motivity";
		data[0][1] = "9603107203";
		return data;
	}

	@Test(dataProvider = "TestData")
	public void login(String name, String pass) {

		driver.findElement(By.id("username")).sendKeys(name);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("login")).click();
	}

}
