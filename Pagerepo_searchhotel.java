package pom;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Pagerepo_searchhotel extends Pagerepo_Login {

	By loc=By.name("location");
	By hotels=By.name("hotels");
	By room_type=By.id("room_type");
	By no_ofrooms=By.name("room_nos");
	By clear=By.name("datepick_in");
	By clear1=By.name("datepick_out");
	By check_indate=By.name("datepick_in");
	By check_outdate=By.name("datepick_out");
	By adult_room=By.name("adult_room");
	By child_room=By.name("child_room");
	By search=By.id("Submit");
	
	public void location(String location) {
		new Select(driver.findElement(loc)).selectByVisibleText(location);
	}
	public void hotels(String Hotels) {
		new Select(driver.findElement(hotels)).selectByVisibleText(Hotels);
	}
	public void roomtype(String roomtype) {
		new Select(driver.findElement(room_type)).selectByVisibleText(roomtype);
	}
	public void noofrooms(String noofrooms) {
	 new Select(driver.findElement(no_ofrooms)).selectByVisibleText(noofrooms);
	}
	public void clear() {
	driver.findElement(clear).clear();
	 driver.findElement(clear1).clear();
	}
	public void checkindate(String checkin) {
		 driver.findElement(check_indate).sendKeys(checkin);
	}
	public void checkoutdate(String checkout) {
		 driver.findElement(check_outdate).sendKeys(checkout);
	}
	public void adultperRoom(String adult) {
		new Select(driver.findElement(adult_room)).selectByVisibleText(adult);
	}
	public void ChildrenperRoom(String  child) {
		new Select(driver.findElement(child_room)).selectByVisibleText(child);
	}
	public void search() {
		driver.findElement(search).click();
	}
}

