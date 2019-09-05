package org.cts.test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Uer\\eclipse-workspace---practice\\String\\Driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 6");
		d.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		List<String> li=new ArrayList();
		li.add("Apple iPhone 6 (Space Grey, 1GB RAM, 32GB Storage)");
		li.add("Apple iPhone 6 (Gold, 1GB RAM, 32GB Storage)");
		li.add("Apple iPhone 6s (32GB) - Space Grey");
		int u=li.size();
		System.out.println(u);
	if(u<=10) {
		System.out.println("lesser than 10");
	}
	else {
		System.out.println("greater than 10");
	}
	}

}
