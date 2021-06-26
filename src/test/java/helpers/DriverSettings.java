package helpers;

import com.codeborne.selenide.Configuration;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;

public class DriverSettings {

    public static void configure() {
        Configuration.browser = DriverHelper.config.getBrowser();
        Configuration.browserVersion = DriverHelper.config.getBrowserVersion();
        Configuration.browserSize = DriverHelper.config.getBrowserSize();

        DesiredCapabilities capabilities = new DesiredCapabilities();

        if (DriverHelper.isWebMobile()) { // for chrome only
            ChromeOptions chromeOptions = new ChromeOptions();
            Map<String, Object> mobileDevice = new HashMap<>();
            mobileDevice.put("deviceName", DriverHelper.config.getBrowserMobileView());
            chromeOptions.setExperimentalOption("mobileEmulation", mobileDevice);
            capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
        }

        if (DriverHelper.isRemoteWebDriver()) {
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
            Configuration.remote = DriverHelper.config.getRemoteDriverUrl();
        }

        Configuration.browserCapabilities = capabilities;
    }
}