package classwork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OLX {

	public static void main(String[] args) throws InterruptedException {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("disable-notifications");
	ChromeDriver driver =new ChromeDriver(options);
	driver.get("https://www.olx.in");
	driver.manage().window().maximize();
	
	Thread.sleep(3000);	
	WebElement e1=driver.findElement(By.xpath("//div[@data-aut-id='searchBox']/descendant::div/input[@type='text']"));
	e1.sendKeys("car" +Keys.ENTER);
	
	Thread.sleep(3000);	
	WebElement e2=driver.findElement(By.xpath("//div[@class='_2CyHG']/div/child::div[2]/ul/li[1]"));
	e2.click();
    

	}

}
