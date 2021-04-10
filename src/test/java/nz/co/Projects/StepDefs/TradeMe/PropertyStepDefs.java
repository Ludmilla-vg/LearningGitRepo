package nz.co.Projects.StepDefs.TradeMe;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import nz.co.Projects.Objects.PageObjects.TradeMe.PropertyPage;
import nz.co.Projects.TestDriver;

import java.util.List;

public class PropertyStepDefs {

    @Given("^I navigate to the sale property page$")
    public void iNavigateToTheSalePropertyPage() {
        TestDriver.automator.navigateTo(TestDriver.trademeProperties.getProperty("salePropertyURL"));
    }

    @When("^I search for a property$")
    public void iSearchForAProperty(DataTable dataTable) {
        PropertyPage propertyPage = new PropertyPage();

        List<List<String>> data = dataTable.cells(0);
        for (List<String> dataInput : data) {
            String fieldName = dataInput.get(0);
            String value = dataInput.get(1);

            if (fieldName.equalsIgnoreCase("Location")) {
                propertyPage.locationDropdown.click();
                //propertyPage.locationDropdownList.getElementWithText(value).click();
            }
        }
    }

}
