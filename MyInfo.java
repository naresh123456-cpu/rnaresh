package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyInfo {
	WebDriver driver;

	public void LaunchApp() {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	public void Login(String name, String pass) {

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	}

	public void MyInfor(String Fname, String Lname, String Empid, String Otherid, String Lno, String Edate, String Nic,
			String Sin, String Birth, String Nick) throws Exception {
		driver.findElement(By.linkText("My Info")).click();
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		driver.findElement(By.xpath("//input[@id='personal_txtEmpFirstName']")).sendKeys(Fname);
		driver.findElement(By.xpath("//input[@id='personal_txtEmpLastName']")).sendKeys(Lname);
		driver.findElement(By.xpath("//input[@id='personal_txtEmployeeId']")).sendKeys(Empid);
		driver.findElement(By.xpath("//input[@id='personal_txtOtherID']")).sendKeys(Otherid);
		driver.findElement(By.xpath("//input[@id='personal_txtLicenNo']")).sendKeys(Lno);
		driver.findElement(By.xpath("//input[@id='personal_txtLicExpDate']")).clear();
		driver.findElement(By.xpath("//input[@id='personal_txtLicExpDate']")).sendKeys(Edate);
		driver.findElement(By.xpath("//input[@id='personal_txtNICNo']")).sendKeys(Nic);
		driver.findElement(By.xpath("//input[@id='personal_txtSINNo']")).sendKeys(Sin);
		driver.findElement(By.xpath("//input[@id='personal_optGender_1']")).click();
		new Select(driver.findElement(By.xpath("//select[@id='personal_cmbMarital']"))).selectByIndex(3);
		new Select(driver.findElement(By.xpath("//select[@id='personal_cmbNation']"))).selectByIndex(5);
		driver.findElement(By.xpath("//input[@id='personal_DOB']")).clear();
		driver.findElement(By.xpath("//input[@id='personal_DOB']")).sendKeys(Birth);
		driver.findElement(By.xpath("//input[@id='personal_txtEmpNickName']")).sendKeys(Nick);

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

	public void recruitment(String vacancy, String manager, String positions) throws Exception {

		driver.findElement(By.linkText("Recruitment")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Vacancies")).click();
		driver.findElement(By.cssSelector("input#btnAdd")).click();
		new Select(driver.findElement(By.cssSelector("select#addJobVacancy_jobTitle"))).selectByIndex(3);
		driver.findElement(By.xpath("//input[@name='addJobVacancy[name]']")).sendKeys(vacancy);
		driver.findElement(By.xpath("//input[@name='addJobVacancy[hiringManager]']")).sendKeys(manager);
		driver.findElement(By.xpath("//input[@name='addJobVacancy[noOfPositions]']")).sendKeys(positions);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='btnBack']")).click();
		Thread.sleep(3000);
	}

	public void candiates(String firstname, String lastname, String mail) {

		driver.findElement(By.linkText("Candidates")).click();
		driver.findElement(By.cssSelector("input#btnAdd")).click();
		driver.findElement(By.xpath("//input[@id='addCandidate[firstName]']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@name='addCandidate[lastName]']")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@name='addCandidate[email]']")).sendKeys(mail);
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		driver.findElement(By.xpath("//input[@id='btnBack']")).click();

	}

	public void AddEmployee(String firstname, String lastname) {
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();

	}

}
