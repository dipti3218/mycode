package launch.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Copy_paste_thruSendKeys {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement PA=driver.findElement(By.xpath("//textarea[@id='Present-Address']"));
		PA.sendKeys("diptidas.3218@gmail.com");
		PA.sendKeys(Keys.CONTROL+ "a");
		PA.sendKeys(Keys.CONTROL+ "c");
		WebElement PB=driver.findElement(By.xpath("//textarea[@id='Permanent-Address']"));
		PB.sendKeys(Keys.CONTROL+ "v");

	}

}          
