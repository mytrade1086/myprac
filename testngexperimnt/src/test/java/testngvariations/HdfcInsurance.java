//used chromeoptions, javascript executor , windowhandles,iterator

package testngvariations;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HdfcInsurance {
	public static WebDriver driver;

	@Test
	public void hdfcnavigation() throws InterruptedException {

		// ###Added below for disabling Allow Block Pop up of Chrome########
		// Create a map to store preferences
		Map<String, Object> prefs = new HashMap<String, Object>();
		// add key and value to map as follow to switch off browser notification
		prefs.put("profile.default_content_setting_values.notifications", 2);
		// Create an instance of ChromeOptions
		ChromeOptions options = new ChromeOptions();
		// set ExperimentalOption - prefs
		options.setExperimentalOption("prefs", prefs);

		// ###for disabling Allow Block Pop up of Chrome########

		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver (2).exe");
		driver = new ChromeDriver(options);

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://onlineinsurance.hdfclife.com/");

		driver.findElement(By.xpath("//a[text()='HDFC Life Click 2 Protect 3D Plus']")).click();

		String mainwindow = driver.getWindowHandle();
		Set<String> wh = driver.getWindowHandles();
		Iterator<String> ch = wh.iterator();

		while (ch.hasNext()) {

			String currenthandle = ch.next();

			if (currenthandle.equals(mainwindow)) {

			} else {

				driver.switchTo().window(currenthandle);

				WebDriverWait wait = new WebDriverWait(driver, 50);
				wait.until(ExpectedConditions.jsReturnsValue("return document.readyState==\"complete\";"));

				driver.findElement(By.xpath("//div[@class='customInput']//input[@placeholder='First Name']"))
						.sendKeys("love");
				driver.findElement(By.xpath("//div[@class='customInput']//input[@id='lName']")).sendKeys("rau");

				driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9766847579");
				driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys(Keys.TAB);
				driver.findElement(By.xpath("//div[@class='customInput']//input[@id='emailID']")).sendKeys("s@s.com");
<<<<<<< HEAD
=======

				 JavascriptExecutor executor = (JavascriptExecutor) driver;
				// executor.executeScript("document.getElementsById(‘emailID’).value=’Avinash
				// Mishra’;");

				// executor.executeScript("document.getElementById("emailID").value='new
				// value')"/
				 
				//  js.executeScript("document.getElementById('some id').value='someValue';");

				

>>>>>>> branch 'master' of https://github.com/mytrade1086/myprac
				driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("10111986");
				driver.findElement(By.xpath("//input[@id='dob']")).sendKeys(Keys.TAB);

				JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("window.scrollBy(0,100)");
				// js.executeScript("document.getElementById('some id').value='someValue';");

				driver.findElement(By.xpath("//input[@placeholder='City']")).sendKeys("Mumbai");
				driver.findElement(By.xpath("//input[@placeholder='City']")).sendKeys(Keys.TAB);
				Thread.sleep(3000);
				driver.findElement(By.xpath("//span[contains(text(),'Proceed')]")).click();

			}
		}

		driver.quit();

	}

}
