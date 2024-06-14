package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements {

	@FindBy(xpath="//button[@data-test-selector=\"header_signIn\"]")private WebElement signin;
	@FindBy(xpath="//input[@data-test-selector=\"signIn_userName\"]")private WebElement username;
	@FindBy(xpath="//input[@id=\"password\"]")private WebElement pass;
	@FindBy(xpath="//button[@data-test-selector=\"signIn_submit\"]")private WebElement submit;
	@FindBy(xpath="//button[@class=\"StyledButton-sc-1y32st jQFvgg trigger\"]")private WebElement customer;
	@FindBy(xpath="//span[@aria-controls=\"3_Solutions & Services\"]")private WebElement SoluServ;
	@FindBy(xpath="//a[@href=\"/solutions/workspaces\"]")private WebElement OffAndWork;
	@FindBy(xpath="//a[text()='GET STARTED']")private WebElement GetStarted;
	@FindBy(xpath="//a[@class=\"close closeInitial\"]")private WebElement cross;
	@FindBy(xpath="//button[@id=\"truste-consent-button\"]")private WebElement accept;
	@FindBy(xpath="//div[text()='Conference Room']")private WebElement ConfRoom;
	
	public Elements(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clicksignin() { 
		signin.click();
	}
	public void senduser() {
		username.sendKeys("niteshkumar.bahekar@perficient.com");
	}
	public void sendpass() {
		pass.sendKeys("Pass1234");
	}
	public void clicksubmit() {
		submit.click();
	}
	public void clicksloution() throws InterruptedException {
		Thread.sleep(5000);
		SoluServ.click();
	}
	public void clickoffandwork() throws InterruptedException {
		Thread.sleep(3000);
		OffAndWork.click();
	}
	public void clickcross() throws InterruptedException {
		Thread.sleep(5000);
		cross.click();
	}
	
	public void clickaccept() {
		accept.click();
	}
	public void clickConfRoom() {
		ConfRoom.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
