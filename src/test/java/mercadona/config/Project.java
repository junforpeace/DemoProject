package mercadona.config;

import org.aeonbits.owner.ConfigFactory;

public class Project {
    public static ProjectConfig config = ConfigFactory.create(ProjectConfig.class, System.getProperties());

    public static boolean isWebMobile() {
        return !config.browserMobileView().equals("123");
    }

    public static boolean isRemoteWebDriver() {
        return !config.remoteDriverUrl().equals("selenoid.autotests.cloud");
    }
}


