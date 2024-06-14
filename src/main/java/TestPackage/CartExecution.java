package TestPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Utilities.Screenshot;

public class CartExecution {

	WebDriver driver;
	@BeforeClass
	public void call() {
		driver = Browser.launch("https://f.qa.adiglobaldistribution.us/");	
	}

	    @Test(priority=1)
	    public void logintoadi() {
	    	Elements obj = new Elements(driver);
	    	obj.clicksignin();
	    	obj.senduser();
	    	obj.sendpass();
	    	obj.clicksubmit();	
	    }
	   
	    @Test(priority =2)
	    public void gotocart() throws InterruptedException {
	    	Cart obj = new Cart(driver);
	    	obj.clickcat();
	    	obj.clickaccept();
	    	obj.clickckeckout();
	    	obj.clickplaceorder();
	    	System.out.println(driver.getCurrentUrl());
	    	obj.selectradio();
	    }
	    @Test(priority =3)
	    public void screenshot() throws IOException {
		Screenshot obj = new Screenshot();
		obj.SnapShot(driver);
	
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
