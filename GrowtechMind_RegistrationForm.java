package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GrowtechMind_RegistrationForm {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://grotechminds.com/registeration-form/");
	driver.manage().window().maximize();
	WebElement e1=driver.findElement(By.id("firstName"));
	e1.sendKeys("snehal");
	WebElement e2=driver.findElement(By.id("lastName"));
	e2.sendKeys("solanke");
	WebElement e3=driver.findElement(By.id("email"));
	e3.sendKeys("snehal123@gmail.com");
	WebElement e4=driver.findElement(By.id("phone"));
	e4.sendKeys("7654225789");
	WebElement e5=driver.findElement(By.xpath(("(//select[@id='gender'])[1]")));
	Select s= new Select(e5);
	s.selectByValue("female");
	

	}

}
