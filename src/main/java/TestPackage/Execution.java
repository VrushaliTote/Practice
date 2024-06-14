package TestPackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Execution { 
	WebDriver driver;
	@BeforeClass
	public void calling() {
		driver = Browser.launch("https://f.qa.adiglobaldistribution.us/");
	}
    @Test
    public void logintoadi() {
    	Elements obj = new Elements(driver);
    	obj.clicksignin();
    	obj.senduser();
    	obj.sendpass();
    	obj.clicksubmit();	
    }
    
    @Test(priority = 1)
    public void gotosolution() throws InterruptedException {
    	Elements obj = new Elements(driver);
    	obj.clicksloution();
    }
    @Test(priority=2)
    public void hitOffandwork() throws InterruptedException {
    	Elements obj = new Elements(driver);
    	obj.clickoffandwork();
    }
    @Test(priority =3)
    public void hitcross() throws InterruptedException {
    	Elements obj = new Elements(driver);
    	obj.clickcross();
    }
    @Test(priority =4)
    public void acceptcookie() {
    	 Elements obj = new Elements(driver);
    	 obj.clickaccept();
    	 obj.clickConfRoom();
    }
  
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
