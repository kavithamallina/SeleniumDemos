


	package seleniumtest;

	import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

	public class DemoRegister {

		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "E:\\Jar files\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("http://demo.automationtesting.in/Register.html");
			driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Lalitha");
			driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Mallina");
	        driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys("Ramchandranagar,vskp ");
	      driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required']")).sendKeys("kavithamallina997@gmail.com");
			driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-pattern']")).sendKeys("6304944829");
	      //driver.findElement(By.xpath("//label[2]//input[1]")).click();
			driver.findElement(By.xpath("//*[@name='radiooptions' and @value='FeMale']")).click();
	     // driver.findElement(By.id("checkbox2")).click();
			//driver.findElement(By.xpath("//input[@class='checks' and @value='Cricket' and @value='Movies']")).click();
			
			List<WebElement>cb=driver.findElements(By.xpath("//input[@type='checkbox']"));
			for(int i=0;i<cb.size();i++)
			{
				cb.get(i).click();
			}
	      
	      
	   //  driver.findElement(By.xpath("//div[@id='msdd']")).click();
	     // driver.findElement(By.xpath("//div[contains(text(),'Catalan')]")).click();
	      
	      driver.findElement(By.xpath("//div[@id='msdd']")).click();
	      driver.findElement(By.xpath("//a[contains(text(),'English')]")).click();
	     
	      driver.findElement(By.xpath("//a[contains(text(),'Czech')]")).click();

	      
	      
	      Select Skills= new Select (driver.findElement(By.id("Skills")));
	      Skills.selectByVisibleText("C");    
	      Skills.selectByIndex(9);
	      
	      
	      Select Country= new Select (driver.findElement(By.id("countries")));
	      Country.selectByVisibleText("Albania");    
	      Country.selectByIndex(3);
	      
	     // driver.findElement(By.id("yearbox")).sendKeys("1997");
	      //driver.findElement(By.xpath("//select[@placeholder='Month']")).sendKeys("March");
	      //driver.findElement(By.id("daybox")).sendKeys("5");
	      
	     /* Select year= new Select(driver.findElement(By.id("yearbox")));
	      year.selectByIndex(89);
	      driver.findElement(By.xpath("//select[@placeholder='Month']")).sendKeys("March");
	      driver.findElement(By.id("daybox")).sendKeys("5");
	  */    
	     
	      WebElement year= driver.findElement(By.xpath("//select[@id='yearbox']"));
	      Select year1= new Select(year);
	      year1.selectByIndex(89);
	      
	      List<WebElement> yearcount= year1.getOptions();
	       System.out.println(yearcount.size());
	       for(int i=0;i< yearcount.size();i++)
	    	   System.out.println(yearcount.get(i).getText());
	       
	       WebElement month= driver.findElement(By.xpath("//select[@placeholder='Month']"));
		      Select se1= new Select(month);
		      se1.selectByVisibleText("October");
	       
	      
	       List<WebElement> monthcount= se1.getOptions() ;
	       System.out.println(monthcount.size());
	       for(int j=0;j< monthcount.size();j++)
	    	   System.out.println(monthcount.get(j).getText());
	       
	       
	       WebElement day= driver.findElement(By.id("daybox"));
		      Select se2= new Select(day);
		      se2.selectByValue("Sunday");
		      
		      
		      
		      List<WebElement> daycount= se2.getOptions() ;
		       System.out.println(daycount.size());
		       for(int j=0;j< daycount.size();j++)
		    	   System.out.println(daycount.get(j).getText());
	        
	      
	      
	      
	      
	      driver.findElement(By.id("firstpassword")).sendKeys("Kavitha@5");
	      driver.findElement(By.id("secondpassword")).sendKeys("Kavitha@5");
	      
	      driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
	      //driver.findElement(By.id("Button1")).click();
	      

	      
	      

		}

	}




