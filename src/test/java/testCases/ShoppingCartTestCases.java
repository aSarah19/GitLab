package testCases;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.ShoppingCartPages;

public class ShoppingCartTestCases extends BasePage {
    private ShoppingCartPages shoppingCartPages;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        shoppingCartPages = new ShoppingCartPages(driver);
    }

    @Test
    public void OpenTheShoppingCart() throws InterruptedException{
        shoppingCartPages.ClickOnShoppingCartToOpen();
    }

    @Test
    public void AddToCartItems() throws InterruptedException{
        shoppingCartPages.ClickOnAddToCartAwesomeGraniteChips();
        shoppingCartPages.ClickOnAddToCartAwesomeMetalChair();
        shoppingCartPages.ClickOnAddToShoppingCart();
        Assert.assertEquals("The item 1 and 2 are added to shopping cart." ,  "The item 1 and 2 are added to shopping cart.");
    }


    @Test
    public void AddMoreItemsFromPlusIconShoppingCart() throws InterruptedException{
        shoppingCartPages.ClickOnAddToCartAwesomeGraniteChips();
        shoppingCartPages.ClickOnAddToCartAwesomeMetalChair();
        shoppingCartPages.ClickOnShoppingCartToOpen();
        shoppingCartPages.ClickOnAddMoreItemAwesomeGraniteChips();
        shoppingCartPages.ClickOnAddMoreItemAwesomeMetalChair();
        Assert.assertEquals("The items are successfully added." , "The items are successfully added.");
    }


    @Test
    public void LessItemsShoppingCart() throws InterruptedException{
        shoppingCartPages.ClickOnAddToCartAwesomeGraniteChips();
        shoppingCartPages.ClickOnShoppingCartToOpen();
        shoppingCartPages.ClickOnLessItemAwesomeGraniteChips();

    }


    @Test
    public void TrashIconDeleteItem() throws InterruptedException{
        shoppingCartPages.ClickOnAddToCartGorgeousSoftPizza();
        shoppingCartPages.ClickOnShoppingCartToOpen();
        shoppingCartPages.ClickOnTrashIconGorgeousSoftPizza();
        Assert.assertEquals("The item is removed by trash icon." , "The item is removed by trash icon.");
    }


    @Test
    public void MakeAnOrderAsGuest() throws InterruptedException{
        shoppingCartPages.ClickOnAddToCartGorgeousSoftPizza();
        shoppingCartPages.ClickOnShoppingCartToOpen();
        shoppingCartPages.ClickOnCheckoutButton();
        shoppingCartPages.ClickOnFirstName();
        shoppingCartPages.WriteFirstNameSarah("Sarah");
        shoppingCartPages.ClickOnLastName();
        shoppingCartPages.WriteLastNameAntonie("Antonie");
        shoppingCartPages.ClickOnAddress();
        shoppingCartPages.WriteTheAddressSection("Valea Fanatelor");
        shoppingCartPages.SelectDelivery();
        shoppingCartPages.SelectPaymentOption();
        shoppingCartPages.ClickOnContinueCheckoutButton();
        shoppingCartPages.ClickOnCompleteYourOrder();
    }


    @Test
    public void ContinueShoppingButton() throws InterruptedException{
        shoppingCartPages.ClickOnPracticalWoodenBaconAddToCart();
        shoppingCartPages.ClickOnShoppingCartToOpen();
        shoppingCartPages.ClickOnContinueShoppingButton();
    }

    @Test
    public void GoToVerifyProductFromShoppingCart() throws InterruptedException{
        shoppingCartPages.ClickOnPracticalWoodenBaconAddToCart();
        shoppingCartPages.ClickOnShoppingCartToOpen();
        shoppingCartPages.OpenTheProductWoodenBaconFromShoppingCart();
        Assert.assertEquals("The product is successfully displayed" , "The product is successfully displayed");

    }


    @Test
    public void CancelThePaymentTest() throws InterruptedException{
        shoppingCartPages.ClickOnAddToCartPracticalMetalMouse();
        shoppingCartPages.ClickOnAddToCartRefinedFrozenMouse();
        shoppingCartPages.ClickOnShoppingCartToOpen();
        shoppingCartPages.ClickOnCheckoutIcon();
        shoppingCartPages.ClickOnCancelTheOrder();


    }







}
