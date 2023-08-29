package testCases;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.ProductsPages;


public class ProductsTestCases extends BasePage {
    private ProductsPages productsPages;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        productsPages = new ProductsPages(driver);
    }


    @Test

    public void AddToCartAndRefreshThePage() throws InterruptedException {
        productsPages.AddToCartFirstProduct();
        productsPages.AddToCartSecondProduct();
        productsPages.AddToCartThirdProduct();
        productsPages.ClickToResetThePage();
        Assert.assertEquals("The products are no longer added in cart." , "The products are no longer added in cart.");
    }


    @Test
    public void LoginAndResetTheSite() throws InterruptedException{
        productsPages.ClickToLoginButton();
        productsPages.ClickToUsername();
        productsPages.ClickToWriteUsername("dino");
        productsPages.ClickToPassword();
        productsPages.ClickToWritePassword("choochoo");
        productsPages.ClickToLogin();
        productsPages.ClickToSearch();
        productsPages.SearchByLetter("s");
        productsPages.ClickToFinishToSearch();

    }



}
