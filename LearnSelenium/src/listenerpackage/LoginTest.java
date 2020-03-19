package listenerpackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//@Listeners({listenerpackage.ListenerImplementationdemo.class})

public class LoginTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Jar files\\chromedriver.exe");
		//driver.manage().window().maximize();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		//Int size = driver.findElements(By.tagName("iframe")).size();
		driver.findElement(By.id("Email")).sendKeys("kavithamallina997@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Kavitha2202");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
		String expectedresult= "Demo Web shop";
		String actualresult=driver.getTitle();
		
		
		if(expectedresult.equals(actualresult)){
			System.out.println("correct page");
		}
		else{
			System.out.println("incorrect page");
		}
		driver.findElement(By.className("ico-logout")).click();
		driver.close();
	}

}
