package nz.co.Projects.StepDefs.TradeMe;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import nz.co.Projects.Objects.PageObjects.TradeMe.HomePage;
import nz.co.Projects.TestDriver;

public class HomePageStepDefs {

    @Given("^I enter the url in the address bar of the browser$")
    public void iEnterTheUrlInTheAddressBarOfTheBrowser() {
        TestDriver.automator.navigateTo(TestDriver.trademeProperties.getProperty("homePageURL"));
    }

    @Then("^I verify the search bar is displayed$")
    public void iVerifyTheSearchBarIsDisplayed() {
        HomePage homePage = new HomePage();
        homePage.searchTextbox.findElement();
    }

    @When("^I perform a search on (.*)$")
    public void iPerformASearchOnRedRoses(String searchTerm) {
        HomePage homePage = new HomePage();
        homePage.searchTextbox.sendKeys(searchTerm);
        homePage.searchButton.click();
    }

    @Then("^I verify a listing is returned$")
    public void iVerifyAListingIsReturned() {
        HomePage homePage = new HomePage();
        int numberOfResultsReturned = homePage.searchedResultsList.getElementList().size();
        System.out.println("The number of results =>" + numberOfResultsReturned);
        assertTrue("Verify the list is greater than 0", numberOfResultsReturned > 0);
    }
}
