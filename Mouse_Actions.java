package newone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		driver.switchTo().frame(0);
		 driver.manage().window().maximize();
		WebElement drag= driver.findElement(By.id("draggable"));
		Actions ac=new Actions(driver);
		Thread.sleep(5000);
		ac.clickAndHold(drag).moveByOffset(20, 120).build().perform();
		

	}
}
