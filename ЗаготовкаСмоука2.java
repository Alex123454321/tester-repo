import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.FileWriter;
import java.util.regex.Pattern;


public class TIN_15 {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://vs7.io/");
		selenium.start();
	}

	@Test
	public void test123() throws Exception {
     	selenium.open("http://tinko.rtz.io/");
		selenium.waitForPageToLoad("20000");
		selenium.click("link=Личный кабинет");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("id=mini-login")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}
		selenium.type("id=mini-login", "Strelok201995@mail.ru");
		selenium.type("id=mini-password", "4793546224");
		selenium.click("css=button.btn.btn-primary");
		selenium.waitForPageToLoad("20000");
		assertEquals("Вход с учетной записью", selenium.getText("css=div.auth > h2"));
		try(FileWriter writer = new FileWriter("C:\\Users\\Алексей\\Desktop\\Logs.txt",  true))
        {        
            writer.write("TIN-15: Тест успешно пройден. Перенаправление на нужную страницу работает правильно. "+"\r\n");  
            writer.flush();
        }
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
