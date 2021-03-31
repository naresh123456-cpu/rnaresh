package pom;



import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Pagerepo_Bookhotel extends Pagerepo_selecthotel{

	 By fname=By.name("first_name");
	 By lname=By.name("last_name");
	 By billingaddress=By.name("address");
	 By CreditCardNo =By.name("cc_num");
	 By CreditCardType = By.name("cc_type");
	 By Expirymonth = By.name("cc_exp_month");
	 By Expiryyear = By.name("cc_exp_year"); 
	 By CVVNumber = By.name("cc_cvv");
	 By book=By.name("book_now");
	 
	 public void firstname(String fn) {
		driver.findElement(fname).sendKeys(fn);
	 }
	 public void lastname(String ln) {
		 driver.findElement(lname).sendKeys(ln);
	 }
	 public void address(String adds) {
		 driver.findElement(billingaddress).sendKeys(adds);
	 }
	 public void creditcardno(String creditcard) {
		 driver.findElement(CreditCardNo).sendKeys(creditcard);
	 }
	 public void creditcardtype(String credittype) {
		 new Select(driver.findElement(CreditCardType)).selectByVisibleText(credittype);
	 }
	 public void Expirydate(String creditmon, String credityear) {
		 new Select(driver.findElement(Expirymonth)).selectByVisibleText(creditmon);
	      new Select(driver.findElement(Expiryyear)).selectByValue(credityear);
	 }
	 public void cvvno(String cvv) {
		 driver.findElement(CVVNumber).sendKeys(cvv);
	 }
	 public void booknow() {
		 driver.findElement(book).click();
	 }
	 
	 
}
