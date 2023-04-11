package skcet.day5;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ex1 {
	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions fo = new ChromeOptions();
		fo.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(fo);
		driver.get("https://demoqa.com/droppable/");
		WebElement wb1=driver.findElement(By.id("draggable"));
		WebElement wb2=driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		Action DaD = act.clickAndHold(wb1).moveToElement(wb2).release(wb2).build();
		DaD.perform();
	}
}
