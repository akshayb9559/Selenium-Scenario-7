package demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutUsingSendKeys {

	WebDriver wd;
	String url = "https://www.facebook.com/";

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Certification Data\\Selenium\\Driver\\chromedriver.exe");
		wd = new ChromeDriver();
		wd.get(url);
	}

	@Test
	public void test() {
		// Initialize JS object
		JavascriptExecutor JS = (JavascriptExecutor)wd;
		// Enter username
		JS.executeScript("document.getElementById('email').value='akshay@gmail.com'");
		// Enter password
		JS.executeScript("document.getElementById('pass').value='akshay@1234'");
	}

	@After
	public void tearDown() throws Exception {
//		wd.quit();
	}
}
