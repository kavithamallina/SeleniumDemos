package seleniumtest;

//import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excercise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Jar files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
		
		String c= driver.getTitle();
		System.out.println(c);
		//System.out.println(sizeof(c));
		System.out.println("length of the tile is:"+c.length());
		String link= driver.getCurrentUrl();
		System.out.println(link);
		String link1= "http://demowebshop.tricentis.com/login";
		
		
		if(link.equals(link1)){
			System.out.println("correct page");
			
		}
		else{
			System.out.println("incorrect page");
		}
		
		String s=driver.getPageSource();
		System.out.println(s);
		
		System.out.println(s.length());
		
		
}

	//driver.findElement(By.className("ico-logout")).click();
	//driver.close();

}
