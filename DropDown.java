package NORMAL;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		List<WebElement> dp=driver.findElements(By.xpath("//select[@id='month']//option"));
		int size=dp.size();
		System.out.println(size);
		for(int i=0;i<size;i++) {
			if(dp.get(i).getText().contains("अप्रैल")) {
				dp.get(i).click();
				break;
			}
		}
		

	}

}
