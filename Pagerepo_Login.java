package pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagerepo_Login {
	 WebDriver driver;
	 
	 By uname=By.id("username");
	 By pswd=By. name("password");
	 By login=By.name("login");
	 
	 public void launchBrowser() {
		 System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win64\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();

	 }
	 public void openApp(String url) {
		 driver.get(url);
	 }
	 public void enterUsername(String un) {
		 driver.findElement(uname).sendKeys(un);
	 }
	 public void enterPassword(String pwd) {
		 driver.findElement(pswd).sendKeys(pwd);
	 }
	 public void clickLogin() {
		 driver.findElement(login).click();;
	 }
	
}

	

