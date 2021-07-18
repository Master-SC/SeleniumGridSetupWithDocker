package org.example;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TestClass3 extends driverClass{

    RemoteWebDriver driver;
    @Test
    public void testcase_3() throws MalformedURLException {

        driver= initiateDriver();
        driver.get("https://www.facebook.com/");
        System.out.println(driver.getTitle());
    }
    @AfterMethod
    public void closeDriver(){
        driver.quit();
    }
}
