package FirstTest;

import static org.testng.Assert.assertEquals;

import java.awt.Window;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class LaunchBrowser {
	
	
	
	@Test
	public void launchBrowser() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E://drivers//Firefox//geckodriver.exe");
		// WebDriverManager.Chromedriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		System.out.println(driver.getTitle());

		String actual = driver.getTitle();
		Assert.assertEquals("Google", actual);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("jenkins login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='btnK']")).click();
		Thread.sleep(3000);
//		 driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']")).click();
//		 Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,400)");
		Thread.sleep(3000);

		driver.quit();
		 
		
	}

}
