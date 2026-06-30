package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GrotechMindsiframe {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1=driver.findElement(By.id("chat-bot-launcher-button"));
		e1.click();
		WebElement iframe=driver.findElement(By.id("chat-bot-iframe"));
		driver.switchTo().frame(iframe);
		Thread.sleep(6000);
		WebElement name=driver.findElement(By.id("textInput"));
		name.sendKeys("snehal"+Keys.ENTER);
		driver.switchTo().defaultContent();
		Thread.sleep(6000);
		WebElement e2=driver.findElement(By.xpath("//ul[@id='menu-1-10edec5']/li[2]"));
		e2.click();
		/* 1st iframe Present		Parent Window			
		                          driver.switchTo().defaultContent();
			
           Parent Window		2nd iframe Present			
		                    driver.switchTo().frame(Parent iframe);
		
		               driver.switchTo().frame(Child iframe);
			
Parent Window		3rd iframe Present			
		               driver.switchTo().frame(Parent iframe);
			
		               driver.switchTo().frame(Child iframe);
			
		              driver.switchTo().frame(grandChild iframe);
			
					
2nd iframe Present		Parent Window			
		"		driver.switchTo().defaultContent();
"			
					
"2nd iframe Present			"		3rd iframe Present                        			
		"                driver.switchTo().frame(3rd iframe Present iframe);
"			
3rd iframe Present                        		2nd iframe Present                        			
		"                driver.switchTo().frame(2nd iframe Present                        );*/
		

	}

}
