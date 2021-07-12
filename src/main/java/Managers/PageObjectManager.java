package Managers;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    private WebDriver webDriver;
    private HomePage homePage;
    private LoginPage loginPage;

    public PageObjectManager(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    //Short Hand If...Else
    public HomePage getHomePage() {
        return (homePage == null) ? homePage = new HomePage(webDriver) : homePage;
    }

    //General If...Else
    public LoginPage getLoginPage() {

        if (loginPage == null) {
            loginPage = new LoginPage(webDriver);
        }
        return loginPage;
    }
}
