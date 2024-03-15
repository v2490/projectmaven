package testClasses;

import java.time.Duration;

//import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("http://testfire.net/login.jsp");
		driver.findElement(By.id("uid")).sendKeys("jsmith");
		Thread.sleep(1000);
		driver.findElement(By.name("passw")).sendKeys("demo1234");
		driver.findElement(By.name("btnSubmit")).click();
		Thread.sleep(3000);
		driver.getTitle();
		driver.getCurrentUrl();
		driver.quit();
	}

}
