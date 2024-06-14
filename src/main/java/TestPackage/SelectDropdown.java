package TestPackage;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;

import Utilities.Screenshot;

public class SelectDropdown { 

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
WebDriver driver = Browser.launch("https://www.travelers.com/");
WebElement FindSolution = driver.findElement(By.xpath("//a[@aria-label=\"Find Solutions\"]"));
FindSolution.click();
WebElement drop = driver.findElement(By.xpath("//select[@data-ta-asset-name=\"Hero Dropdown Form Block\"]"));
drop.click();
Thread.sleep(3000);
Select Selectdrop = new Select(drop);
Selectdrop.selectByIndex(1);
Thread.sleep(1000);
Selectdrop.selectByVisibleText("Wholesale & Distribution");
driver.findElement(By.xpath("//a[text()=\"FIND SOLUTIONS\"]")).click();

Screenshot shot = new Screenshot();
shot.SnapShot(driver);
driver.close();
	}

}
