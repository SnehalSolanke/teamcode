package classwork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazoncountAlllinkClickonfirst {

	public static void main(String[] args) {
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.google.com");
	List<WebElement>list=driver.findElements(By.tagName("a"));
	WebElement e1=list.get(0);
	String s=e1.getText();
	System.out.println(s);
	e1.click();

	}

}
