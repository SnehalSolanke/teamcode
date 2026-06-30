package classwork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tata1mgAddtocart {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.1mg.com/");
		driver.manage().window().maximize();
		Thread.sleep(8000);
		//click on cross icon on popup
	    WebElement e1=driver.findElement(By.xpath("//div[@class='mX-20 mY-16 flex justifyBetween']/div[@class='flex alignCenter ']/button"));
	    e1.click();
		WebElement search1=driver.findElement(By.xpath("//input[@id='search-medicine']"));
		search1.sendKeys("evion" + Keys.ENTER);
		Thread.sleep(3000);
		WebElement e3=driver.findElement(By.xpath("//div[text()='Evion 400mg Capsule | Helps Repair & Protect Muscles']"));
		e3.click();
		Thread.sleep(3000);
		WebElement e4=driver.findElement(By.xpath("//div[text()='Add to cart']"));
		e4.click();
		Thread.sleep(3000);
		/*WebElement iframe=driver.findElement(By.id("goog_plcm_frame"));
		driver.switchTo().frame(iframe);
		Thread.sleep(3000);*/
		WebElement e5=driver.findElement(By.xpath("//ul[@class='CartCounterPopUp__list-cart-summary___a1fvN']/li[3]/a"));
		e5.click();
		Thread.sleep(3000);
		WebElement e6=driver.findElement(By.xpath("//div[@class='flex padding-8-0 container-fluid CartPage__pageHeight__kPppL']/descendant::div[@class='CartPage__stickyFooter__KCA6P']/descendant::div[@class='marginTop-8 col-8']/button"));
		e6.click();
		WebElement e7=driver.findElement(By.xpath("//input[@id='phone']"));
		e7.sendKeys("7499815901");
		WebElement e8=driver.findElement(By.xpath("//button[@aria-label='Send OTP']"));
		e8.click();
		
	}

}
