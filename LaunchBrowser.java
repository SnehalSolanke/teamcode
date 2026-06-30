package classwork;

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
	//1. Launch the Browser window
	ChromeDriver driver =new ChromeDriver();
	//2.minimise browser window
	Thread.sleep(6000);
	driver.manage().window().minimize();
	//3. Maximize to specific Resolution(430*932)
	driver.manage().window().setSize(new Dimension(430,932));
	//4. Maximize the Browser window
	driver.manage().window().maximize();
	//5.Delete all browser cookie
	driver.manage().deleteAllCookies();
	//6.Enter the URL & Launch the application
	driver.get("https://www.google.co.in");
	//7.Verify the application title
	String title=driver.getTitle();
	System.out.println(title);
	//8.to get URL
	String url=driver.getCurrentUrl();
	System.out.println(url);
	//9.launch new tab & launch the application in new tab
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://wwww.amazon.com");
	//10.id of parent window
	String pid=driver.getWindowHandle();
	System.out.println(pid);
	//11. id of parent-child window
	Set<String>pcid=driver.getWindowHandles();
	System.out.println(pcid);
	//10.to close current window
	driver.close();
	//11. To close all window
	driver.quit();
	
	
	

	}

}
