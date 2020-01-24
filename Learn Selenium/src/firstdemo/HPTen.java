package firstdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HPTen {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://practice.automationtesting.in/test-cases/");
	driver.findElement(By.xpath("//a[contains(text(),'Shop')]")).click();
	

}
}
