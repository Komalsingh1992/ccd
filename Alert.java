package NORMAL;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.name("cusid")).sendKeys("535");
		driver.findElement(By.name("submit")).sendKeys(Keys.ENTER);
		org.openqa.selenium.Alert alert=driver.switchTo().alert();
		alert.accept();
		alert.accept();
		
		
		
		//Thread.sleep(3000);
		//driver.close();
		
	}

}
