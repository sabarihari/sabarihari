package org.ac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task1 {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\R.KAVINYA\\eclipse-workspace\\Actions\\driver\\chromedriver.exe");
		WebDriver dri = new ChromeDriver();
		dri.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement p = dri.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement r = dri.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Actions a = new Actions(dri);
		a.dragAndDrop(p, r).perform();
		WebElement l = dri.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement g = dri.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(l, g).perform();
		WebElement h = dri.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement u = dri.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(h, u).perform();
		WebElement y = dri.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement t = dri.findElement(By.xpath("(//ol[@align='center'])[4]"));
		a.dragAndDrop(y, t).perform();
		
		
	}

}
