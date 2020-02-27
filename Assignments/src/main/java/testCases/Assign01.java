package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//rupakshi 1
public class Assign01 {
	ChromeDriver driver = null;

	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Softwares\\Executables\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://qatechhub.com");
		driver.manage().window().maximize();
	}

	@Test
	public void valiation() {

		// driver = new ChromeDriver();
		//WebElement Cancel= driver.findElement(By.className("tcb-icon"));
		//Cancel.click();
		String Title = driver.getTitle();
		System.out.println(Title);
		Assert.assertEquals(Title, "QA Automation Tools Trainings and Tutorials | QA Tech Hub", "Test Case Passed");
	driver.get("https://www.facebook.com");
	driver.navigate().back();
	System.out.println(driver.getCurrentUrl());
	driver.navigate().forward();
	driver.navigate().refresh();
	}
	/*
	 * @AfterTest 
	 * public void close() {
	 * 
	 * driver.quit(); }
	 */
}