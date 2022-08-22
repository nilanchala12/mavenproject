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
		driver.get("https://docs.google.com/document/d/1XB2d4kTzhvmMrvYMgy53AzM4q9iDAxQq7pZ69a2IJjs/edit");
		driver.manage().window().maximize();
		
		driver.close();
		
	}
	
	
	

}
