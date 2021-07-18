package org.example;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class driverClass {
    RemoteWebDriver driver;

    public RemoteWebDriver initiateDriver() throws MalformedURLException {
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        URL u = new URL("http://localhost:4444/wd/hub");
        driver = new RemoteWebDriver(u,cap);
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        return driver;
    }

    public RemoteWebDriver initiateFireFoxDriver() throws MalformedURLException {
        DesiredCapabilities cap = DesiredCapabilities.firefox();
        URL u = new URL("http://localhost:4444/wd/hub");
        driver = new RemoteWebDriver(u,cap);
        driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
        return driver;
    }
}
