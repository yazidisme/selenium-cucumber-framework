package StepDefinitions;

import Managers.FileReaderManager;
import PageObjects.HomePage;
import Utilities.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomeSteps {

    WebDriver webDriver;
    HomePage homePage;
    TestContext testContext;

    public HomeSteps(TestContext context) {
        testContext = context;
        homePage = testContext.getPageObjectManager().getHomePage();
    }

    @Given("Open the browser with bhinneka home page")
    public void openTheBrowserWithBhinnekaHomePage() {

        webDriver = testContext.getDriverManager().getDriver();
        webDriver.get(FileReaderManager.getInstance().getConfigFileReader().getUrl());
    }

    @Then("Quit the session")
    public void quitTheSession() {

        testContext.getDriverManager().closeDriver();
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
