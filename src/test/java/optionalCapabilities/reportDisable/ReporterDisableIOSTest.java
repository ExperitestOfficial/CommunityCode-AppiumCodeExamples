package optionalCapabilities.reportDisable;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import java.net.MalformedURLException;
import java.net.URL;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;


/**
 * 	Use this capability in order to choose if a report would be generated or not.
 * 	When report.disable is set to true, no report will be generated after the session ended.
 */
class ReporterDisableIOSTest {

    IOSDriver<IOSElement> driver = null;
    DesiredCapabilities dc = new DesiredCapabilities();
    final String CLOUD_URL = "<CLOUD_URL>" + "/wd/hub";
    final String ACCESS_KEY = "<ACCESS_KEY>";
    final String APPIUM_VERSION = "<APPIUM_VERSION>";


    @BeforeEach
    public void setUp() throws MalformedURLException {
        dc.setCapability("accessKey", ACCESS_KEY);
        dc.setCapability("appiumVersion", APPIUM_VERSION);
        dc.setCapability("deviceQuery", "@os='ios'");
        dc.setCapability("report.disable", true);
        dc.setCapability("testName", "Report disable test on iOS device");
        dc.setCapability(MobileCapabilityType.APP, "cloud:com.experitest.ExperiBank");
        dc.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.experitest.ExperiBank");
        driver = new IOSDriver<>(new URL(CLOUD_URL), dc);
    }

    @Test
    void runTestWithReportDisableTrue() {
        driver.rotate(ScreenOrientation.PORTRAIT);
        driver.findElement(By.xpath("//*[@name='usernameTextField']")).sendKeys("company");
        driver.findElement(By.xpath("//*[@name='passwordTextField']")).sendKeys("company");
        driver.findElement(By.xpath("//*[@name='loginButton']")).click();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

}
