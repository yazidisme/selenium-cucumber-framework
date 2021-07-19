package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Wait;

import java.util.List;

public class ProductDetailPage {

    private final WebDriver webDriver;

    public ProductDetailPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//div[contains(@class,'slick-initialized')]")
    private List<WebElement> allProductImageList;

    @FindBy(xpath = "//h1")
    private WebElement namaProductDetail;

    @FindBy(xpath = "//i[contains(@name,'star')]//parent::a//parent::a//preceding-sibling::span")
    private WebElement skuProductDetail;

    @FindBy(xpath = "//i[contains(@name,'star')]//parent::a")
    private WebElement starProductDetail;

    @FindBy(xpath = "//label[contains(text(),'Harga')]//following-sibling::div//h4")
    private WebElement hargaProductDetail;

    @FindBy(xpath = "//label[contains(text(),'Cicilan')]//following-sibling::div")
    private WebElement cicilanProductDetail;

    @FindBy(xpath = "//label[contains(text(),'Jumlah')]//following-sibling::div")
    private WebElement jumlahProductDetail;

    @FindBy(xpath = "//input[@data-te-id='input-purchase-quantity']")
    private WebElement jumlahProductDetailInput;

    @FindBy(xpath = "//label[contains(text(),'Informasi Toko')]//following-sibling::div")
    private WebElement informasiTokoProductDetail;

    @FindBy(xpath = "//div[contains(@class,'scrollarea')]")
    private WebElement overviewPanel;

    @FindBy(xpath = "//i[@name='envelope']")
    private WebElement emailButton;

    @FindBy(xpath = "//span[contains(text(),'Beli') or contains(text(),'Pre Order')]//parent::button")
    private WebElement beliButton;

    @FindBy(xpath = "//label[contains(text(),'Stok')]//following-sibling::div")
    private WebElement stokProductDetail;

    @FindBy(xpath = "//label[contains(text(),'Estimasi')]//following-sibling::div")
    private WebElement estimasiProductDetail;

    @FindBy(xpath = "//span[contains(text(),'Keranjang')]//parent::button")
    private WebElement tambahKerangjangButton;

    @FindBy(xpath = "//i[@name='home']//parent::a//parent::div//following-sibling::div")
    private List<WebElement> allBreadcrumbProductDetail;

    @FindBy(xpath = "//i[@name='more']")
    private WebElement moreButtonBreadcrumb;

    public boolean defaultProductDetailPageIsDisplayed() {
        Wait.untilAjaxCallIsDone(webDriver, 10L);
        allProductImageList.get(0).isDisplayed();
        namaProductDetail.isDisplayed();
        skuProductDetail.isDisplayed();
        starProductDetail.isDisplayed();
        hargaProductDetail.isDisplayed();
        cicilanProductDetail.isDisplayed();
        jumlahProductDetail.isDisplayed();
        jumlahProductDetailInput.isDisplayed();
        informasiTokoProductDetail.isDisplayed();
        overviewPanel.isDisplayed();
        emailButton.isDisplayed();
        beliButton.isDisplayed();
        return true;
    }

    public boolean nonFisikProductDetailDataIsDisplayed() {
        stokProductDetail.isDisplayed();
        return true;
    }

    public boolean fisikProductDetailDataIsDisplayed() {
        estimasiProductDetail.isDisplayed();
        tambahKerangjangButton.isDisplayed();
        return true;
    }

    public String getAllBreadcrumbName(int index) {
        allBreadcrumbProductDetail.get(index).isDisplayed();
        return allBreadcrumbProductDetail.get(index).getText();
    }

    public boolean moreBreadcrumbIsDisplayed() {
        moreButtonBreadcrumb.isDisplayed();
        return true;
    }
}
