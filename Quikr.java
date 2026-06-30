package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Quikr {

	public static void main(String[] args) throws InterruptedException {
	
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(options);
	Thread.sleep(3000);
	driver.get("https://www.quikr.com");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement e1=driver.findElement(By.xpath("//a[@id='searchedCat']"));	
	e1.click();
	
	Thread.sleep(8000);
	WebElement jobs=driver.findElement(By.xpath("/html/body/header/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/ul/li[7]/a"));	
	jobs.click();
	
	Thread.sleep(3000);
	WebElement searchbox=driver.findElement(By.xpath("//form[@id='searchFormIndex']/input[@type='text']"));	
	searchbox.sendKeys("testing"+Keys.ENTER);
	
	WebElement result1=driver.findElement(By.xpath("//div[@class='jsListItems']/child::div[4]"));	
	result1.click();
	
	WebElement apply=driver.findElement(By.xpath("//div[@class='sc-11567zh-7 caxyCE']/div/div/button[text()='APPLY']"));	
	apply.click();
	
	WebElement name=driver.findElement(By.xpath("//input[@class='sc-d99ta8-3 bghBxR w100 outN']"));	
	name.sendKeys("snehal");
	
	//div[@class='jsListItems']/child::div[4]
	////div[@class='drop-layers cate-layer']/ul/child::li[7]/

	}

}
