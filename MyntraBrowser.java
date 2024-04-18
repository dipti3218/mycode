package launch.selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class MyntraBrowser {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		driver.get("https://www.myntra.com/");
		WebElement textfield =driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		textfield.sendKeys("shoe");
		WebElement AS=driver.findElement(By.xpath("(//div[@class=' desktop-autoSuggest desktop-showContent']/ul/li)[6]"));
		AS.click();
		WebElement First_shoe=driver.findElement(By.xpath("(//img[@class='img-responsive'])[1]"));
		First_shoe.click();
		
		Set<String> pc=driver.getWindowHandles();
		
		Iterator<String> i1=pc.iterator();
		String Parent_Window= i1.next();
		String Child_Window= i1.next();
		
		driver.switchTo().window(Child_Window);
		
		WebElement add_cart=driver.findElement(By.xpath("//span[@class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']"));
		add_cart.click();
		
		WebElement Go_to_cart =driver.findElement(By.linkText("GO TO BAG"));
		Go_to_cart.click();
		WebElement payment=driver.findElement(By.className("css-xjhrni"));
		payment.click();
		
		TakesScreenshot tss= driver;    
		File Source=tss.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\FCI\\eclipse-workspace\\Selenium_project\\Screenshot\\"+ Math.random()+".png");
		FileHandler.copy(Source, destination);

	}

}
