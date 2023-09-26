package project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class Website{


	public static void Websitemethod() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\kanishka\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://shop.ttkprestige.com/");
		WebElement Search = driver.findElement(By.id("search"));
		Search.click();
		Search.sendKeys("Oven");
		Search.sendKeys(Keys.ENTER);
		driver.manage().window().maximize();
		JavascriptExecutor SD = (JavascriptExecutor) driver;
		SD.executeScript("window.scrollBy(0,750)", "");
				WebElement Oven = driver.findElement(By.xpath("(//strong[@class='product name product-item-name'])[5]"));
				Oven.click();
				
				
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

			
			driver.quit();

}
}
