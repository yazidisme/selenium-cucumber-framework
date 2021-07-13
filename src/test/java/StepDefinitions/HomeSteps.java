package StepDefinitions;

import PageObjects.HomePage;
import Utilities.TestContext;
import io.cucumber.java.en.Given;
import org.testng.Assert;

public class HomeSteps {

    HomePage homePage;
    TestContext testContext;

    public HomeSteps(TestContext context) {
        testContext = context;
        homePage = testContext.getPageObjectManager().getHomePage();
    }

    @Given("Home page without authorizations")
    public void homePageWithoutAuthorizations() {

        Assert.assertTrue(homePage.defaultHomePageIsDisplayed());
    }

    @Given("Login form in login page")
    public void goToLoginPage() {

        Assert.assertTrue(homePage.defaultHomePageIsDisplayed());
        homePage.clickLoginButton();
    }
}
