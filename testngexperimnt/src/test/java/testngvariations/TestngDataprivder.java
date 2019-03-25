package testngvariations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngDataprivder {

	public static WebDriver driver;

	@Test(dataProvider = "getdata")
	// @Test()
	public void rediffLogin(String username, String password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver (2).exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
		// input[@title='Sign in']

		Thread.sleep(5000);

		driver.quit();

	}

	@DataProvider
	public Object[][] getdata() {

		Object[][] data = new Object[2][2];

		data[0][0] = "sumit";
		data[0][1] = "pass";
		data[1][0] = "neha";
		data[1][1] = "nehap";

		return data;

	}
}