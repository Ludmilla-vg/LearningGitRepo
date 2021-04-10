package nz.co.Projects;

import nz.co.Framework.Automator;
import nz.co.Framework.HelperClasses.PropertiesHandler;

import java.util.Properties;

public class TestDriver {
    public static Automator automator = new Automator();

    public static Properties properties;
    public static Properties trademeProperties;
    public String runTarget;
    public String env;

    public TestDriver() {
        setUp();
    }

    public void setUp() {
        properties = PropertiesHandler.loadProperties("src/main/resources/global.properties");
        trademeProperties = PropertiesHandler.loadProperties("src/main/resources/TradeMe/trademe.properties");
        runTarget = setEnvironmentProperty("runTarget");
        env = setEnvironmentProperty("env");

        if (runTarget.equalsIgnoreCase("chrome")){
            automator.startChrome();
        }
    }



    public String setEnvironmentProperty(String propertyName) {
        if (System.getenv().containsKey(propertyName)) {
            return System.getenv(propertyName);
        } else if (System.getenv().containsKey(propertyName.toUpperCase())) {   //some instances of windows are uppercasing runtarget
            return System.getenv(propertyName.toUpperCase());
        } else {
            return properties.getProperty(propertyName);
        }
    }
}
