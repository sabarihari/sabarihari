package org.ac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task15 {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\R.KAVINYA\\eclipse-workspace\\Actions\\driver\\chromedriver.exe");
		WebDriver dri = new ChromeDriver();
		dri.get("https://www.snapdeal.com/");
		WebElement o = dri.findElement(By.xpath("(//span[@class='catText'])[7]"));
		Actions a = new Actions(dri);
		a.moveToElement(o).perform();
		WebElement p = dri.findElement(By.xpath("//span[text()='Footwear']"));
		a.moveToElement(p).perform();
		WebElement d = dri.findElement(By.xpath("//p[text()='Heels']"));
		d.click();
	}

}
