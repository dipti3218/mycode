package launch.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdrown {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		driver.get("https://www.amazon.in");
		WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
		dropdown.click();
		Select s1= new Select(dropdown);
		s1.selectByVisibleText("Books");
		WebElement stf=driver.findElement(By.id("twotabsearchtextbox"));
		stf.sendKeys("world");
		stf.sendKeys(Keys.ENTER);
		

	}

}
