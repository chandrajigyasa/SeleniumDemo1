package firstdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/login");
	
driver.manage().window().maximize();
driver.findElement(By.id("Email")).sendKeys("aishaoberoi@gmail.com");
driver.findElement(By.name("Password")).sendKeys("123456");
driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	String expectedname="Demowebstore";
	String actualname=driver.getTitle();
			
	System.out.println("actualname");
	if(expectedname.equals(actualname))
	{
		System.out.println("U are on correct page");
	}
	else
	{
		System.out.println("Incorrect page");
	}
	driver.close();
}
}
