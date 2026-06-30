package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement searchtextbox=driver.findElement(By.id("twotabsearchtextbox"));
		searchtextbox.sendKeys("watches");//for entering product name
		WebElement s1=driver.findElement(By.id("nav-search-submit-button"));
		s1.click();//for clicking on Enter
		
	}

}
