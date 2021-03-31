package practices;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlings {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win64\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get(" http://demo.guru99.com/popup.php");
        driver.findElement(By.linkText("Click Here")).click();
        driver.manage().window().maximize();
        Set<String> allwindows=driver.getWindowHandles();
        Iterator<String> itr=allwindows.iterator();
        String parent=itr.next();
        System.out.println("parent window "+parent);
        String child=itr.next();
        System.out.println("child window "+child);
        System.out.println(driver.switchTo().window(child).getTitle());
        driver.close();
        System.out.println(driver.switchTo().window(parent).getTitle());
        Thread.sleep(1000);
	}

}
