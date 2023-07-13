package FirstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Spicejet {
	

	@Test
		public void spiceJetOneWaytrip() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E://drivers//Firefox//geckodriver.exe");
		// WebDriverManager.Chromedriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='round trip']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='one way']")).click();
		
		driver.findElement(By.xpath("//div[text()='From']")).sendKeys("Hyderabad");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='To']")).sendKeys("Jammu");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Departure Date']")).click();
		
		driver.close();
}
}