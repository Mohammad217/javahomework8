package gethub;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Gethubclass {
	
	@Test

	public void openBrowers() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\alaud\\eclipse-workspace\\Jars\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 System.out.println(driver.getCurrentUrl());
	     System.out.println(driver.getTitle());
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("facebook"); 
		WebElement searchbutton = driver.findElement(By.name("btnK"));
		searchbutton.click();
		driver.quit();

	}

}
