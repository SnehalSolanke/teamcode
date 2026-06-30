package classwork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAutosuggestion {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
    driver.get("http://www.Amazon.in");
    driver.manage().window().maximize();
    Thread.sleep(3000);
    WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
    e1.sendKeys("Books");
    Thread.sleep(3000);
   List<WebElement>e2= driver.findElements(By.xpath("//div[@role='rowgroup']/div/div"));
  int count =e2.size();
  System.out.println(count);
  Thread.sleep(3000);
  e2.get(count-2).click();
  
	}

}
