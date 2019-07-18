package org.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Git {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Banu1\\\\\\JavaWorkplace\\Selenium\\\\\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement user=driver.findElement(By.id("inputValEnter"));
		user.sendKeys("apple laptop");
		WebElement btn=driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
		btn.click();
		WebElement btn1=driver.findElement(By.xpath("//img[@title='Apple MacBook Air MQD32HN/A Laptop 2017 (Core i5- 8GB RAM- 128GB SSD- 33.02cm(13)- Mac OSX Sierra)']"));
		btn1.click();
		String par=driver.getWindowHandle();
		Set<String> all=driver.getWindowHandles();
		System.out.println(par+ "\n" +all);
		for(String X:all) {
			if(!X.equals(par)) {
				driver.switchTo().window(X);
			}
		}
		WebElement add=driver.findElement(By.xpath("//div[@id='add-cart-button-id']"));
		add.click();
		WebElement btn2=driver.findElement(By.xpath("//div[@id='add-cart-button-id']"));
		btn2.click();
	}

}
