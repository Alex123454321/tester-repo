import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ex {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://vs7.io/");
		selenium.start();
	}

	@Test
	public void test123() throws Exception {
		selenium.open("http://tinkozzz.rtz.io/");
		selenium.waitForPageToLoad("20000");
	/*	selenium.click("link=Личный кабинет");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("id=mini-login")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}
		selenium.type("id=mini-login", "artosis12345123@mail.ru");
		selenium.type("id=mini-password", "4793546224");
		selenium.click("css=button.btn.btn-primary");
		selenium.waitForPageToLoad("20000");
		selenium.open("http://tinko.rtz.io/p-244265.html");
		selenium.waitForPageToLoad("20000");
		selenium.click("xpath=(//button[@type='button'])[6]");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=Êîðçèíà - 1 ïîç.")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}
		Thread.sleep(5000);*/
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
