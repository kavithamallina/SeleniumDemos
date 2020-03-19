package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigationDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Jar files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		driver.navigate().back();
		Thread.sleep(5);
		driver.navigate().forward();
		driver.navigate().to("http://demowebshop.tricentis.com/login");
		driver.navigate().refresh();
		driver.quit();

	}	

}
