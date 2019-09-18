package org.ac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task17 {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\R.KAVINYA\\eclipse-workspace\\Actions\\driver\\chromedriver.exe");
		WebDriver dri = new ChromeDriver();
		dri.get("https://www.amazon.in/");
		WebElement o = dri.findElement(By.xpath("//span[text()='Category']"));
		Actions a = new Actions(dri);
		a.moveToElement(o).perform();
		WebElement h = dri.findElement(By.xpath("(//span[@class='nav-text'])[22]"));
		a.moveToElement(h).perform();
		WebElement k = dri.findElement(By.xpath("(//span[text()='Sunglasses'])[1]"));
		k.click();

}
}
