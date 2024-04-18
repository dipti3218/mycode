package launch.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sbilogin2 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		driver.get("https://www.google.co.in");
		WebElement Goo=driver.findElement(By.className("gLFyf"));
		Goo.sendKeys("SBI");// Goo.sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//div[@class='OBMEnb']/ul/li")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		WebElement User=driver.findElement(By.cssSelector("input.form-control[name='userName']"));
		User.sendKeys("diptidas");
	
		WebElement Pass=driver.findElement(By.cssSelector("input.form-control[name='password']"));
		Pass.sendKeys("diptidas");
		
		WebElement login = driver.findElement(By.cssSelector("input[id^='Button2']"));
		login.click();

	}

}
