package practices;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class FindElements 
 
  {
	
    static String url;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win64\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/HotelAppBuild2/index.php");
		Dimension size = driver.manage().window().getSize();
		int width = size.getWidth();
		int height = size.getHeight();
		System.out.println(width+" "+height);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
			
		String url=links.get(i).getText() ;
		System.out.println(url);
		//Object[] obj = new Object[] { url };
				
		}
		
		}
	ArrayList<Object[]> data= new ArrayList<Object[]>();
	//data.add(new Object[]{url});

	}



  
