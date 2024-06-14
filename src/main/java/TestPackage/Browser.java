package TestPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static WebDriver launch(String url) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
	
		
		public static void main(String[] args) {
	
		// TODO Auto-generated method stub

	}

}
