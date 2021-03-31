
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/HotelAppBuild2/index.php");
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("motivity");
		driver.findElement(By.id("password")).sendKeys("9603107203");
		driver.findElement(By.id("login")).click();
		WebElement w=driver.findElement(By.id("location"));
		Select location=new Select(w);
		location.selectByIndex(1);
		Select hotels=new Select(driver.findElement(By.id("hotels")));
	    hotels.selectByIndex(1);
		Select roomtype=new Select(driver.findElement(By.id("room_type")));
		roomtype.selectByIndex(1);
		Select roomno=new Select(driver.findElement(By.id("room_nos")));
		roomno.selectByIndex(1);
		driver.findElement(By.id("datepick_in")).clear();
		driver.findElement(By.id("datepick_in")).sendKeys("27/02/2021");
		driver.findElement(By.id("datepick_out")).clear();
		driver.findElement(By.id("datepick_out")).sendKeys("28/02/2021");
		Select adults=new Select(driver.findElement(By.id("adult_room")));
		adults.selectByIndex(1);
		Select childrens=new Select(driver.findElement(By.id("child_room")));
		childrens.selectByIndex(2);
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("first_name")).sendKeys("Naresh");
		driver.findElement(By.id("last_name")).sendKeys("Ragula");
		driver.findElement(By.id("address")).sendKeys("Bachupally");
		driver.findElement(By.id("cc_num")).sendKeys("1234567812345678");
		Select cardtype=new Select(driver.findElement(By.id("cc_type")));
		cardtype.selectByIndex(2);
		Select expmnth=new Select(driver.findElement(By.id("cc_exp_month")));
		expmnth.selectByIndex(2);
		Select expyr=new Select(driver.findElement(By.id("cc_exp_year")));
		expyr.selectByIndex(4);
		driver.findElement(By.id("cc_cvv")).sendKeys("402");
		driver.findElement(By.id("book_now")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("my_itinerary")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"booked_form\"]/table/tbody/tr[2]/td/table/tbody/tr[3]/td[1]/input")).click();
		driver.findElement(By.name("cancelall")).click();
		Thread.sleep(3000);
		System.out.println("Text on popup is"+driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		driver.findElement(By.linkText("Change Password")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("current_pass")).sendKeys("9603107203");
		driver.findElement(By.id("new_password")).sendKeys("9603107203");
		driver.findElement(By.id("re_password")).sendKeys("9603107203");
		driver.findElement(By.id("Submit")).click();
		Thread.sleep(5000);
	     System.out.println(driver.findElement(By.xpath("//*[@id=\"change_password_form\"]/table/tbody/tr[2]/td")).getText());
	     driver.findElement(By.linkText("Logout")).click();
	     Thread.sleep(2000);
	     driver.close();
		}


		
	}

