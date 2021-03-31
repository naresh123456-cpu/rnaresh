package pom;


import org.openqa.selenium.By;

public class Pagerepo_selecthotel extends Pagerepo_searchhotel {

	By radiobutton=By.xpath("//*[@id='radiobutton_0']");
	By cont=By.name("continue");
    
	public void select() {
		driver.findElement(radiobutton).click();
	}
	public void continuebutton() {
		driver.findElement(cont).click();
	}
	
}

