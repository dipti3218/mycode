package launch.selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks 
{
public static void main(String[] args) throws IOException
{
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
	driver.get("https://www.amazon.in");
	List<WebElement> links=driver.findElements(By.tagName("a"));
	int CountOfLinks=links.size();
	System.out.println(CountOfLinks);
	
	for (int i=0;i<CountOfLinks;i++)
	{
		WebElement single_link=links.get(i);
		String url =single_link.getAttribute("href");
		System.out.println(url);
		verify_the_link(url);
	}
}

static void verify_the_link(String url) throws IOException 
{
	try
	{
	URL u1= new URL(url);
	  HttpURLConnection h1    =(HttpURLConnection) u1.openConnection();
	  h1.connect();
	  if(h1.getResponseCode()==200)
	  {
		 System.out.println("link is valid "+ h1.getResponseCode()  +  h1.getResponseMessage()  +  url); 
	  }
	  else
	  {
		  System.out.println("link is invalid "+ h1.getResponseCode()  +  h1.getResponseMessage()  +  url);
	  }
	}
	catch(MalformedURLException u1)
	{
		
	}
	catch(NullPointerException u1)
	{
		
	}
}

}
