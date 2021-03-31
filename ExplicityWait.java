package newone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplicityWait {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://adactinhotelapp.com/HotelAppBuild2/index.php");
			

	}

}
