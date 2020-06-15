package gethub;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Gethubclass {
	
	@Test

	public void openBrowers() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\alaud\\eclipse-workspace\\Jars\\chromedriver_win32\\geckodriver.exe"); 
		WebDriver driver = new FirefoxDriver(); //Creating an object of FirefoxDriver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Gethub"); //name locator for text box
		WebElement searchbutton = driver.findElement(By.name("btnK"));//name locator for google search
		searchbutton.click();
		driver.quit();

	}

}
