package NORMAL;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestImage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		 int width=driver.findElement(By.xpath("//img[@alt='Home decoration']")).getSize().getWidth();
		int hight=driver.findElement(By.xpath("//img[@alt='Home decoration']")).getSize().getHeight();;
		System.out.println(width);
		System.out.println(hight);
		
	      


	}

}
