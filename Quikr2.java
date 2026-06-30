package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Quikr2 {

	public static void main(String[] args) throws InterruptedException {
	ChromeOptions options =new ChromeOptions();
	options.addArguments("disable-notifications");
	WebDriver driver = new ChromeDriver(options);
	
	Thread.sleep(3000);
    driver.get("https://www.quikr.com");
    driver.manage().window().maximize();
    Thread.sleep(3000);
    WebElement e1=driver.findElement(By.xpath("//label[text()='Login/Register']"));	
	e1.click();
	Thread.sleep(3000);
	WebElement e2=driver.findElement(By.xpath("//div[@class='nls_rightContainer']/descendant::div[@class='nls_formControl']/input"));	
	e2.sendKeys("7499815901");
	Thread.sleep(3000);
	WebElement e3=driver.findElement(By.xpath("//div[@class='nls_loaderContainer nls_continueBtn']"));	
	e3.click();
	Thread.sleep(3000);
	WebElement e4=driver.findElement(By.xpath("//div[@class='nls_formControl nls_formField'][2]/input"));	
   e4.sendKeys("snehal");
   Thread.sleep(3000);
	WebElement e5=driver.findElement(By.xpath("//div[@class='nls_formControl nls_formField'][3]/input"));	
  e5.sendKeys("snehalsolanke06@gmail.com");
  Thread.sleep(3000);
	WebElement e6=driver.findElement(By.xpath("//div[@class='nls_formControl']/input"));	
 e6.sendKeys("112233");
 WebElement e7=driver.findElement(By.xpath("//button[text()='Continue']"));	
 e7.click();
	}

}
