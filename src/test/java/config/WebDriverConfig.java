package config;

import org.aeonbits.owner.Config;

import static org.aeonbits.owner.Config.LoadType.MERGE;

@Config.LoadPolicy(MERGE)
@Config.Sources({
        "system:properties",
        "classpath:remote.driver.properties",
        "classpath:local.driver.properties"})
public interface WebDriverConfig extends Config {

    @DefaultValue("chrome")
    @Key("browser")
    String getBrowser();

    @DefaultValue("91.0")
    @Key("browserVersion")
    String getBrowserVersion();

    @DefaultValue("1920x1080")
    @Key("browserSize")
    String getBrowserSize();

    @Key("browserMobileView")
    String getBrowserMobileView();

    @Key("remoteDriverUrl")
    String getRemoteDriverUrl();

    @Key("videoStorage")
    String getVideoStorage();

}