package org.ac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\R.KAVINYA\\eclipse-workspace\\Actions\\driver\\chromedriver.exe");
		WebDriver dri = new ChromeDriver();
		dri.get("https://www.gettyimages.in/");
		//WebElement r = dri.findElement(By.xpath("//div[contains(text(),'Illustrations')]"));
		//r.click();
		WebElement i = dri.findElement(By.xpath("//a[text()='EDITORIAL'][1]"));
		i.click();
	}

}
