package org.example;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TestClass1 extends driverClass{

    RemoteWebDriver driver;



    @Test
    public void testcase_1() throws MalformedURLException {
        driver = initiateDriver();
        driver.get("https://google.com");
        String s = driver.getTitle();
        System.out.println(s);
    }

    @AfterMethod
    public void closeDriver(){
        driver.quit();
    }
}
