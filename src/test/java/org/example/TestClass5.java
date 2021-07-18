package org.example;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TestClass5 extends driverClass {

    RemoteWebDriver driver;
    @Test
    public void testcase_5() throws MalformedURLException {
        driver = initiateFireFoxDriver();
        driver.get("https://www.apple.com/");
        System.out.println(driver.getTitle());
    }

    @AfterMethod
    public void closeDriver(){
        driver.quit();
    }
}
