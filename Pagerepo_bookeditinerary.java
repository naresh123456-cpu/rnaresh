package pom;


import org.openqa.selenium.By;

public class Pagerepo_bookeditinerary extends Pagerepo_Bookhotel {

	By bI=By.linkText("Booked Itinerary");
	By checkbutton=By.xpath("//*[@id='booked_form']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]/input");
	By cancelled=By.name("cancelall");
	By logout=By.linkText("Logout");
	By againlogin=By.linkText("Click here to login again");
	 
	public void bookedItinerary() {
		driver.findElement(bI).click();
	}
	public void check() {
		driver.findElement(checkbutton).click();
	}
	public void cancelledbutton() {
		driver.findElement(cancelled).click();
	}
	public void accept() {
		driver.switchTo().alert().accept();
	}
	public void logout() {
		driver.findElement(logout).click();
	}
	public void aglogin() {
		driver.findElement(againlogin).click();
	}
}

