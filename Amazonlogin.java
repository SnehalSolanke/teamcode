package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Amazon login by Relative xpath
public class Amazonlogin {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
    driver.manage().window().maximize();
	WebElement e1=driver.findElement(By.xpath("//input[@name='email']"));
    e1.sendKeys("snehalsolanke01@gmail.com");
    
   WebElement e2= driver.findElement(By.xpath("//input[@type='submit']"));
   e2.click();
   
  WebElement e3= driver.findElement(By.xpath("//input[@type='password']"));
  e3.sendKeys("asdf12456");
  
  WebElement e4= driver.findElement(By.xpath("//input[@class='a-button-input']"));
  e4.click();
  
	}

}
