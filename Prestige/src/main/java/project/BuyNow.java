package project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class BuyNow extends Website{
public static WebDriver driver;

	public static void BuyNowmethod() throws InterruptedException {
	
	
		WebElement BuyNow = driver.findElement(By.id("buy-now"));
		BuyNow.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@data-role='proceed-to-checkout']")).click();
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"customer_mobiles\"]"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value = '8939369448'", element);

		driver.findElement(By.name("firstname")).sendKeys("Kanishka");
		driver.findElement(By.name("lastname")).sendKeys("S");
		driver.findElement(By.name("custom_attributes[email]")).sendKeys("kanishsarov05@gmail.com");
		driver.findElement(By.name("street[0]")).sendKeys("Kavarapalayam");
		Select drpState = new Select(driver.findElement(By.name("region_id")));
		drpState.selectByVisibleText("Tamil Nadu");
		driver.findElement(By.name("city")).sendKeys("Chennai");
		driver.findElement(By.name("postcode")).sendKeys("600054");
		driver.findElement(By.name("telephone")).sendKeys("8939369448");

	}

}
