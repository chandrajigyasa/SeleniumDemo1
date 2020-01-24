package firstdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/login");
	
driver.manage().window().maximize();
driver.findElement(By.id("FirstName")).sendKeys("aisha");
driver.findElement(By.id("LastName")).sendKeys("oberoi");
driver.findElement(By.id("Email")).sendKeys("aishaoberoi@gmail.com");
driver.findElement(By.name("Password")).sendKeys("123456");
driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}

}
