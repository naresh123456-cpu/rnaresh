package practices;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws Exception {

			System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(3000);
			//driver.findElement(By.linkText("Login")).click();
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("9603107203");
	}

}
