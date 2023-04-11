package skcet.day5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ex3 {
	public static void main(String args[]) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions fo = new ChromeOptions();
		fo.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(fo);
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		WebElement wb1=driver.findElement(By.name("cusid"));
		WebElement wb2=driver.findElement(By.name("submit"));
		wb1.sendKeys("401");
		wb2.click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		wb1.clear();
		wb1.sendKeys("402");
		Thread.sleep(3000);
		wb2.click();
		driver.switchTo().alert().accept();
		Alert alt=driver.switchTo().alert();
		String str=alt.getText();
		System.out.println(str);
		alt.accept();
		wb1.clear();
	}
}

