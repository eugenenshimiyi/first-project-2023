package variousconcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnlogin {
	WebDriver driver;

	@Before

	public void init() {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://codefios.com/ebilling/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
   
	@Test
	
	public void testLogin() 
	{
		
		 WebElement USER_NAME_ELEMENT=driver.findElement(By.xpath("//*[@id=\"user_name\"]"));
		 WebElement PASSWORD_ELEMENT=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		 WebElement SIGNIN_BUTTON_ELEMENT=driver.findElement(By.xpath("//*[@id=\"login_submit\"]"));
		 
		//By USER_NAME_FIELD=By.xpath("//*[@id=\"user_name\"]");
		//By PASSWORD=By.xpath("//*[@id=\"password\"]");
		//By SIGNIN_BUTTON_FIELD=By.xpath("//*[@id=\"login_submit\"]");
		
		//driver.findElement(By.xpath("//*[@id=\"user_name\"]")).sendKeys("demo@codefios.com");
		//driver.findElement(SIGNIN_BUTTON_FIELD).sendKeys("demo@codefios.com");
		
		USER_NAME_ELEMENT.sendKeys("demo@codefios.com");
		PASSWORD_ELEMENT.sendKeys("abc123");
		SIGNIN_BUTTON_ELEMENT.click();
		
		

	}
}