package testCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.WishlistPage;

public class WishlistTestCases extends BasePage {
    private WishlistPage wishlistPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        wishlistPage= new WishlistPage(driver);
    }


    @Test
    public void clickOnAwesomeGraniteChipsHeartIcon() throws InterruptedException {
        wishlistPage.ClickOnAwesomeGraniteChips();
        wishlistPage.ClickOnAwesomeGraniteChipsHeartIcon();

    }


    @Test
    public void OpenWishlistIcon() throws InterruptedException {
        wishlistPage.ClickOnOpenWishlistIcon();

    }


    @Test
    public void RemoveFromWishlistItems() throws InterruptedException{
        wishlistPage.ClickOnPutOnWishlistAwesomeMetalChair();
        wishlistPage.ClickOnPutOnWishlistAwesomeSoftShirt();
        wishlistPage.ClickOnPutOnWishlistGorgeousSoftPizza();
        wishlistPage.ClickOnOpenWishlistIcon();
        wishlistPage.ClickOnDeleteFromWishlistAwesomeMetalChair();
        wishlistPage.ClickOnDeleteFromWishlistAwesomeSoftShirt();
        wishlistPage.ClickOnDeleteFromWishlistGorgeousSoftPizza();
        Assert.assertEquals("The items are sucessfully removed from wishlist" , "The items are sucessfully removed from wishlist");}


    @Test
    public void AddToCartProductFromWishlist() throws InterruptedException{
        wishlistPage.ClickOnRefinedFrozenMouseAddToWishlist();
        wishlistPage.ClickOnOpenWishlistIcon();
        wishlistPage.ClickOnAddToCartFromWishlistRefinedFrozenMouse();
        wishlistPage.ClickOnShoppingCartIcon();

    }






    }










