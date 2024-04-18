package launch.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountOf_Linktext {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		driver.get("https://www.amazon.in");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int CountOfLinks=links.size();
		System.out.println(CountOfLinks);
		
		for (int i=0;i<CountOfLinks;i++)
		{
			WebElement single_link=links.get(i);
			String message =single_link.getText();
			System.out.println(message);
			boolean count=message.isEmpty();
			System.out.println(count);
		
			
			
		
		}

	}

}
