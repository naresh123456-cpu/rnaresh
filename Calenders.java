package practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calenders {

	public static void main(String[] args) throws InterruptedException {
		String month = "April 2021";
		String exp_date = "28";
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).click();
		
		//String text=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/div")).getText();
		while (true)
		{
			String text = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/div")).getText();
			if (text.equals(month)) 
			{
				break;
			} 
			else
			{
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a/span")).click();
			}
		}
		
		List<WebElement> alldates = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody"));

		/*for (WebElement ele : alldates) 
		{
			 String date_text=ele.getText();
			
			 if((exp_date.equals(date_text)))
			 {
				 ele.click();
				 break;
			 }
			
		}*/
		for(int i=0;i<alldates.size();i++)
		{
			System.out.println(alldates.size());
			String dates=alldates.get(i).getText();
			System.out.println(dates);
		if(dates.equals(exp_date))
			
		{
			
		}
		
		

	}
	}
}
