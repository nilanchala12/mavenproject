package mavenPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	@Test
	public void Login()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebElement user=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		user.sendKeys("Admin");
		
		WebElement psswd=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		psswd.sendKeys("admin123");
		
		WebElement submit=driver.findElement(By.xpath("//input[@id='btnLogin']"));
		submit.click();
		
		driver.close();
		
	}
	
	
	

}
