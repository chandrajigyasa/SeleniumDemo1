package gridpackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridDemo {
	
	public WebDriver driver;

	@Test
	public void verifylogin() throws MalformedURLException
	{
		DesiredCapabilities capabilities=DesiredCapabilities.chrome();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.WINDOWS);
		
	
	driver=new RemoteWebDriver(new URL("http://172.23.102.11:4455/wd/hub"),capabilities);
	
	driver.get("http://demowebshop.tricentis.com/login");
	System.out.println("hemanth");
	String title=driver.getTitle();
	System.out.println(title);
	driver.manage().window().maximize();
	driver.findElement(By.id("Email")).sendKeys("aishaoberoi@gmail.com");
	driver.findElement(By.name("Password")).sendKeys("123456");

}	
}
