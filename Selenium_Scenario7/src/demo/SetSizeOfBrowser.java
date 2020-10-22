package demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeOfBrowser {

	WebDriver wd;
	String url = "https://www.google.co.in";

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Certification Data\\Selenium\\Driver\\chromedriver.exe");
		wd = new ChromeDriver();
		wd.get(url);
	}

	@Test
	public void test() {
		Dimension d = new Dimension(800,480);
        //Resize current window to the set dimension
        wd.manage().window().setSize(d);
	}

	@After
	public void tearDown() throws Exception {
		wd.quit();
	}
}
