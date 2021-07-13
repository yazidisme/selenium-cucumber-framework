package StepDefinitions;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import Utilities.TestContext;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CartSteps {

    TestContext testContext;
    HomePage homePage;
    LoginPage loginPage;

    public CartSteps(TestContext context) {
        testContext = context;
        homePage = testContext.getPageObjectManager().getHomePage();
        loginPage = testContext.getPageObjectManager().getLoginPage();
    }

    @When("Go to cart page without authorizations")
    public void goToCartPageWithoutAuthorizations() {
        homePage.clickCartButton();
        Assert.assertTrue(loginPage.emailLoginPageIsDisplayed());
    }
}
