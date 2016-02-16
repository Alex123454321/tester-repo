package com.example.tests;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;

public class ЗаготовкаСмоука2 {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://tinko.rtz.io/");
		selenium.start();
	}

	@Test
	public void testЗаготовкаСмоука2() throws Exception {
		selenium.open("http://tinko.rtz.io/p-247997.html");
		selenium.waitForPageToLoad("20000");
		selenium.click("xpath=(//button[@type='button'])[6]");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=Корзина - 1 поз.")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("link=Корзина - 1 поз.");
		selenium.click("xpath=(//button[@type='button'])[4]");
		selenium.waitForPageToLoad("20000");
		selenium.click("id=billing:legal_entity");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("id=billing:company")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("id=shipping:different_shipping");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("id=shipping:firstname")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("id=shipping:legal_entity");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("id=shipping:company")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("id=s_method_storepickup_storepickup");
		selenium.click("id=s_method_freeshipping_freeshipping");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("id=shipping:street1")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
