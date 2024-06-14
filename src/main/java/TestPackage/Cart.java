package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {

	@FindBy(xpath="//button[@data-test-selector=\"cartLink\"]")private WebElement cart;
	@FindBy(xpath="//button[@id=\"truste-consent-button\"]")private WebElement accept;
	@FindBy(xpath="(//button[@data-test-selector=\"cartTotal_Checkout\"])[1]")private WebElement checkout;
	@FindBy(xpath="//input[@id=\"ldo084d8aakn50j-primary\"]")private WebElement radio;
	@FindBy(xpath="(//span[@class=\"TypographyStyle-sc-11lquxl szxHX\"])[1]")private WebElement placeorder;
	
	public Cart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickcat() throws InterruptedException {
		Thread.sleep(6000);
		cart.click(); 
	}
	public void clickaccept() {
		accept.click();
	}
	public void clickckeckout() throws InterruptedException {
		Thread.sleep(6000);
		checkout.click();
	}
	public void selectradio() throws InterruptedException {
		radio.isSelected();
		Boolean status = radio.isSelected();
		Thread.sleep(5000);
		System.out.println(status);
	}
	public void clickplaceorder() throws InterruptedException {
		Thread.sleep(6000);
		placeorder.click();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
