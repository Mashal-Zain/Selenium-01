package nop_commerce.nop_commerce;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mains {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		String act_title = driver.getTitle();
		//System.out.println("Actual Tile of the Page: "+ act_title);
		String exp_title = "nopCommerce demo store";
		if ( act_title.equals(exp_title))
		{
			System.out.println("Title is fine");
		}
		else {
			System.out.println("Title of the page is incorrect");
		}
		
		//Checking header links presence
		boolean status;
		status = driver.findElement(By.xpath("//a[normalize-space()='Register']")).isDisplayed();
		System.out.println("Register button present on header: " + status);
		
		
			
		
		Thread.sleep(3000);
		driver.close();
		
	
	}
}