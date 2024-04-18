package launch.selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Flipkart {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		driver.get("https://www.flipkart.com/");
		WebElement textfield =driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		textfield.sendKeys("mouse");
		List<WebElement> AS=driver.findElements(By.xpath("(//div[@class='_3NorZ0 _3jeYYh']/form/ul/li)[2]"));
		int count=AS.size();
		System.out.println(count);
		AS.get(count-5);
	
		
		WebElement secondprod=driver.findElement(By.xpath("((//a[@class='s1Q9rs'])[2]"));
		secondprod.click();
		driver.close();
		
		Set<String> pc=driver.getWindowHandles();
		
		Iterator<String> i1=pc.iterator();
		String Parent_Window= i1.next();
		String Child_Window= i1.next();
		
		driver.switchTo().window(Child_Window);
		
		TakesScreenshot tss= driver;    
		File Source=tss.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\FCI\\eclipse-workspace\\Selenium_project\\Screenshot\\GrowtechMinds.png");
		FileHandler.copy(Source, destination);
		
		

	}

}
