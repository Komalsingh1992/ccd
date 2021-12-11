package NORMAL;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PHP {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.phptravels.net/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"departure\"]")).click();
     
  while(true) {
	  String text=  driver.findElement(By.xpath("/html/body/div[7]/div[1]/table/thead/tr[1]/th[3]")).getText();
	  System.out.println(text);
	  if(text.equals("October 2021"))
	  {break;
	  
	  }
	  else {
		  driver.findElement(By.xpath("/html/body/div[7]/div[1]/table/thead/tr[1]/th[3]")).click();
		  
	  }
  }
	}

}
