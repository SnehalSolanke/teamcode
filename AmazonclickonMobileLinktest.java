package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//launch Amazon and click on mobiles
public class AmazonclickonMobileLinktest {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
	driver.get("https:www.amazon.in");
	Thread.sleep(3000);
	WebElement e1=driver.findElement(By.linkText("Mobiles"));
	e1.click();
	

	}

}
