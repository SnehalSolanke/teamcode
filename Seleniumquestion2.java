package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumquestion2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.hopscotch.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement e1=driver.findElement(By.xpath("//span[@class='float-right account-update']"));
		e1.click();
		WebElement e2=driver.findElement(By.xpath("//Button[text()='SIGN IN']"));
		e2.click();
		Thread.sleep(5000);
		WebElement e3=driver.findElement(By.xpath("//a[@class='css-1tg3gbc']"));
		e3.click();
		Thread.sleep(5000);
		WebElement e4=driver.findElement(By.xpath("//input[@type='text']"));
		e4.sendKeys("Snehal");
		Thread.sleep(5000);
		WebElement e5=driver.findElement(By.xpath("//input[@type='email']"));
		e5.sendKeys("snehalsolanke01@gmail.com");
		Thread.sleep(5000);
		WebElement e6=driver.findElement(By.xpath("//input[@type='number']"));
		e6.sendKeys("7499815901");
		Thread.sleep(5000);
		WebElement e7=driver.findElement(By.xpath("//button[@type='submit']"));
		e7.click();
		
	}

}
