package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Assign07 {
	WebDriver driver = null;

	@Test
	public void dragAndDrop() {
		System.setProperty("webdriver.gecko.driver",
				"D:\\Softwares\\Executables\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();

		String URL = "http://jqueryui.com/droppable/";
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// WebDriverWait wait = new WebDriverWait(driver,30);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(
		driver.switchTo().parentFrame();
		driver.findElement(RelativeLocator.withTagName("p").below(By.xpath("/html[1]/body[1]/div[1]/p[1]"))).click();
		 
//				 By.tagName("//*[@id=\"draggable\"]").ab)
	
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/p[1]")).click();
//	WebElement To= driver.findElement(By.id("droppable"));

		/*
		 * Actions action = new Actions(driver); action.dragAndDropBy(From, 150,
		 * 18).build().perform();
		 */
	}
}