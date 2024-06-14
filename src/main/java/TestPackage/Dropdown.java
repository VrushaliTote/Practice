package TestPackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Utilities.Screenshot;

public class Dropdown {
	
	public void GetDropdown(WebDriver driver) throws InterruptedException, IOException {
		 WebElement FindSolution =driver.findElement(By.xpath("//a[@data-ta-asset-cms-name=\"Hero_Home-Hub-Personal-and-Business-Insurance\"]"));
				 FindSolution.click();
				 Thread.sleep(2000);
		 WebElement drop = driver.findElement(By.xpath("//select[@name=\"tds-field__input\"]"));
		 drop.click();
		 Select objSelect = new Select(drop);
		 objSelect.selectByVisibleText("Education");
		 Screenshot shot = new Screenshot();
		 shot.SnapShot(driver);
		 objSelect.selectByIndex(1);
		 shot.SnapShot(driver);
		 objSelect.selectByValue("3");
		 driver.close();
		 
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
WebDriver driver = Browser.launch("https://www.travelers.com/");
Thread.sleep(3000);
Dropdown obj = new Dropdown();
obj.GetDropdown(driver);


	}

}
