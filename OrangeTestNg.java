package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OrangeTestNg {

	WebDriver driver;

	@BeforeClass
	public void LaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
	@Test(priority=1)
	public void Login() {

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
}
	@Test(priority=2,dependsOnMethods="Login")
	public void MyInfor( ) throws Exception {
		driver.findElement(By.linkText("My Info")).click();
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		driver.findElement(By.xpath("//input[@id='personal_txtEmpFirstName']")).sendKeys("Paul");
		driver.findElement(By.xpath("//input[@id='personal_txtEmpLastName']")).sendKeys("Collings");
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("//input[@id='btnEditCustom']")).click();
		Thread.sleep(3000);
		new Select(driver.findElement(By.xpath("//*[@id=\'frmEmpCustomFields\']/ol/li/select"))).selectByIndex(3);
		driver.findElement(By.xpath("//input[@id='btnEditCustom']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='btnAddAttachment']")).click();
		driver.findElement(By.xpath("//input[@id='ufile']")).sendKeys("E:\\Document.odt");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='btnSaveAttachment']")).click();
}
	@Test(priority=3)
	public void recruitment() throws Exception {

		driver.findElement(By.linkText("Recruitment")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Vacancies")).click();
		driver.findElement(By.xpath("//input[@name='btnAdd']")).click();
		new Select(driver.findElement(By.xpath("//select[@id='addJobVacancy_jobTitle']"))).selectByIndex(3);
		driver.findElement(By.xpath("//input[@name='addJobVacancy[name]']")).sendKeys("x");
		driver.findElement(By.xpath("//input[@name='addJobVacancy[hiringManager]']")).sendKeys("cassidy Hope");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='btnBack']")).click();
		Thread.sleep(3000);
	}
	@Test(priority=4)
	public void candiates() throws Exception {

		driver.findElement(By.linkText("Candidates")).click();
		driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
		driver.findElement(By.xpath("//input[@id='addCandidate[firstName]']")).sendKeys("x");
		driver.findElement(By.xpath("//input[@name='addCandidate[lastName]']")).sendKeys("y");
		driver.findElement(By.xpath("//input[@name='addCandidate[email]']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		driver.findElement(By.xpath("//input[@id='btnBack']")).click();
		Thread.sleep(3000);

}
	@AfterClass
	public void closeApp() {
		driver.close();
	}
}
