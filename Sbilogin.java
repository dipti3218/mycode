package launch.selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Sbilogin {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		WebElement User=driver.findElement(By.xpath("//div[@class='col-lg-6 col-md-6 col-sm-6 forgot_details']/ul/li"));
		User.click();
		Alert a=driver.switchTo().alert();
		a.accept();
		
		Set<String> pc=driver.getWindowHandles();
		
		Iterator<String> i1=pc.iterator();
		String Parent_Window= i1.next();
		String Child_Window= i1.next();
		
		driver.switchTo().window(Child_Window);
	
		WebElement Pass=driver.findElement(By.xpath("//input[@name='nextStep']"));
		Pass.click();
		
		WebElement AN = driver.findElement(By.id("accountNo"));
		AN.sendKeys("123456789");
		WebElement CIF = driver.findElement(By.id("cifNo"));
		CIF.sendKeys("SBIN56789");
		WebElement BC = driver.findElement(By.id("branchCode"));
		BC.sendKeys("456789");
		WebElement CC = driver.findElement(By.name("countryCode"));
		CC.sendKeys("456jj89");
		WebElement MOB=driver.findElement(By.name("mobileNo"));
		MOB.sendKeys("9439917518");
		WebElement Transaction=driver.findElement(By.name("txnRights"));
		Transaction.click();
		TakesScreenshot tss= driver;    
		File Source=tss.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\FCI\\eclipse-workspace\\Selenium_project\\Screenshot\\"+ Math.random()+".png");
		FileHandler.copy(Source, destination);
		
		
		
	
		
		

		

	}

}
