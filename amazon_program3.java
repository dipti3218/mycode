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

public class amazon_program3 {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		driver.get("https://www.amazon.in");
		WebElement textfield =driver.findElement(By.id("twotabsearchtextbox"));
		textfield.sendKeys("shoe");
		textfield.sendKeys(Keys.ENTER);
		WebElement First_shoe=driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
		First_shoe.click();
		
		Set<String> pc=driver.getWindowHandles();
		
		Iterator<String> i1=pc.iterator();
		String Parent_Window= i1.next();
		String Child_Window= i1.next();
		
		driver.switchTo().window(Child_Window);
		
		WebElement add_cart=driver.findElement(By.id("add-to-cart-button"));
		add_cart.click();
		
		WebElement Payment =driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
		Payment.click();
		
		WebElement UN =driver.findElement(By.xpath("//input[@name='email']"));
		UN.sendKeys("7008903016");
		WebElement clk =driver.findElement(By.xpath("//input[@id='continue']"));
		clk.click();
		WebElement pass =driver.findElement(By.xpath("//input[@id='ap_password']"));
		pass.sendKeys("Dipti@123");
		WebElement submit =driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		submit.click();
		WebElement adress =driver.findElement(By.xpath("(//input[@class='a-button-input'])[2]"));
		adress.click();
		WebElement select =driver.findElement(By.xpath("(//input[@name='ppw-instrumentRowSelection'])[8]"));
		select.click();
		WebElement cvv =driver.findElement(By.xpath("(//input[@class='a-input-text a-form-normal a-width-small'])[7]"));
		cvv.click();
		cvv.sendKeys("123");
		
		/*TakesScreenshot tss= driver;    
		File Source=tss.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\FCI\\eclipse-workspace\\Selenium_project\\Screenshot\\one.png");
		FileHandler.copy(Source, destination);*/
		//complete    
	}

}
