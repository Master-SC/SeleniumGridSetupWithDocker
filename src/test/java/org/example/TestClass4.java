package org.example;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TestClass4 extends driverClass{
    RemoteWebDriver driver;

    @Test
    public void testcase_4() throws MalformedURLException {
        driver=initiateDriver();
        driver.get("https://mvnrepository.com/");
        System.out.println(driver.getTitle());
    }
    @AfterMethod
    public void closeDriver(){
        driver.quit();
    }
}
