package testCases;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginDemoShopPages;


public class LoginDemoShopTestCases extends BasePage {
    private LoginDemoShopPages loginDemoShopPages;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        loginDemoShopPages = new LoginDemoShopPages(driver);
    }
    @Test
    public void ClickOnLoginButtonOnly() throws InterruptedException{
        loginDemoShopPages.ClickOnLoginIcon();
    }

    @Test
    public void LoginNormalUserAccountTest() throws InterruptedException{
        loginDemoShopPages.ClickOnLoginIcon();
        loginDemoShopPages.ClickOnInsertUsername();
        loginDemoShopPages.WriteUsernameDino("dino");
        loginDemoShopPages.ClickOnInsertPassword();
        loginDemoShopPages.WritePasswordChoochoo("choochoo");
        loginDemoShopPages.ClickOnFinishLoginAccountButton();

    }

    @Test
    public void ClickOnDinoIconAfterLogin() throws InterruptedException{
        loginDemoShopPages.ClickOnLoginIcon();
        loginDemoShopPages.ClickOnInsertUsername();
        loginDemoShopPages.WriteUsernameDino("dino");
        loginDemoShopPages.ClickOnInsertPassword();
        loginDemoShopPages.WritePasswordChoochoo("choochoo");
        loginDemoShopPages.ClickOnFinishLoginAccountButton();
        loginDemoShopPages.ClickOnAccountDinoIcon();
    }

    @Test
    public void LogOutFromAccount() throws InterruptedException{
        loginDemoShopPages.ClickOnLoginIcon();
        loginDemoShopPages.ClickOnInsertUsername();
        loginDemoShopPages.WriteUsernameDino("dino");
        loginDemoShopPages.ClickOnInsertPassword();
        loginDemoShopPages.WritePasswordChoochoo("choochoo");
        loginDemoShopPages.ClickOnFinishLoginAccountButton();
        loginDemoShopPages.ClickOnLogOutButton();
        Assert.assertEquals("Account is successfully logged out" , "Account is successfully logged out");
    }




    }

