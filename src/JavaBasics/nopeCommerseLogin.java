package JavaBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nopeCommerseLogin {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "//Drivers//chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("http://admin-demo.nopcommerce.com/login");
	
		//Login page
		WebElement email= driver.findElement(By.xpath("//input[@type='email']"));
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		WebElement subbtn=driver.findElement(By.xpath("//button[@type='submit']"));
		
		email.clear();
		email.sendKeys("admin@yourstore.com");
		
		password.clear();
		password.sendKeys("admin");
		
		subbtn.click();
		
		//customers page
		
		WebElement customersmenu=driver.findElement(By.xpath("//p[text()[normalize-space()='Customers']]"));
		customersmenu.click();
		
		WebElement customeritem =driver.findElement(By.xpath("//p[text()=' Customers']"));
		
		customeritem.click();
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
