package firstdemo;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jDemo {
	
	public static void main(String[] args)
	{
		Logger log=Logger.getLogger(Log4jDemo.class);
		System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.com/");
	
	log.info("Application started successfully");
	String expectedtitle="Google";
	String actualtitle=driver.getTitle();
	
	log.warn("check title");
	
	if(expectedtitle.equals(actualtitle))
	{
		System.out.println("Correct title");
		
		log.info("Correct page");
		driver.close();
		}
	else
	{
		System.out.println("Incorrect title");
		driver.close();
	}
	}
}
