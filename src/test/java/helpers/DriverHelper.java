package helpers;

import config.WebDriverConfig;
import org.aeonbits.owner.ConfigFactory;

public class DriverHelper {
    public static WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

    public static boolean isRemoteWebDriver() {
        return !config.getRemoteDriverUrl().equals("");
    }

    public static boolean isVideoOn() {
        return !config.getVideoStorage().equals("");
    }

    public static boolean isWebMobile() {
        return !config.getBrowserMobileView().equals("");
    }
}
