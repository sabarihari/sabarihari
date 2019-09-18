package org.ac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task19 {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\R.KAVINYA\\eclipse-workspace\\Actions\\driver\\chromedriver.exe");
		WebDriver dri = new ChromeDriver();
		dri.get("https://www.flipkart.com/");
		WebElement r = dri.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
		r.sendKeys("8667212819");
		WebElement g = dri.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']"));
		g.sendKeys("sabarihari@97");
		WebElement u = dri.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']"));
		u.click();
		WebElement o = dri.findElement(By.xpath("//span[text()='Women']"));
		Actions a = new Actions(dri);
		a.moveToElement(o).perform();
		WebElement p = dri.findElement(By.xpath("(//a[text()='Footwear'])[2]"));
		a.moveToElement(p).perform();
		p.click();
		WebElement y = dri.findElement(By.xpath("(//a[text()='Flats'])[2]"));
		y.click();
	}

}
