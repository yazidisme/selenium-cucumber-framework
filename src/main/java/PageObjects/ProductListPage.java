package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductListPage {

    public ProductListPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//div[@class = 'Toastify']//following-sibling::div//h1[not(contains(text(),'Halo'))]")
    private WebElement resultTitle;

    @FindBy(className = "select-wrapper")
    private WebElement urutkanOptionButton;

    @FindBy(xpath = "//i[@name='property']//parent::button")
    private WebElement listViewButton;

    @FindBy(xpath = "//i[@name='grid-view']//parent::button")
    private WebElement gridViewButton;

    @FindBy(xpath = "//div[@class='product-title']//parent::div//parent::a")
    private List<WebElement> allCatalogueProduct;

    @FindBy(xpath = "//div[@class='product-title']//p")
    private List<WebElement> allProductTitle;

    public boolean searchResultPageIsDisplayed() {
        resultTitle.isDisplayed();
        urutkanOptionButton.isDisplayed();
        listViewButton.isDisplayed();
        gridViewButton.isDisplayed();
        return true;
    }

    public String getResultTitle() {
        resultTitle.isDisplayed();
        return resultTitle.getText();
    }

    public String getProductAmount() {
        return String.valueOf(allCatalogueProduct.size());
    }

    public String getAllProductTitle(int index) {
        allProductTitle.get(index).isDisplayed();
        return allProductTitle.get(index).getText();
    }
}
