package nz.co.Framework;

import nz.co.Framework.HelperClasses.HelperMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.fail;

public class Element {
    public By locator;
    public WebElement webElement;
    public int defaultSeconds = 5;

    //Create an instance of the element without fetching it
    public Element(By locator) {
        this.locator = locator;
    }

    //webelement already exists
    public Element(WebElement element) {
        this.webElement = element;
    }

    public String getText() {
        try {
            return findElement().getText();
        } catch (StaleElementReferenceException s) {
            HelperMethods.sleep(1);
            return findElement().getText();
        }
    }

    public boolean exists(int fluentWait) {
        if (locator == null) {
            return webElement.isEnabled();
        } else {
            for (int i = 0; i < fluentWait; i++) {
                List<WebElement> elements = Automator.driver.findElements(this.locator);
                if (elements.size() > 0) {
                    elements.get(0);
                    return true;
                } else {
                    HelperMethods.sleep(2);
                }
            }
            return false;
        }
    }

    public boolean exists() {
        return exists(defaultSeconds);
    }

    public WebElement findElement() {
        if (locator == null) {
            return webElement;
        } else if (exists(defaultSeconds)) {
            return Automator.driver.findElement(locator);
        } else {
            System.out.println("Element not found");
            return null;
        }
    }

    public Boolean isDisplayed(int seconds) {
        if (exists(20)) {
            for (int i = 0; i < seconds; i++) {
                if (findElement().isDisplayed()) {
                    return true;
                } else {
                    HelperMethods.sleep(1);
                }
            }
        } else {
            fail("Not displayed");
        }
        return false;
    }

    public boolean isEnabled() {
        try {
            return findElement().isEnabled();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isSelected() {
        try {
            return findElement().isSelected();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isDisplayed() {
        try {
            return findElement().isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void sendKeys(String keys) {
        findElement().sendKeys(keys);
    }

    public void sendKeys(CharSequence character) {
        findElement().sendKeys(character);
    }


    public void waitForElementToExist(int seconds) {
        if (exists(seconds)) {
            return;
        } else {
            fail("Element is not displayed");
        }

    }

    public void click() {
        for (int i = 1; i <= 10; i++) {
            try {
                if (findElement().isDisplayed()) {
                    findElement().click();
                    i = 10;
                }
            } catch (StaleElementReferenceException s) {
                HelperMethods.sleep(1);
            }
        }
    }
}
