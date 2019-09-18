package org.ac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task14 {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\R.KAVINYA\\eclipse-workspace\\Actions\\driver\\chromedriver.exe");
		WebDriver dri = new ChromeDriver();
		dri.get("https://www.snapdeal.com/");
		WebElement e = dri.findElement(By.xpath("//span[text()='Mobile & Tablets']"));
		Actions a = new Actions(dri);
		a.moveToElement(e).perform();
		WebElement h = dri.findElement(By.xpath("//span[text()='New Launches Covers']"));
		h.click();
	}

}
