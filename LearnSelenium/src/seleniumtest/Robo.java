package seleniumtest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robo {

	
	public class WordFileRobo {
	    public void main(String[] args) throws AWTException {
	        System.setProperty("webdriver.chrome.driver", "E:\\Jar files\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://smallpdf.com/word-to-pdf");
	        driver.manage().window().maximize();
	        
	        Robot robot=new Robot();
	        
	        driver.findElement(By.xpath("//span[@class='sc-1rkezdt-7 cxlSWI']")).click();
	        robot.setAutoDelay(3000);
	        
	        StringSelection stringselect=new StringSelection("E:sample-docx-file-for-testing.docx");
	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselect, null);
	        
	        robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_V);
	        
	
	robot.keyRelease(KeyEvent.VK_CONTROL);
	        robot.keyRelease(KeyEvent.VK_V);
	        //robot.setAutoDelay(1000);
	        
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.keyRelease(KeyEvent.VK_ENTER);
	        
	    }
	}



}
