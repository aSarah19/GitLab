package testCases;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.DemoShopPage;
import pages.ShoppingCartPages;

public class ShoppingCartTestCases extends BasePage {
    private ShoppingCartPages shoppingCartPages;

    @BeforeClass
    public void setUp() {
        super.setUp();
        shoppingCartPages = new ShoppingCartPages(driver);
    }

    @Test
    public void ClickOnlyOnShoppingCart() throws InterruptedException{
        shoppingCartPages.ClickOnShoppingCartToOpen();
    }

    @Test
    public void ClickOnAddToCartItems() throws InterruptedException{
        shoppingCartPages.ClickOnAddToCartAwesomeGraniteChips();
        shoppingCartPages.ClickOnAddToCartAwesomeMetalChair();
        shoppingCartPages.ClickOnAddToShoppingCart();
        Assert.assertEquals("The item 1 and 2 are added to shopping cart." ,  "The item 1 and 2 are added to shopping cart.");
    }


    @Test
    public void AddMoreItemsShoppingCart() throws InterruptedException{
        shoppingCartPages.ClickOnAddToCartAwesomeGraniteChips();
        shoppingCartPages.ClickOnAddToCartAwesomeMetalChair();
        shoppingCartPages.ClickOnShoppingCartToOpen();
        shoppingCartPages.ClickOnAddMoreItemAwesomeGraniteChips();
        shoppingCartPages.ClickOnAddMoreItemAwesomeMetalChair();
        Assert.assertEquals("The item is successful added." , "The item is successful added.");
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
    public void CompleteYourOrder() throws InterruptedException{
        shoppingCartPages.ClickOnGorgeousSoftPizza();
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
        shoppingCartPages.ClickOnContinueShoppingButton();



    }


}
