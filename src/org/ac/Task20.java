package org.ac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task20 {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\R.KAVINYA\\eclipse-workspace\\Actions\\driver\\chromedriver.exe");
		WebDriver dri = new ChromeDriver();
		dri.get("https://www.sprint.com");
		WebElement p = dri.findElement(By.xpath("(//a[@class='sprint-menu__root-link'])[4]"));
		Actions a = new Actions(dri);
		a.moveToElement(p).perform();
		WebElement u = dri.findElement(By.xpath("(//a[@class='js-nav-link'])[39]"));
		u.click();
}

}
