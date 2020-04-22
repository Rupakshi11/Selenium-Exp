package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Assign02 {

	WebDriver driver = null;

	@Test
	public void fblogin() {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Softwares\\Executables\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String URL = driver.getCurrentUrl();
		// System.out.println(URL);
		Assert.assertEquals(URL, "https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/div[1]/h2"));
		driver.findElement(By.name("firstname")).sendKeys("Rashi");
		driver.findElement(By.name("lastname")).sendKeys("Saxena");
		WebElement Numb = driver.findElement(By.name("reg_email__"));
		Numb.sendKeys("880978352");
		Numb.clear();
		Numb.sendKeys("9876543212");
		driver.findElement(By.name("reg_passwd__")).sendKeys("12345678abc!");
		Select Month = new Select(driver.findElement(By.id("month")));
		Month.selectByIndex(4);
		Select Day = new Select(driver.findElement(By.id("day")));
		Day.selectByIndex(11);

		Select Year = new Select(driver.findElement(By.name("birthday_year")));
		Year.selectByValue("1990");

		WebElement Gender = driver.findElement(By.xpath("//*[@id=\"u_0_6\"]"));
		Gender.click();
		driver.findElement(By.name("websubmit")).click();
	}

	@AfterTest
	public void browser() {
		driver.quit();
	}

}