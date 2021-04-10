package nz.co.Projects.Objects.PageObjects.TradeMe;

import nz.co.Framework.Element;
import nz.co.Framework.ElementList;
import org.openqa.selenium.By;

public class PropertyPage {
    public Element propertySearchTabs = new Element(By.xpath("//div[@class='tm-property-search-form__tabs']"));
    public ElementList locationDropdownList = new ElementList(By.xpath("//select[@id='tg-5432']/option"));
    public Element locationDropdown = new Element(By.id("tg-5432"));

    public PropertyPage(){
        propertySearchTabs.waitForElementToExist(5);
    }
}
