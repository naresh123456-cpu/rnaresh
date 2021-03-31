package practices;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	static WebDriver driver;

	public static void main(String[] args) throws IOException, Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win64\\chromedriver.exe");
	driver = new ChromeDriver();
    driver.manage().window().maximize();
    File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(srcfile, new File("C:\\Users\\Naresh\\eclipse-workspace\\first.jpeg"));
	}
	}

	