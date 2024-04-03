package webdriver.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDemo1 {
	WebDriver driver;
//	System.setProperty("webdriver.chrome.driver","chromedriver.exe")

	public void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://demo.automationtesting.in/");
		 
		 
		 
		 
		 driver.findElement(By.xpath("//div[@id='main']/div/input[@id='email']")).sendKeys("kiran@gmail.com");
		
}
	
}