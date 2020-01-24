package firstdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinks {
	public static void main(String[] args)
	{
	
		System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		List<WebElement>linklist=driver.findElements(By.tagName("a"));
		System.out.println("Number of links:" + linklist.size());
		
		for(int i=0;i<linklist.size();i++)
		{
			System.out.println("link names are:" +linklist.get(i).getText());
		}
		driver.close();
	}

}
