//package firstdemo;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class RegistrationDemo {
//	public static void main(String[] args)
//	{
//		System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
//	WebDriver driver=new ChromeDriver();
//	driver.get("http://demo.automationtesting.in/Register.html");
//	
//driver.manage().window().maximize();
//driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("aishaoberoi");
//driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]")).sendKeys("Anantpur,Hyderabad");
//driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required']")).sendKeys("aishaoberoi@gmail.com");
//driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-invalid ng-invalid-required ng-valid-pattern ng-touched']")).sendKeys("9873093070");
//driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
//driver.findElement(By.xpath("//input[@name='radiooptions' and @ value=FeMale]"));
//WebElement year=driver.findElement(By.xpath("//select()"))
//	}
//}
