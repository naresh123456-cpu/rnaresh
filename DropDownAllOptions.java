package practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownAllOptions {
    static WebDriver driver;
  
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/HotelAppBuild2/index.php");
		driver.findElement(By.id("username")).sendKeys("motivity");
		driver.findElement(By.id("password")).sendKeys("9603107203");
		driver.findElement(By.id("login")).click();
		Select options=new Select(driver.findElement(By.name("location")));
		List<WebElement> elements=options.getOptions();
		System.out.println(elements.size());
		for(int i=0;i<elements.size();i++) 
		{ 
			System.out.println(elements.get(i).getText());
		}

	
       
	}

}
