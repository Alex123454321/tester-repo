package test.java;

import org.testng.annotations.Test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

import org.testng.annotations.BeforeMethod;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.FileWriter;

import org.testng.annotations.AfterMethod;

public class ex {
	private Selenium selenium;
  @Test
 public void test123() throws Exception {
		selenium.open("http://tinko.rtz.io/");
		selenium.waitForPageToLoad("20000");
	}
  
  @BeforeMethod
 
  public void setUp() throws Exception {
		selenium = new DefaultSelenium("46.101.110.47", 4444, "*chrome", "http://vs7.io/");
		selenium.start();
	}
  
  @AfterMethod
  
  public void tearDown() throws Exception {
		selenium.stop();
	}

}
