package githubproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class invokebrowser {
	
	@Test
	public void test()
	{
	//	System.setProperty("webdriver.chrome.driver", ".//src/main///resources//chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new HtmlUnitDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	String title=driver.getTitle();
	System.out.println(title);
	}
	

}
