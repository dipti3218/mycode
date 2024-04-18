package launch.selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_p4 {

	public static void main(String[] args) {
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
		
		WebElement location=driver.findElement(By.xpath("//span[@id='glow-ingress-line1']"));
		location.click();
			
		
		WebElement link=driver.findElement(By.xpath("//a[.='Add an address or pick-up point ']"));
		link.click();
		WebElement address=driver.findElement(By.xpath("//div[@id='ya-myab-plus-address-icon']"));
		address.click();
		WebElement Fname=driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressFullName']"));
		Fname.sendKeys("dipti das");
		WebElement mob=driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressPhoneNumber']"));
		mob.sendKeys("9439917518");
		WebElement pin=driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressPostalCode']"));
		pin.sendKeys("752101");
		WebElement flat=driver.findElement(By.xpath("//input[@name='address-ui-widgets-enterAddressLine1']"));
		flat.sendKeys("805/4597, Naharakanta, balianta");
		WebElement area =driver.findElement(By.xpath("//input[@name='address-ui-widgets-enterAddressLine2']"));
		area.sendKeys("Naharakanta, Balianta");
		WebElement landmark=driver.findElement(By.xpath("//input[@id='address-ui-widgets-landmark']"));
		landmark.sendKeys("puri canal road");
		WebElement state=driver.findElement(By.cssSelector("#address-ui-widgets-use-as-my-default"));
		state.click();
		driver.findElement(By.xpath("(//input[@class='a-button-input'])[11]")).click();
		
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
		
		WebElement add_adress =driver.findElement(By.xpath("(//input[@class='a-button-input'])[2]"));
		add_adress.click();
		
		//driver.findElement(By.xpath("(//div[@class='a-fixed-left-grid-col a-col-left']/span/div/label)[12]")).click();
		
		//driver.findElement(By.xpath("(//span[@class='a-button-text a-declarative'])[2]")).click();
		//driver.findElement(By.xpath("((//span[@class='a-button-text a-declarative'])[1]")).click();
		
		WebElement select =driver.findElement(By.xpath("(//input[@name='ppw-instrumentRowSelection'])[11]"));
		select.click();
		driver.findElement(By.xpath("(//span[@class='a-button-text a-declarative'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='a-popover-inner a-lgtbox-vertical-scroll']/ul/li)[6]")).click();
		driver.findElement(By.xpath("//input[@name='ppw-widgetEvent:SetPaymentPlanSelectContinueEvent']")).click();
		//WebElement cvv =driver.findElement(By.xpath("(//input[@class='a-input-text a-form-normal a-width-small'])[7]"));
		//cvv.click();
		//cvv.sendKeys("123");*/
		//completed
	}

}
