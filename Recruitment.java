package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Recruitment {
	WebDriver driver;
	public void recruitment() throws Exception {
		
	
	 driver.findElement(By.linkText("Recruitment")).click();
	 driver.findElement(By.id("menu_recruitment_viewJobVacancy")).click();
	 driver.findElement(By.id("btnAdd")).click();
	new Select(driver.findElement(By.id("addJobVacancy_jobTitle"))).selectByIndex(3);
	driver.findElement(By.name("addJobVacancy[name]")).sendKeys("x");
	driver.findElement(By.name("addJobVacancy[hiringManager]")).sendKeys("Cassidy Hope");
	driver.findElement(By.name("addJobVacancy[noOfPositions]")).sendKeys("1");
	Thread.sleep(1000);
	driver.findElement(By.id("btnSave")).click();
	Thread.sleep(500);
	driver.findElement(By.id("btnBack")).click();
	driver.findElement(By.id("menu_recruitment_viewCandidates")).click();
	driver.findElement(By.name("btnAdd")).click();
	driver.findElement(By.name("addCandidate[firstName]")).sendKeys("Surya");
	driver.findElement(By.name("addCandidate[lastName]")).sendKeys("D");
	driver.findElement(By.name("addCandidate[email]")).sendKeys("xyz@gmail.com");
	
	
	}
}
