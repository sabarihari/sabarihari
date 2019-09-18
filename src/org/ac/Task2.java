package org.ac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task2 {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\R.KAVINYA\\eclipse-workspace\\Actions\\driver\\chromedriver.exe" );
		WebDriver dri = new ChromeDriver();
		dri.get("https://www.amazon.in/");
		WebElement p = dri.findElement(By.xpath("//span[text()='Category']"));
		Actions a = new Actions(dri);
		a.moveToElement(p).perform();
		WebElement o = dri.findElement(By.xpath("//span[text()='Mobiles, Computers']"));
		a.moveToElement(o).perform();
		WebElement u = dri.findElement(By.xpath("//span[text()='Power Banks']"));
	    u.click();
		
		
		
	}

}
