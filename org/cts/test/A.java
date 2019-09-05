package org.cts.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Uer\\eclipse-workspace---practice\\String\\Driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 6");
		d.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		d.findElement(By.xpath("//span[text()='Apple iPhone 6s (32GB) - Space Grey']")).click();
		String p=d.getWindowHandle();
		Set<String> a = d.getWindowHandles();
		System.out.println(p+"\n"+a);
		for(String x:a) {
			if(!x.equals(p)) {
				d.switchTo().window(x);
			}
		}
		d.findElement(By.xpath("//input[@value='Add to Cart']")).click();
System.out.println("done");
}}
