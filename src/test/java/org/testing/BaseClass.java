package org.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static void launchBrowser(String url) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM SARATH KUMAR\\eclipse-workspace\\JunitLearnMorning\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		System.out.println("kumar");
		System.out.println("saba");
		
	}
	
}
