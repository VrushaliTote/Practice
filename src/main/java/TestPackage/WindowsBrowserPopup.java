package TestPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WindowsBrowserPopup {

	public void WBP(WebDriver driver) throws InterruptedException {
		WebElement SolutionServices = driver.findElement(By.xpath("//span[text()=\"Solutions & Services\"]"));
		SolutionServices.click();
		Thread.sleep(2000);
		WebElement VideoCentre = driver.findElement(By.xpath("//button[@data-category-name=\"selectedCategoryName_Video Center\"]"));
		VideoCentre.click();
		String mainpageTitle = driver.getWindowHandle();
		Set<String> address = driver.getWindowHandles();//returns address of the windows
		Iterator<String> a = address.iterator();
		System.out.println(a.next());////to print the address for single window
		Thread.sleep(2000);
		String title = "Video Center";
		while(a.hasNext()) {
			driver.switchTo().window(a.next());
			String currentTitle =driver.getTitle();
			if(currentTitle.equals(title)) {
				{WebElement search = driver.findElement(By.xpath("//input[@id=\"search-submit\"]"));
				search.sendKeys("camera");
				WebElement SearchButton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
				SearchButton.click();
				WebElement ExploreNext = driver.findElement(By.xpath("//h3[text()=\"Explore Next-Gen Analytics with AI-Powered Edge Cameras\"]"));
				ExploreNext.click();
			}
				driver.switchTo().window(mainpageTitle);////to switch back to the main window
				System.out.println(driver.getTitle());
			
		}
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		while(a.hasNext()) {//returns true untill the value is present on the iteratior
//			driver.switchTo().window(a.next());
//			String currentTitle = driver.getTitle();
//			if(currentTitle.equals(title))
//			{WebElement search = driver.findElement(By.xpath("//input[@id=\"search-submit\"]"));
//			search.sendKeys("camera");
//			WebElement SearchButton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
//			SearchButton.click();
				
//			}
//		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = Browser.launch("https://f.qa.adiglobaldistribution.us/"); 

WindowsBrowserPopup obj = new WindowsBrowserPopup();
obj.WBP(driver);
	}

}
