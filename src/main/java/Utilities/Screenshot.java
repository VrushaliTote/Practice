package Utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	
	public void SnapShot(WebDriver driver) throws IOException {
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Selenium\\shot1.jpeg");
		FileHandler.copy(source, destination);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
