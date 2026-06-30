package classwork;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FlipKartScreenshot {

	public static void main(String[] args) throws IOException {
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.flipkart.com");
	WebElement search=driver.findElement(By.name("q"));
	search.sendKeys("books"+Keys.ENTER);
	
	Date d1=new Date();
	System.out.println(d1.getTime());
	
	Date d2=new Date(d1.getTime());
	System.out.println(d2);
	String format1=d2.toString();
	String format2=format1.replace(":", "");
	System.out.println(format2);
	String format3=format2.substring(0,(format2.length()- 9));
	System.out.println(format3);
	
	TakesScreenshot ts=driver;//Upcasting
	File Source =ts.getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\AutomationTraining\\Automation\\Scfreenshot\\snehal"+new FlipKartScreenshot().getClass()+format3+".png");
	FileHandler.copy(Source, destination);
	
	
	
	}

}
