package seleniumtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sync {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Jar files\\chromedriver.exe");
		//driver.manage().window().maximize();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		WebDriverWait mywait = new WebDriverWait(driver,10);
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='welcome']")));
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		
		driver.findElement(By.xpath("//b[contains(text(),'Recruitment')]")).click();
		driver.findElement(By.xpath("//b[contains(text(),'Recruitment')]//parent::a//parent::li//preceding-sibling::li[1]//child::a//child::b[contains(text(),'Time')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Time')]//parent::li//parent::ul//preceding-sibling::a//parent::li//preceding-sibling::li[1]//child::a//child::b[contains(text(),'Leave')]")).click();
		driver.findElement(By.xpath("//b[contains(text(),'Leave')]//parent::a//parent::li//parent::li//preceding-sibling::li//child::a")).click();
		WebDriverWait mywait1 = new WebDriverWait(driver,10);
		mywait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Logout')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		driver.close();

		

	}

}
