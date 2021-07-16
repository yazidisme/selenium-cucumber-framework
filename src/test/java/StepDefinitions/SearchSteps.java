package stepdefinitions;

import pageobjects.HomePage;
import utilities.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SearchSteps {

    TestContext testContext;
    HomePage homePage;

    public SearchSteps(TestContext context) {
        testContext = context;
        homePage = testContext.getPageObjectManager().getHomePage();
    }

    @When("Input data with {string} in search bar")
    public void inputDataSearch(String data) {
        homePage.setSearchInput(data);
    }

    @Then("Search product link with {string} data is displayed")
    public void searchProductLinkWithDataIsDisplayed(String data) {
        String dataLowerCase = data.toLowerCase();
        String actualSearchProductLink = homePage.getSearchProductLink().toLowerCase();

        Assert.assertEquals("tampilkan pencarian dari " + dataLowerCase, actualSearchProductLink);
    }
}
