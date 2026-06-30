package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookloginbyname {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
    WebElement e1=driver.findElement(By.name("email"));
    e1.sendKeys("snehalsolanke123");
   WebElement e2= driver.findElement(By.name("pass"));
   e2.sendKeys("snhe123"+Keys.ENTER);
   
	
	
	}

}
