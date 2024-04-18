package launch.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector2 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	//	WebElement El =driver.findElement(By.cssSelector("#APjFqb"));//after #put the ID value
	//	WebElement El =driver.findElement(By.cssSelector(".gLFyf"));
		WebElement El =driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		El.sendKeys("bangalore");

	}

}
