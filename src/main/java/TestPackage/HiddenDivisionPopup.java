package TestPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HiddenDivisionPopup {
	
	public static void hdp(WebDriver driver) throws InterruptedException {
		WebElement managesetting = driver.findElement(By.xpath("(//button[text()=\"Manage Settings\"])[1]"));
		managesetting.click();
		Thread.sleep(6000);
		Alert a = driver.switchTo().alert();////alert interface ---Alert popup
		Thread.sleep(2000);
		a.accept();
		WebElement AcceptAll = driver.findElement(By.xpath("//span[@class=\"gwt-InlineHTML on\"]"));
		AcceptAll.click();
		
	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = Browser.launch("https://f.qa.adiglobaldistribution.us/solutions/workspaces");

HiddenDivisionPopup obj = new HiddenDivisionPopup();
obj.hdp(driver);
	}

}
