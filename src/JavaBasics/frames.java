package JavaBasics;

//https://www.youtube.com/watch?v=cz91PPTspS8

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frames {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

		driver.manage().window().maximize();

		driver.findElement(By.id("name")).sendKeys("Testing Frames option in Selenium");

		driver.switchTo().frame("frm1"); // switch to frame -selected frame-id option

		// using select class for drop down menu
		
		Select selectcourse = new Select(driver.findElement(By.id("selectnav1")));
		selectcourse.selectByVisibleText("-- Selenium");

		driver.switchTo().defaultContent(); // back to original frame/page

		driver.quit();
	}

}
