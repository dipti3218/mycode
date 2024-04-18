package launch.selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazon_p5 {

	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		driver.get("https://www.amazon.in");
		//WebElement add=driver.findElement(By.xpath("//span[@id='glow-ingress-line1']"));
		//add.click();
		driver.findElement(By.xpath("//span[@class='nav-line-2 ']")).click();
		
		WebElement UN =driver.findElement(By.xpath("//input[@name='email']"));
		UN.sendKeys("7008903016");
		WebElement clk =driver.findElement(By.xpath("//input[@id='continue']"));
		clk.click();
		WebElement pass =driver.findElement(By.xpath("//input[@id='ap_password']"));
		pass.sendKeys("Dipti@123");
		WebElement submit =driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		submit.click();
		
	
		WebElement Account_list=driver.findElement(By.xpath("//span[.='Hello, Dipti']"));
				Actions a1= new Actions(driver);
				a1.moveToElement(Account_list).perform();
				
			WebElement wishlist=	driver.findElement(By.xpath("(//span[.='Your Wish List'])[2]"));
			wishlist.click();
			WebElement remove1=	driver.findElement(By.xpath("(//input[@name='submit.deleteItem'])[1]"));
			remove1.click();
			
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
			
		WebElement add_wish=	driver.findElement(By.xpath("//input[@id='add-to-wishlist-button-submit']"));
		add_wish.click();
		
	//	WebElement add_clk=	driver.findElement(By.xpath("//span[@id='atwl-list-name-1UTF64K3D0NP5']"));
		//add_clk.click();
		
		WebElement continue_shop=driver.findElement(By.xpath("//span[.='Continue shopping']")); //(//input[@class='a-button-input'])[19]
		continue_shop.click();
		
	WebElement add_cart=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		add_cart.click();

		
		
		WebElement Account_list1=driver.findElement(By.xpath("//span[.='Hello, Dipti']"));
		Actions a2= new Actions(driver);
		a2.moveToElement(Account_list1).perform();
		
		WebElement signout=driver.findElement(By.xpath("//span[.='Sign Out']"));
		signout.click();
		
		//complete

	}

}
