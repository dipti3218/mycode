package launch.selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_p6 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		driver.get("https://www.amazon.in");
		
		WebElement textfield =driver.findElement(By.id("twotabsearchtextbox"));
		textfield.sendKeys("Mobile");
		textfield.sendKeys(Keys.ENTER);
		//  WebElement review= driver.findElement(By.xpath("//span[.='Customer Review']"));
          //review.click();
	WebElement star=	driver.findElement(By.xpath("//i[@class='a-icon a-icon-star-medium a-star-medium-4']"));
	star.click();
//	WebElement brands= driver.findElement(By.xpath("//span[.='Brands']"));
	//brands.click();
	                WebElement redmi=   driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[5]"));
	                redmi.click();
	                WebElement dd=   driver.findElement(By.xpath("(//select)[2]"));
	                Select s1= new Select(dd);
	                s1.selectByIndex(4);
	             //  WebElement newarrival=   driver.findElement(By.xpath("(//div[@class='a-popover-inner']/ul/li)[5]"));
	               // newarrival.click();
	          //   WebElement storage= driver.findElement(By.xpath("//span[.='Memory Storage Capacity']"));
	            //    storage.click();
	                WebElement gb= driver.findElement(By.xpath("//span[.='128 GB']"));
	                gb.click();
	                WebElement product= driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]"));
	                product.click();
	                
	                Set<String> pc=driver.getWindowHandles();//window handles
	        		
	        		Iterator<String> i1=pc.iterator();
	        		String Parent_Window= i1.next();
	        		String Child_Window= i1.next();
	        		
	        		driver.switchTo().window(Child_Window);
	        		
	                WebElement Quantity=   driver.findElement(By.xpath("//select[@id='quantity']"));
	               
	                Select a1= new Select(Quantity);
	                a1.selectByValue("2"); // select by value
	               
	                
	                WebElement add_cart=   driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
	                add_cart.click();
	              //a[.='Newest Arrivals']
	              //  (//div[@class='a-popover-inner']/ul/li)[5]
	                //complete
	}

}
