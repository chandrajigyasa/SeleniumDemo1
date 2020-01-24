package firstdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/login");
	driver.findElement(By.xpath("//a[@class='ico-register']")).click();
Thread.sleep(4000);
driver.navigate().back();
Thread.sleep(4000);
driver.navigate().forward();
Thread.sleep(4000);
driver.navigate().to("https://demowebshop.tricentis.com/");
Thread.sleep(4000);
driver.navigate().refresh();
Thread.sleep(4000);

	
driver.manage().window().maximize();


}
}
