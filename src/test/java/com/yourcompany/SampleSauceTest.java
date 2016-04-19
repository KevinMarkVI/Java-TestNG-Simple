package com.yourcompany;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


public class SampleSauceTest {

	  public static final String USERNAME = System.getenv("SAUCE_USERNAME");
	  public static final String ACCESS_KEY = System.getenv("SAUCE_ACCESS_KEY");
	  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

	@Test
    public static void main() throws MalformedURLException {
    	 
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Windows XP");
        caps.setCapability("version", "43.0");
     
        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
     
        /**
         * Goes to Sauce Lab's guinea-pig page and prints title
         */
        driver.get("https://saucelabs.com/test/guinea-pig");
        System.out.println("title of page is: " + driver.getTitle());
     
        driver.quit();
      }

}

