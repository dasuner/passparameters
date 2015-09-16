package com.daz.passparameters.passparameters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import junit.framework.TestCase;
/*
 * @auther daz
 */

 class AppTest 
    extends TestCase
{
	private String URL=System.getProperty("url");
	private String BROWSER=System.getProperty("browser");
	static WebDriver driver;
	static String CHROME_PATH="drivers/chromedriver";

    @org.junit.Test
    public void testparam()
    {
    	if(BROWSER.equalsIgnoreCase("Firefox"))
    	{
    		driver=new FirefoxDriver();
    	}
    	else if(BROWSER.equalsIgnoreCase("Safari"))
    	{
    		driver=new SafariDriver();
    	}
    	else if(BROWSER.equalsIgnoreCase("Chrome"))
    	{
    		System.setProperty("webdriver.chrome.driver", CHROME_PATH);
			driver=new ChromeDriver();
    	}
    	driver.get(URL);
    	driver.quit();
    }
}
