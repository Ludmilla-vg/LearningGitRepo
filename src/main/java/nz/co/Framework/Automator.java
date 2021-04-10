package nz.co.Framework;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automator {
    public static WebDriver driver;

    public Automator() {

    }

    public void startChrome() {
        WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
        driver = new ChromeDriver();
    }

    public void navigateTo(String _uRL) {
        driver.navigate().to(_uRL);
    }

    public void quit() {
      //  driver.quit();
    }

    public void maximiseWindow() {
        driver.manage().window().maximize();
    }

}
