package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tools {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Jar files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("file:///E:/Jar%20files/tools.html");
		driver.manage().window().maximize();
	String toolname= driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]")).getText();
	System.out.println("the tool name is:"+toolname);
	String toolname1= driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[3]")).getText();

	System.out.println("the tool is:"+toolname1);
	}

}
