package classwork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllLinksAmazon {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	List<WebElement>e1=driver.findElements(By.tagName("a"));
	Thread.sleep(3000);
	for(int i=0;i<e1.size();i++)
	{
		WebElement e2=e1.get(i);
		String s=e2.getText();
		System.out.println(s);
	}

	}

}
