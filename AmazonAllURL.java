package classwork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAllURL {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
    driver.get("https://www.amazon.in");
    driver.manage().window().maximize();
    Thread.sleep(2000);
    List<WebElement>e1=driver.findElements(By.tagName("a")); 
    for(int i=0;i<e1.size();i++)
    {
    	  WebElement e2= e1.get(i);
    	  String s=e2.getText();
    	  String url=e2.getDomAttribute("href");
    	  System.out.println(url);
    	  System.out.println(s);
    }
	}

}
