package seleniumtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Jar files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		
		List<WebElement> links= driver.findElements(By.tagName("div"));
		System.out.println("no.of links"+links.size());
		
		for(int i=0;i<links.size();i++)
		{
			System.out.println("link name is "+links.get(i).getText());
		}
		driver.close();

	}

}
