package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apollo {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.apollopharmacy.in/");
	driver.manage().window().maximize();
	Thread.sleep(6000);
	WebElement e1=driver.findElement(By.cssSelector("<img id=\"imageOnlyPopup\" src=\"https://d1510fwumr3byl.cloudfront.net/dist/1604910976/i/df35279e7c934b8396ff4f0358b3fcd1.jpeg?v=1771224960\" alt=\"Please upload a picture\" style=\"visibility: visible; width: 464.31px;\">"));
    e1.click();
	}

}
//div[@id='container']
//div[@id='close']
///html/body/div[5]/ct-web-popup-imageonly//div/div[2]/div/svg