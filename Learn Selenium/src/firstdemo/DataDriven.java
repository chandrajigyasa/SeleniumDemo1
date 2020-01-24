package firstdemo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven {
	public static void main(String[] args) throws IOException, Exception {

		System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		FileInputStream fis=new FileInputStream("E:\\datadriventesting\\LoginCredentials.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);

		int rowcount=sheet1.getLastRowNum();

		for(int i=0;i<=rowcount;i++)
		{
			String username=sheet1.getRow(i).getCell(0).getStringCellValue();
			String password=sheet1.getRow(i).getCell(1).getStringCellValue();
	
			driver.get("http://demowebshop.tricentis.com/login");
			driver.manage().window().maximize();
	
			driver.findElement(By.id("Email")).sendKeys(username);
			driver.findElement(By.id("Password")).sendKeys(password);

			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	
			Thread.sleep(5000);
			driver.findElement(By.linkText("Log out")).click();
		}
		wb.close();
		driver.close();
	}
}
