package org.example;

import org.junit.Assert;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TestClass2 extends driverClass{

    RemoteWebDriver driver;

    @Test
    public void testcase_2() throws MalformedURLException {
        driver = initiateDriver();
        driver.get("https://github.com/");
        String s = driver.getTitle();
        System.out.println(s);
        String actualTitle = "GitHub: Where the world builds software · GitHub";
        Assert.assertEquals(actualTitle,s);
    }

    @AfterMethod
    public void closeDriver(){
        driver.quit();
    }
}
