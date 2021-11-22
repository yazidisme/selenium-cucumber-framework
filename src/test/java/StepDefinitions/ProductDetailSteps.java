package stepdefinitions;

import enums.Context;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pageobjects.ProductDetailPage;
import utilities.TestContext;

public class ProductDetailSteps {

    TestContext testContext;
    ProductDetailPage productDetailPage;

    public ProductDetailSteps(TestContext context) {
        testContext = context;
        productDetailPage = testContext.getPageObjectManager().getProductDetailPage();
    }

    @Then("Product detail with {string} type is displayed")
    public void productDetailWithType(String type) {
        Assert.assertTrue(productDetailPage.defaultProductDetailPageIsDisplayed());

        switch (type) {
            case "non fisik":
                Assert.assertTrue(productDetailPage.nonFisikProductDetailDataIsDisplayed());
                break;
            case "fisik":
                Assert.assertTrue(productDetailPage.fisikProductDetailDataIsDisplayed());
                break;
        }

        String actualBreadcrumbName = productDetailPage.getAllBreadcrumbName(3).toLowerCase();
        String expectedBreadcrumbName = testContext.scenarioContext.getContext(Context.EXPECTED_DATA).toString().toLowerCase();
        Assert.assertTrue(actualBreadcrumbName.contains(expectedBreadcrumbName));

        Assert.assertTrue(productDetailPage.moreBreadcrumbIsDisplayed());
    }
}
