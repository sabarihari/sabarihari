package org.ac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task13 {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\R.KAVINYA\\eclipse-workspace\\Actions\\driver\\chromedriver.exe");
		WebDriver dri = new ChromeDriver();
		dri.get("https://www.homedepot.com/");
		WebElement p = dri.findElement(By.xpath("//a[text()='All Departments']"));
		Actions a = new Actions(dri);
		a.moveToElement(p).perform();
		WebElement o = dri.findElement(By.xpath("//a[text()='Paint']"));
		a.moveToElement(o).perform();
		WebElement r = dri.findElement(By.xpath("(//a[text()='Interior Paint'])[1]"));
		a.moveToElement(r).perform();
		WebElement d = dri.findElement(By.xpath("//a[text()='Ceiling Paint']"));
		d.click();
	}

}
