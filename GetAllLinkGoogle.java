package classwork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllLinkGoogle {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	List<WebElement>link=driver.findElements(By.tagName("a"));
	Thread.sleep(3000);
	for(int i=0;i<link.size();i++)
	{
		WebElement e1=link.get(i);
		String s1=e1.getText();
		System.out.println(s1);
	}
	}

}
