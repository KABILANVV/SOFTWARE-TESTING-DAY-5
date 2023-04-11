package skcet.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ex4 {
	public static void main(String args[]) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions fo = new ChromeOptions();
		fo.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(fo);
		driver.get("https://www.abhibus.com/bus-ticket-booking");
		WebElement wb1=driver.findElement(By.id("source"));
		WebElement wb2=driver.findElement(By.id("destination"));
		wb1.sendKeys("Coimbatore",Keys.ENTER);
		wb1.click();
		wb2.sendKeys("Madurai",Keys.ENTER);
		wb2.click();
		WebElement date=driver.findElement(By.id("datepicker1"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','04/10/2023')",date);

		WebElement primt=driver.findElement(By.id("seo-subkimt-btn"));
		primt.submit();
	}
}
