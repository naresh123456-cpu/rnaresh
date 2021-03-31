import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://fb.com");
        System.out.println(driver.getTitle());
        WebElement email = driver.findElement(By.name("email"));email.sendKeys("ragulanaresh12345@gmail.com");
        WebElement password = driver.findElement(By.name("pass"));password.sendKeys("naresh@123");
        WebElement submit = driver.findElement(By.name("login"));submit.click();
        //driver.close();
     
	}

}
