package StepDefinitions;

import Managers.DriverManager;
import Managers.FileReaderManager;
import Managers.PageObjectManager;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MyStepdefs {

    WebDriver webDriver;
    HomePage homePage;
    LoginPage loginPage;
    PageObjectManager pageObjectManager;
    DriverManager driverManager;

    @Given("Open the browser with bhinneka home page")
    public void openTheBrowserWithBhinnekaHomePage() {

        driverManager = new DriverManager();
        webDriver = driverManager.getDriver();

        pageObjectManager = new PageObjectManager(webDriver);
        homePage = pageObjectManager.getHomePage();

        webDriver.get(FileReaderManager.getInstance().getConfigFileReader().getUrl());
    }

    @Then("Quit the session")
    public void quitTheSession() {

        driverManager.closeDriver();
    }

    private boolean loginPageIsDisplayed() {

        loginPage = pageObjectManager.getLoginPage();

        Assert.assertTrue(loginPage.emailLoginPageIsDisplayed());
        String actualLoginHeaderTitle = loginPage.getLoginHeaderTitle();
        Assert.assertEquals("Silakan masuk ke akun Anda", actualLoginHeaderTitle);
        String actualRegisterQuestionText = loginPage.getQuestionRegisterText();
        Assert.assertEquals("Belum punya akun Bhinneka? Daftar", actualRegisterQuestionText);
        return true;
    }

    @Given("Login form in login page")
    public void goToLoginPage() {

        Assert.assertTrue(homePage.defaultHomePageIsDisplayed());
        homePage.clickLoginButton();
        Assert.assertTrue(loginPageIsDisplayed());
    }

    @Given("Home page without authorizations")
    public void homePageWithoutAuthorizations() {

        Assert.assertTrue(homePage.defaultHomePageIsDisplayed());
    }

    @When("Input {string} as email, {string} as password, {string} as account type")
    public void inputAsEmailAsPasswordAsAccountType(String email, String password, String account) {
        System.out.println("---" + email);
        System.out.println("---" + password);
        System.out.println("---" + account);
    }
}
