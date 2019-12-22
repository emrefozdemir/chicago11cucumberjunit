package test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import utilities.Config;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AndroidTest {

    AppiumDriverLocalService service;

    @Test
    public void testMobile() throws MalformedURLException {

        File app = new File(Config.getProperty("apk_file_path"));

        service = AppiumDriverLocalService.buildDefaultService();
        service.start();
        DesiredCapabilities capabilities = new DesiredCapabilities().chrome();

        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel XL API 28");
        capabilities.setCapability("avd", "Pixel_XL_API_28");
//        capabilities.setCapability("appPackage", "com.kehe.delivery.qa");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
//        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, MobileBrowserType.CHROME);
//        capabilities.setCapability(MobileCapabilityType.APP, "TBD");

        // automatically grant permissions
        capabilities.setCapability("autoGrantPermissions", true);
        // automatically accepts all the notifications
        capabilities.setCapability("autoAcceptAlerts", true);
        // wait for server
        capabilities.setCapability("newCommandTimeout", 60000);

        capabilities.setCapability("chromedriverExecutable", "C:\\Users\\em_re\\chicago11cucumberjunit\\src\\test\\java\\drivers\\chromedriver.exe");

        WebDriver androidWebDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        androidWebDriver.get("https://www.amazon.com");
        String actualTitle = androidWebDriver.getTitle();
        String expectedTitleContains = "Amazon";
        Assert.assertTrue(actualTitle.contains(expectedTitleContains));

    }
}
