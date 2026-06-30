package classwork;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ClearTripRoundWayTicket {

	public static void main(String[] args) throws InterruptedException, IOException {
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.cleartrip.com");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement crossicon=driver.findElement(By.xpath("(//div[@data-testid='loginPopup']/div/div)[2]/child::*/child::*"));
	crossicon.click();
	WebElement wherefrom=driver.findElement(By.xpath("//input[@placeholder='Where from?']"));
	wherefrom.click();
	WebElement dropdown1=driver.findElement(By.xpath("(//div[@class='dropdown']/ul)[1]"));
	dropdown1.click();
	WebElement whereto=driver.findElement(By.xpath("//input[@placeholder='Where to?']"));
	whereto.click();
	WebElement dropdown2=driver.findElement(By.xpath("(//div[@class='dropdown']/ul)[2]"));
	dropdown2.click();
	WebElement calender=driver.findElement(By.xpath("//div[@data-testid='dateSelectOnward']/div/child::*"));
	calender.click();
	WebElement rightarrow=driver.findElement(By.xpath("(//div[@class='DayPicker-wrapper']/div/div)[2]/child::*"));
	rightarrow.click();
	WebElement date=driver.findElement(By.xpath("(//div[@class='Day-grid flex flex-middle flex-column flex-top'])[44]"));
	date.click();
	WebElement returnway=driver.findElement(By.xpath("//span[text()='Return']"));
	returnway.click();
	WebElement rightarrow1=driver.findElement(By.xpath("(//div[@class='DayPicker-wrapper']/div/div)[2]/child::*"));
	rightarrow1.click();
	//WebElement returndate=driver.findElement(By.xpath("(//div[@class='Day-grid flex flex-middle flex-column flex-top'])[52]"));
	//returndate.click();
	List<WebElement> dates=driver.findElements(By.xpath("(//div[@class='Day-grid flex flex-middle flex-column flex-top']"));
	dates.get(51).click();
	WebElement searchflight=driver.findElement(By.xpath("//h4[text()='Search flights']"));
	searchflight.click();
	
	//take screenshot
	Date d1=new Date();
	System.out.println(d1.getTime());
	Date d2=new Date(d1.getTime());
	System.out.println(d2);
	String format=d2.toString();
	System.out.println(format);
	String format1=format.replace(":", "");
	System.out.println(format1);
	String format2=format1.substring(0, format1.length()-9);
	System.out.println(format2);
	
	TakesScreenshot ts= (TakesScreenshot) driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\AutomationTraining\\Automation\\Screenshot\\snehal_"+ new ClearTripRoundWayTicket().getClass()+format2+".png");
	FileHandler.copy(source, destination);
	
			
	
	
	
	
	}

}
