package NORMAL;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUp {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int link=links.size();
		System.out.println(link);
		Iterator<WebElement> it=links.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().getAttribute("href"));
			
		}
		
		String MW=driver.getWindowHandle();
		Set<String> cw=driver.getWindowHandles();
		Iterator<String> it1=cw.iterator();
		while(it.hasNext()) {
			String child=it1.next();
			if(!MW.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				driver.close();
				
			}
			else {
				driver.switchTo().window(MW);
		          driver.close();
			}
		}
		
          
	}

}
