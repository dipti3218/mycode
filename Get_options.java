package launch.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Get_options {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		driver.get("https://www.amazon.in");
		WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
		dropdown.click();
		Select s1= new Select(dropdown);
		List<WebElement> options=s1.getOptions();
		int count=options.size();
		System.out.println(count);
	}

}
