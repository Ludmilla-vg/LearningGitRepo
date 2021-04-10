package nz.co.Projects.Objects.PageObjects.TradeMe;

import nz.co.Framework.Element;
import nz.co.Framework.ElementList;
import org.openqa.selenium.By;

public class HomePage {
    public Element searchTextbox = new Element(By.xpath("//input[@id='searchString']"));
    public Element searchButton = new Element(By.xpath("//button[@value='Search']"));
    public ElementList searchedResultsList = new ElementList(By.xpath("//div[@class='info']"));

    public HomePage() {
        searchTextbox.exists(5);
        // searchTextbox.findElement();
    }
}
