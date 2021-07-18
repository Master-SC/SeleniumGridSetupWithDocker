package org.example;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class chromeTest {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        URL u = new URL("http://localhost:4444/wd/hub");
        RemoteWebDriver driver = new RemoteWebDriver(u,cap);
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());

    }

}
