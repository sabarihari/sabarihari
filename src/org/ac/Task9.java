package org.ac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task9 {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\R.KAVINYA\\eclipse-workspace\\Actions\\driver\\chromedriver.exe");
		WebDriver dri = new ChromeDriver();
		dri.get("http://greenstech.in/selenium-course-content.html");
		WebElement p = dri.findElement(By.xpath("//a[text()='COURSES']"));
		Actions a = new Actions(dri);
		a.moveToElement(p).perform();
		WebElement u = dri.findElement(By.xpath("//span[text()='Data Warehousing Training ']"));
		a.moveToElement(u).perform();
		WebElement y = dri.findElement(By.xpath("//span[text()='Microstrategy Training']"));
		y.click();
	}

}
