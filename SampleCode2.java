import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SampleCode2 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://motivitylabs.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("your-name")).sendKeys("ranjithparisha");
		Thread.sleep(2000);
		driver.findElement(By.name("your-email")).sendKeys("ranjithparisha@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("your-message")).sendKeys("I want to collaborate with your company");
		Thread.sleep(2000);
		driver.findElement(By.xpath(("//*[@id=\"wpcf7-f1203-o1\"]/form/p/input"))).click();
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		WebElement w1 = driver.findElement(By.linkText("//*[@id=\"menu-main-menu-2\"]/li[2]/a"));
		a.moveToElement(w1).perform();
		Select s1=new Select(w1);
		s1.selectByIndex(1);
		
		}
	}


