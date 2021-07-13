package Utilities;

import Managers.AllDriverManager;
import Managers.PageObjectManager;

public class TestContext {

    private final AllDriverManager driverManager;
    private final PageObjectManager pageObjectManager;

    public TestContext() {
        driverManager = new AllDriverManager();
        pageObjectManager = new PageObjectManager(driverManager.getDriver());
    }

    public AllDriverManager getDriverManager() {
        return driverManager;
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }
}
