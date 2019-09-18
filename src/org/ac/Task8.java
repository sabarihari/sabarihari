package org.ac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task8 {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\R.KAVINYA\\eclipse-workspace\\Actions\\driver\\chromedriver.exe");
		WebDriver dri = new ChromeDriver();
		dri.get("http://greenstech.in/selenium-course-content.html");
		WebElement o = dri.findElement(By.xpath("//a[text()='COURSES']"));
		Actions a = new Actions(dri);
		a.moveToElement(o).perform();
		WebElement w = dri.findElement(By.xpath("//span[text()='Oracle Training ']"));
		a.moveToElement(w).perform();
		WebElement q = dri.findElement(By.xpath("//span[text()='Oracle SQL Training']"));
		q.click();
		WebElement y = dri.findElement(By.xpath("//p[text()='1. Basic DATABASE Concept and SQL']"));
	String u = q.getText();
	System.out.println(u);
		
	}

}
