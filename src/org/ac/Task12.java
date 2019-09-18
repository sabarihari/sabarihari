package org.ac;

import java.awt.image.AreaAveragingScaleFilter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task12 {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\R.KAVINYA\\eclipse-workspace\\Actions\\driver\\chromedriver.exe");
		WebDriver dri = new ChromeDriver();
		dri.get("https://www.homedepot.com/");
		WebElement p = dri.findElement(By.xpath("//a[text()='All Departments']"));
		Actions a = new Actions(dri);
		a.moveToElement(p).perform();
		WebElement k = dri.findElement(By.xpath("//a[text()='Heating & Cooling'][1]"));
		a.moveToElement(k).perform();
		WebElement f = dri.findElement(By.xpath("//a[text()='Air Conditioners'][1]"));
		a.moveToElement(f).perform();
		WebElement d = dri.findElement(By.xpath("//a[text()='Portable Air Conditioners']"));
		d.click();
	}

}
