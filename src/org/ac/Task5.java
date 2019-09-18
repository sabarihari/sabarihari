package org.ac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task5 {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\R.KAVINYA\\eclipse-workspace\\Actions\\driver\\chromedriver.exe");
		WebDriver dri = new ChromeDriver();
		dri.get("https://www.shopclues.com");
		WebElement p = dri.findElement(By.xpath("//button[@class='moe-chrome-style-notification-btn moe-btn-close moe-block-class']"));
		p.click();
		WebElement me = dri.findElement(By.xpath("//a[text()='Mobiles & Electronics']"));
		Actions a = new Actions(dri);
		a.moveToElement(me).perform();
		WebElement o = dri.findElement(By.xpath("//a[text()='Rs.5001 - Rs.10000']"));
		o.click();
	}

}
