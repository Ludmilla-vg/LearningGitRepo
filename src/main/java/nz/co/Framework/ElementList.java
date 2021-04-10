package nz.co.Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ElementList {
    public By byLocator = null;

    public ElementList(By by) {
        this.byLocator = by;
    }

    public List<Element> getElementList() {
        List<WebElement> webElements = Automator.driver.findElements(byLocator);
        List<Element> elements = new ArrayList<>();
        for (WebElement webElement : webElements) {
            elements.add(new Element(webElement));
        }
        return elements;
    }

    public Element getElementWithText(String textToFind) {
        for (Element listItem : getElementList()) {
            if (listItem.getText().toLowerCase().equalsIgnoreCase(textToFind.toLowerCase())) {
                return listItem;
            }
        }
        return null;
    }

    public int size() {
        return getElementList().size();
    }

}
