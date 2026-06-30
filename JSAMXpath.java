package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAMXpath {
//Xpath for username
	public static void main(String[] args) {
	ChromeDriver driver =new ChromeDriver();
	driver.get("C:\\Users\\Lenovo\\Downloads\\learningHTML1.html");
    WebElement e1=driver.findElement(By.xpath("(/html/body/input)[1]"));
    e1.sendKeys("snehal");
	}

}
